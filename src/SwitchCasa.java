import java.util.Scanner;

public class SwitchCasa {

	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String day;
		
		switch (x) {
		case 1:
			day = "Segunda";
			break;
		case 2:
			day =  "Ter�a";
			break;
		case 3:
			day = "Quarta";
			break;
		case 4:
			day = "Quinta";
			break;
		case 5:
			day = "Sexta";
			break;
		case 6:
			day = "S�bado";
			break;
		case 7:
			day = "Domingo";
			break;
		default:
			day = "N�mero Invalido";
		}
		System.out.println("Dia da semana: "+ day);
		}

	}


