import java.util.Scanner;
public class Qdois {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        float[] numeros = new float[10];
        System.out.println("--------------------------");
            for(int i = 0; i < numeros.length; i++){
                System.out.println("Digite o " + (i+1) + "º numero");
                numeros[i] = sc.nextFloat();
            }
            System.out.println("----------------------------");
            System.out.println("Mostre os numeros inversos");
            for(int i = numeros.length - 1; i >= 0; i--){
                System.out.println(numeros[i]);
                
            }



    sc.close();

    }
}