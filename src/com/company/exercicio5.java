package com.company;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        int numeros[] = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("valores posto no vetor");
            Scanner num = new Scanner(System.in);
            numeros[i] = num.nextInt();


        }


    }
}