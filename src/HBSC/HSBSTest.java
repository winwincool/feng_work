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
        String input="";//输入
        
        Solution sol=new Solution();

        Map<String, String> map = new HashMap<String, String>() {
			private static final long serialVersionUID = 1L;
			/**
			 *  //数字与英文的映射表
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
            System.out.print("请输入一个大于等于0的正整数（输入-1退出程序）：");
            input = sc.nextLine();
            String regEx = "^[0-9]*[0-9]";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(input);
        	
        	if("-1".equals(input)) {
        		System.out.println("程序已退出！");
        		return ;
        	}else if(!m.matches()) {
                System.out.print("非法字符，请重新输入：\n");
                continue;
        	}else {
        		
        		ArrayList<String> list=new ArrayList<>();
        		for(int i=0;i<input.length();i++) {
        			list.add(map.get(input.substring(i,i+1)));
        		}
        		
        		
        		ArrayList<String> result=new ArrayList<>();
        		int length=input.length();
        		System.out.println("length:"+length);
        		if(length==1) {//用户只输入一位数字
            		System.out.println("output:"+map.get(input));
        		}else if(length==2) {//用户输入两位数字
        			result=sol.StrCombStr(map.get(input.substring(0,1)),map.get(input.substring(1,2)));
            		System.out.println("output:"+result);
        		}else if(length>2){//用户输入两位以上的数字
        			result=sol.StrCombStr(map.get(input.substring(0,1)),map.get(input.substring(1,2)));
        			//将之前的集合与之后的(1个或多个)字符串（映射后的）拼接
        			for(int i=2;i<length;i++) {
        				result=sol.AlCombStr(result,map.get(input.substring(i,i+1)));
        			}
            		System.out.println("output:"+result);
        		}
        		
        	}
        }
    }
    
    
}