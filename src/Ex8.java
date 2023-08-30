import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a hora de inicio");
		int h1 = input.nextInt();
		System.out.println("Digite a hora de término");
		int h2 = input.nextInt();
		int duracao = h2 - h1;
		
		if (duracao <= 24) {
			System.out.println("Duracao e igual a: " + " " + duracao +" horas");
		} else {
			System.out.println("Excedeu as 24 horas");
		}
	}

}
