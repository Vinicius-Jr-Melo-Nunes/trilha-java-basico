import java.util.Scanner;

public class ExercNumParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Digite um número:");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Este número é par.");
        } else {
            System.out.println("Este número é impar");
        }
        sc.close();
    }
}
