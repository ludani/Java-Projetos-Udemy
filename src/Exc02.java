import java.util.Scanner;

public class Exc02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Qual é a quantidade de clisoce no sangue? ");
				double gli = sc.nextDouble();
				
			if (gli <= 100) {
				System.out.println("Normal :"+ gli);
				
			}else if ( gli <= 140) {
				System.out.println("Média :" + gli);
				
			} else {
				System.out.println("Diabete :" + gli);
				
				sc.close();
			}

	}

}
