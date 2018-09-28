import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Entre com um número Positivo: ");
		int n = sc.nextInt();
		while(n <= 0) {
			System.out.println("n impossicvel");
			n = sc.nextInt();
		}
		int higher = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			System.out.println("Valor #" + i + ":");
			int x = sc.nextInt();
			if(x > higher) {
				higher = x;
			}
		}
		System.out.println("Higher = "+higher);
		sc.close();
	}

}