import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = input.nextInt();
		System.out.println("Digite outro numero");
		int numero2 = input.nextInt();
		
		if (numero < numero2) {
			System.out.println(numero + "," + numero2);
		} else {
			System.out.println(numero2 + "," + numero);
		}
	}
	
}
