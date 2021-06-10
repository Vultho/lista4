package com.company;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        int numeros[] = new int[20];

        for(int i=0; i< numeros.length; i++){
            System.out.println("Digite um numero");
            Scanner num= new Scanner(System.in);
            numeros[i]= num.nextInt();
        }
        for (int i= 0; i< numeros.length; i++){
            if (numeros[i] % 2 ==0) {
                System.out.println("O vetor na posiçao " + i + " com o valor " + numeros[i] + " é par");
            }
            else{
                System.out.println("O vetor na posiçao " + i + " com o valor " + numeros[i] + " é impar");
            }
            }
        }
     }
