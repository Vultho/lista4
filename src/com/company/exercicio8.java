package company;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        float[][] idade = new float[5][2];
        float reverso;


        for (int p = 0; p < idade.length; p++) {
            System.out.println("pessoa " + (p + 1));
            for (int i = 0; i < 2; i++) {
                System.out.print("sua Idade e Altura : ");
                Scanner idad = new Scanner(System.in);
                idade[p][i] = idad.nextFloat();
            }
            // termina


        }
        }
    }
