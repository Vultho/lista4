package com.company;

public class exercicio7 {
    public static void main(String[] args) {
        int[] numeros={2,5,1,3,4};
        int soma= numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
        int multi= numeros[0] * numeros[1] * numeros[2] * numeros[3] * numeros[4];
        for (int i=0 ; i< numeros.length; i++) {
            System.out.println("os numeros dados sao " + numeros[i]);

        }
        System.out.println("a soma dos numeros é " + soma);
        System.out.println("a multiplicaçao dos numeros é " + multi);
    }

}
