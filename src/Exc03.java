import java.io.InputStream;
import java.util.Scanner;

public class Exc03 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com dois Números :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int begin = x, end = y;
				
				if (x < y) {
				begin = y;
				end = x;
			}
			 int sum = 0;
			 for (int i = begin; i <= end; i++) {
				if (i % 2 != 0) {
					sum += i;
				}
		
				 System.out.println("A soma dos números = " + sum);
				 sc.close();
			 	}
			}
	
		}

