import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class CalculoDeNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner entrada = new Scanner(System.in); //ENTRADA DE SCANNER
			
			int  n1, n2, n3, n4; //DECLARANDO CADA VARIAVEL
			int  soma;
			int  div;
			
		System.out.println("Digite o primeiro numero: ");
			n1 = entrada.nextInt();
		System.out.println("Digite o segundo numero ");
			n2 = entrada.nextInt();
		System.out.println("Digite o terceiro numero");
			n3 = entrada.nextInt();
		System.out.println("Digite o quarto numero");
			n4 = entrada.nextInt();
				soma = n1 + n2 + n3 + n4;
		System.out.println("O  resultado é: "+soma);
		
		System.out.println("O resultado Final é: "+ soma / 4);
		
		
		if (soma < 32 ) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado");
		}
			
		}
	}