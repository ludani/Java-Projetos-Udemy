import java.util.Scanner;

public class Exc04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor inteiro: ");
		int n = sc.nextInt();
		
		while (n != 0) {
			int square = n * n;
			System.out.println(square);
			System.out.println("Entre com outro valor inteiro :");
			n = sc.nextInt();
		
			}
		sc.close();
		}
}
