package HBSC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class HSBSTest {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String input="";//����
        
        Solution sol=new Solution();

        Map<String, String> map = new HashMap<String, String>() {
			private static final long serialVersionUID = 1L;
			/**
			 *  //������Ӣ�ĵ�ӳ���
			 */
			{
                put("1", "1");
                put("2", "abc");
                put("3", "def");
                put("4", "ghi");
                put("5", "jkl");
                put("6", "mno");
                put("7", "pqrs");
                put("8", "tuv");
                put("9", "wxyz");
                put("0", "0");
            }
        };
        
        
        while(true){
            System.out.print("������һ�����ڵ���0��������������-1�˳����򣩣�");
            input = sc.nextLine();
            String regEx = "^[0-9]*[0-9]";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(input);
        	
        	if("-1".equals(input)) {
        		System.out.println("�������˳���");
        		return ;
        	}else if(!m.matches()) {
                System.out.print("�Ƿ��ַ������������룺\n");
                continue;
        	}else {
        		
        		ArrayList<String> list=new ArrayList<>();
        		for(int i=0;i<input.length();i++) {
        			list.add(map.get(input.substring(i,i+1)));
        		}
        		
        		
        		ArrayList<String> result=new ArrayList<>();
        		int length=input.length();
        		System.out.println("length:"+length);
        		if(length==1) {//�û�ֻ����һλ����
            		System.out.println("output:"+map.get(input));
        		}else if(length==2) {//�û�������λ����
        			result=sol.StrCombStr(map.get(input.substring(0,1)),map.get(input.substring(1,2)));
            		System.out.println("output:"+result);
        		}else if(length>2){//�û�������λ���ϵ�����
        			result=sol.StrCombStr(map.get(input.substring(0,1)),map.get(input.substring(1,2)));
        			//��֮ǰ�ļ�����֮���(1������)�ַ�����ӳ���ģ�ƴ��
        			for(int i=2;i<length;i++) {
        				result=sol.AlCombStr(result,map.get(input.substring(i,i+1)));
        			}
            		System.out.println("output:"+result);
        		}
        		
        	}
        }
    }
    
    
}