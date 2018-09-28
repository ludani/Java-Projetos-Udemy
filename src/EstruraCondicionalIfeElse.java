import java.util.Scanner;

public class EstruraCondicionalIfeElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR ");
		}else {
			System.out.println("Impar ");
		}
		
		sc.close();
		
	}

}
