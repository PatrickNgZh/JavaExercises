package StringUsage;

public class testStringNull {
	public static void main(String[] args) {
		String str=null;
		System.out.println(str);
		str="1"+str;
		System.out.println(str);
		System.out.println("***************************************");
		String s1="";
		System.out.println(s1);
		s1=1+s1;
		System.out.println(s1);
		String temp="hello";
		String t2="you";
		String t3="xxx";//test the suffix
		System.out.println(temp+t2);
		System.out.println(t3+temp);
	}
}
