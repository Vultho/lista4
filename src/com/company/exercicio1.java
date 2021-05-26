package company;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        for(int i=0; i< numeros.length;i++){
            System.out.println("Digite um numero.");
            Scanner mynum= new Scanner(System.in);
            numeros[i]= mynum.nextInt();
        }
        for(int i=0; i< numeros.length; i++){
            System.out.print(numeros[i] +", ");
        }


    }
}
