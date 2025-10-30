import java.util.Scanner;
public class Qtres {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        System.out.println("LANÇAMENTO DE NOTAS.");
        System.out.println("-----------------------------");
        System.out.print("Digite sua primeira nota: ");
        int n1 = sc.nextInt();
        System.out.print("Digite sua segunda nota: ");
        int n2 = sc.nextInt();
        System.out.print("Digite sua terceira nota: ");
        int n3 = sc.nextInt();
        System.out.print("Digite sua quarta nota: ");
        int n4 = sc.nextInt();

            int media = (n1 + n2 + n3 + n4)/4;
                System.out.print("A media de suas notas foi " + media);


        
    sc.close();


    }
}
