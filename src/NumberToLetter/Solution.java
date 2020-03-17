package HBSC;

import java.util.ArrayList;

public class Solution{
	//两个字符串的拼接
	public ArrayList<String> StrCombStr(String str1, String str2) {
    	ArrayList<String> list=new ArrayList<>();
    	int num1=str1.length();
    	int num2=str2.length();
    	
    	if(num1==1) {
    		if(num2==1) {
    			list.add(str1+str2);
    		}else if(num2==3) {
    			list.add(str1+str2.substring(0,1));
    			list.add(str1+str2.substring(1,2));
    			list.add(str1+str2.substring(2,3));
    		}else if(num2==4) {
    			list.add(str1+str2.substring(0,1));
    			list.add(str1+str2.substring(1,2));
    			list.add(str1+str2.substring(2,3));
    			list.add(str1+str2.substring(3,4));
    		}
    		
    	}else if(num1==2) {
    		if(num2==1) {
    			list.add(str1.substring(0,1)+str2);
    			list.add(str1.substring(1,2)+str2);
    		}else if(num2==3) {
    			list.add(str1.substring(0,1)+str2.substring(0,1));
    			list.add(str1.substring(0,1)+str2.substring(1,2));
    			list.add(str1.substring(0,1)+str2.substring(2,3));
    			list.add(str1.substring(1,2)+str2.substring(0,1));
    			list.add(str1.substring(1,2)+str2.substring(1,2));
    			list.add(str1.substring(1,2)+str2.substring(2,3));
    		}else if(num2==4) {
    			list.add(str1.substring(0,1)+str2.substring(0,1));
    			list.add(str1.substring(0,1)+str2.substring(1,2));
    			list.add(str1.substring(0,1)+str2.substring(2,3));
    			list.add(str1.substring(0,1)+str2.substring(3,4));
    			list.add(str1.substring(1,2)+str2.substring(0,1));
    			list.add(str1.substring(1,2)+str2.substring(1,2));
    			list.add(str1.substring(1,2)+str2.substring(2,3));
    			list.add(str1.substring(1,2)+str2.substring(3,4));
    		}
    		
    	}else if(num1==3) {
    		if(num2==1) {
    			list.add(str1.substring(0,1)+str2);
    			list.add(str1.substring(1,2)+str2);
    			list.add(str1.substring(2,3)+str2);
    		}else if(num2==3) {
    			list.add(str1.substring(0,1)+str2.substring(0,1));
    			list.add(str1.substring(0,1)+str2.substring(1,2));
    			list.add(str1.substring(0,1)+str2.substring(2,3));

    			list.add(str1.substring(1,2)+str2.substring(0,1));
    			list.add(str1.substring(1,2)+str2.substring(1,2));
    			list.add(str1.substring(1,2)+str2.substring(2,3));

    			list.add(str1.substring(2,3)+str2.substring(0,1));
    			list.add(str1.substring(2,3)+str2.substring(1,2));
    			list.add(str1.substring(2,3)+str2.substring(2,3));
    		}else if(num2==4) {
    			list.add(str1.substring(0,1)+str2.substring(0,1));
    			list.add(str1.substring(0,1)+str2.substring(1,2));
    			list.add(str1.substring(0,1)+str2.substring(2,3));
    			list.add(str1.substring(0,1)+str2.substring(3,4));

    			list.add(str1.substring(1,2)+str2.substring(0,1));
    			list.add(str1.substring(1,2)+str2.substring(1,2));
    			list.add(str1.substring(1,2)+str2.substring(2,3));
    			list.add(str1.substring(1,2)+str2.substring(3,4));

    			list.add(str1.substring(2,3)+str2.substring(0,1));
    			list.add(str1.substring(2,3)+str2.substring(1,2));
    			list.add(str1.substring(2,3)+str2.substring(2,3));
    			list.add(str1.substring(2,3)+str2.substring(3,4));
    		}
    		
    	}else if(num1==4){

    		if(num2==1) {
    			list.add(str1.substring(0,1)+str2);
    			list.add(str1.substring(1,2)+str2);
    			list.add(str1.substring(2,3)+str2);
    			list.add(str1.substring(3,4)+str2);
    		}else if(num2==3) {
    			list.add(str1.substring(0,1)+str2.substring(0,1));
    			list.add(str1.substring(0,1)+str2.substring(1,2));
    			list.add(str1.substring(0,1)+str2.substring(2,3));
    			list.add(str1.substring(0,1)+str2.substring(3,4));

    			list.add(str1.substring(1,2)+str2.substring(0,1));
    			list.add(str1.substring(1,2)+str2.substring(1,2));
    			list.add(str1.substring(1,2)+str2.substring(2,3));
    			list.add(str1.substring(1,2)+str2.substring(3,4));

    			list.add(str1.substring(2,3)+str2.substring(0,1));
    			list.add(str1.substring(2,3)+str2.substring(1,2));
    			list.add(str1.substring(2,3)+str2.substring(2,3));
    			list.add(str1.substring(2,3)+str2.substring(3,4));
    		}else if(num2==4) {
    			list.add(str1.substring(0,1)+str2.substring(0,1));
    			list.add(str1.substring(0,1)+str2.substring(1,2));
    			list.add(str1.substring(0,1)+str2.substring(2,3));
    			list.add(str1.substring(0,1)+str2.substring(3,4));
    			list.add(str1.substring(0,1)+str2.substring(4,5));

    			list.add(str1.substring(1,2)+str2.substring(0,1));
    			list.add(str1.substring(1,2)+str2.substring(1,2));
    			list.add(str1.substring(1,2)+str2.substring(2,3));
    			list.add(str1.substring(1,2)+str2.substring(3,4));
    			list.add(str1.substring(1,2)+str2.substring(4,5));

    			list.add(str1.substring(2,3)+str2.substring(0,1));
    			list.add(str1.substring(2,3)+str2.substring(1,2));
    			list.add(str1.substring(2,3)+str2.substring(2,3));
    			list.add(str1.substring(2,3)+str2.substring(3,4));
    			list.add(str1.substring(2,3)+str2.substring(4,5));
    		}
    	}
    	return list;
    	
    }

	//数组集合与字符串拼接
	public ArrayList<String> AlCombStr(ArrayList<String> list, String str2) {
    	int num=list.size();
    	int length=str2.length();
    	ArrayList<String> result=new ArrayList<>();
    	for(int i=0;i<num;i++) {
    		if(length==1) {
    			result.add(list.get(i)+str2);
    		}else if(length==3) {
    			result.add(list.get(i)+str2.substring(0,1));
    			result.add(list.get(i)+str2.substring(1,2));
    			result.add(list.get(i)+str2.substring(2,3));
    		}else if(length==4) {
    			result.add(list.get(i)+str2.substring(0,1));
    			result.add(list.get(i)+str2.substring(1,2));
    			result.add(list.get(i)+str2.substring(2,3));
    			result.add(list.get(i)+str2.substring(3,4));
    		}
    		
    	}
    	return result;
    }

}
