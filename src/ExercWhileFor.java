import java.util.Scanner;

public class ExercWhileFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 	
		System.out.println("Entre com um número posito: ");
		int x = sc.nextInt();
		//int y = sc.nextInt();
			while(x >= 0) {
				System.out.println("Número Positivo: ");
			}for (int i = 1; i < x; i++) {
				System.out.println("Valor é positivo: ");
			}
			sc.close();
		}

}
