import java.util.Scanner;
public class Qum {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] numeros = new int[5];
    
        for (int i = 0; i < numeros.length; i++){
        System.out.println("Digite um numero: ");
        numeros[i] = sc.nextInt(); 
        }   
    
        for(int i = 0; i < numeros.length; i++){
        System.out.println(numeros[i]);
        }
    
    sc.close();

    }
}