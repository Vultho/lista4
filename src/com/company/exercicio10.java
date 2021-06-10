package com.company;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorJunto = new int[20];
        int pos = 0;
        int pos2 = 0;

        for (int i = 0; i < vetor1.length; pos++, i++) {
            System.out.println("Digite os Valores do vetor 1 " + " Posição " + (pos + 1));
            Scanner veto1 = new Scanner(System.in);
            vetor1[i] = veto1.nextInt();
        }
        for (int i = 0; i < vetor2.length; pos2++, i++) {
            System.out.println("Digite os Valores do vetor 2 " + " Posição " + (pos2 + 1));
            Scanner veto2 = new Scanner(System.in);
            vetor2[i] = veto2.nextInt();
        }
        System.out.println("Vetores Juntos");
        int n = 0;
        int j = 0;
        while (n < vetorJunto.length) {
            vetorJunto[n] = vetor1[j];
            n++;
            vetorJunto[n] = vetor2[j];
            n++;
            j++;

        }
        for (int i = 0; i < vetorJunto.length; i++) {
            System.out.print(vetorJunto[i] + ", ");
        }
    }
}
