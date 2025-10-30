import java.util.Scanner;

public class Qquatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = new char[10];
        int cont = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º caractere: ");
            letras[i] = sc.next().toLowerCase().charAt(0);
        }

        System.out.print("Consoantes: ");
        for (int i = 0; i < 10; i++) {
            if (letras[i] != 'a' && letras[i] != 'e' && letras[i] != 'i' && letras[i] != 'o' && letras[i] != 'u') {
                System.out.print(letras[i] + " ");
                cont++;
            }
        }

        System.out.println("Quantidade de consoantes: " + cont);
        sc.close();
    }
}
