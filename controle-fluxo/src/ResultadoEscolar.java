public class ResultadoEscolar {
    public static void main(String[] args) {
        int grade = 6;

        if (grade >= 7)
            System.out.println("Aprovado");

        else if (grade >= 5 && grade < 7)
            System.out.println("Prova de Recuperaçāo");
        else
            System.out.println("Reprovado");

    }
}
