import java.util.Scanner;

public class DoWhille {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.println("Entre com um número: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Square root = %.3f%", sq);
			
			System.out.print("Repeat (y/n)?");
			 resp = sc.next().charAt(0);
		}while (resp != 'n');
		
		
		sc.close();
		}
	}


