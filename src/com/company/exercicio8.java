package com.company;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        float[][] idade = new float[5][2];
        float reverso;


        for (int p = 0; p < idade.length; p++) {
            System.out.println("pessoa " + (p + 1) + "\nIdade: ");
            Scanner idad = new Scanner(System.in);
            idade[p][0] = idad.nextFloat();
            System.out.println("Altura: ");
            idade[p][1] = idad.nextFloat();
        }
        for (int i = 4; i > -1; i--) {
            System.out.println("Pessoa " + (i + 1) + "\nIdade: " + idade[i][0] + " | Altura: " + idade[i][1]);

        }
    }
}

