package com.company;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        char letras[] = new char[10];
        char vogais[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Digite as letras");
            Scanner le = new Scanner(System.in);
            letras[i] = le.next().charAt(0);
            // terminar...
        }
    }
}
