import java.util.Scanner;
public class Ex4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a 1a:");
        double numero = input.nextDouble();
        System.out.println("Digite a 2a:");
        double numero2 = input.nextDouble();
        double media = (numero + numero2) /2;
        if (media >= 6 ) {
            System.out.println("Aprovado" +" " + media);
        } else {
            System.out.println("Reprovado" + " " +media); 
        }
}
}