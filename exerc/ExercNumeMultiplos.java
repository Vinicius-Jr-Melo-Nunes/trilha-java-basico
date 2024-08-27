import java.util.Scanner;

public class ExercNumeMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA;
        int numB;

        System.out.println("Digite o primeiro número: ");
        numA = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numB = sc.nextInt();

        if (numA % numB == 0 || numB % numA == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
