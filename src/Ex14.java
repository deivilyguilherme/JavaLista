import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.println("Digite um numero");
	int numero = input.nextInt();
	
	if (numero > 0) {
		System.out.println("Positivo");
	} else if (numero < 0) {
		System.out.println("Negativo");
	} else {
		System.out.println("Zero 0");
	}
	}

}