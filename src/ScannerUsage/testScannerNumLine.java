package ScannerUsage;

import java.util.Scanner;

public class testScannerNumLine {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		s.nextLine();//attention! the nextInt is just not filter enter
		String str =s.nextLine();//but the nextLine is workable
		System.out.println(i);
		System.out.println(str);
	}
	
}
