import java.util.Scanner;

public class Qseis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] medias = new double[10];
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a " + (j + 1) + "ª nota do aluno " + (i + 1) + ": ");
                soma += sc.nextDouble();
            }
            medias[i] = soma / 4;
            if (medias[i] >= 7) {
                contador++;
            }
        }

        System.out.println("Número de alunos com média maior ou igual a 7.0: " + contador);
        sc.close();
    }
}
