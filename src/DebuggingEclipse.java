import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class DebuggingEclipse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entre com três números: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int higher = max(a,b,c);
			
			ShowResult(higher);
			
			sc.close();
	}

	private static void ShowResult(int higher) {
		// TODO Auto-generated method stub
		
	}

	private static int max(int a, int b, int c) {
		// TODO Auto-generated method stub
		return 0;
	}

}
