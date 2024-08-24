import java.util.Scanner;

public class ExercNumerosInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.print("Este número é negativo.");

        } else {
            System.out.print("Este número é positivo");
        }
        sc.close();
    }
}
