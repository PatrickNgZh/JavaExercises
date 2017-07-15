package ScannerUsage;

import java.util.Scanner;

public class testScannerLIne {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()) {
			String src=s.nextLine();
			System.out.println(src);
		}
	}

}
