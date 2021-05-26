package company;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        int notas[] = new int[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota");
            Scanner myno = new Scanner(System.in);
            notas[i] = myno.nextInt();



        }
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + ", ");

        }
        int media= notas[0] + notas[1] + notas[2] + notas[3] / 4;
        System.out.println("A media é " + media);
    }
}