import java.util.Scanner;

public class FuncaoSintaxe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite 3 números: ?");
		
			int a = sc.nextInt();
				int b = sc.nextInt();
					int c = sc.nextInt();
		
					if (a > b && a > c) {
						System.out.println("Númro maior: "+ a);
					}else if (b > c) {
							System.out.println("Número maior: "+ b);
						}else {
							System.out.println("Número maior: "+ c);
						}
					
					
		sc.close();
	

		}
			public static int max(int x, int y, int z) {
				int aux;
				if (x > y && x > z) {
					aux = x;
				}else if (y > z) {
					aux = y;
				}else {
					aux =z;
				}
				return aux;
			}
			public static void ShowResult(int value) {
				System.out.println("Número: " + value);
			}
	}
