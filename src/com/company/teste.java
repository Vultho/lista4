package com.company;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        int parPosicao = -1;
        int impPosicao = -1;
        int[] allNum = new int[20];
        int[] numPar = new int[20];
        int[] numImp = new int[20];
        boolean numVerifB = false;

        for (int i=0; i< allNum.length; i++){
            System.out.print("Valor a ser colocado dentro do Vetor: ");
            Scanner myObj = new Scanner(System.in);
            allNum[i] = myObj.nextInt();
        }
        for (int i=0; i<allNum.length; i++){

            int numVerif = allNum[i];

            numVerifB = true;

            while (numVerifB) {
                if (numVerif == 0) {
                    parPosicao++;
                    numPar[parPosicao] = allNum[i];
                    numVerifB = false;
                    break;
                } else if (numVerif == 1) {
                    impPosicao++;
                    numImp[impPosicao] = allNum[i];
                    numVerifB = false;
                    break;
                } else {
                    numVerif = numVerif - 2;
                }
            }
        }
        System.out.print("Numeros Digitado: ");
        for (int i=0; i< allNum.length; i++){
            System.out.print(allNum[i] + ", ");
        }
        System.out.print("\nNumeros Pares digitados: ");
        for (int i=0; i< numPar.length; i++){
            if (numPar[i] != 0){
                System.out.print(numPar[i] + ", ");
            }
        }
        System.out.print("\nNumeros Impar digitados: ");
        for (int i=0; i< numImp.length; i++){
            if (numImp[i] != 0){
                System.out.print(numImp[i] + ", ");
            }
        }
        System.out.println();
    }
}