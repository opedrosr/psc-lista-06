import java.util.Scanner;
public class Qcinco {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        int[] numeros = new int[20];
        
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite seu " + (i+1) + "° numero. ");
            numeros[i]=sc.nextInt();
        }

         for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        } 

        System.out.println("IMPARES");
        for(int i = 0; i < numeros.length; i++){
            if (i %2 == 0){
                System.out.println(numeros[i]);
            } 
        }
        System.out.println("PARES");
         for(int i = 0; i < numeros.length; i++){
            if (i %2 == 1){
                System.out.println(numeros[i]);
            } 
        }

        sc.close();



    }
}
