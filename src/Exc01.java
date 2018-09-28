import java.util.Scanner;

public class Exc01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Primeira nota ");
			double a = sc.nextDouble();
		System.out.println("Digite a Segunda nota ");
			double b = sc.nextDouble();
		System.out.println("Digite a Terceira nota ");
			double c = sc.nextDouble();
			
		double soma = a + b + c;
		System.out.println("O resultado é:  "+ soma);
		if (soma < 60) {
			System.out.println("Vc está reprovado! ");
			
		}else {
			System.out.println("Vc está aprovado! ");
		}
	}

}
