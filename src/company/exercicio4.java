package company;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[]args){

        char[] vet = new char[10];
        int count = 0;

        for (int i=0; i < vet.length; i++){
            System.out.println("Digite as letras");
            Scanner letras= new Scanner(System.in);
            vet[i]= letras.next().charAt(0);
            if((vet[i] !='a') && (vet[i] != 'e') && (vet[i] != 'i') &&
                    (vet[i] != 'o') && (vet[i] != 'u')){
                count = count + 1;
                System.out.println(vet[i]);

            }
        }
        System.out.println("numero de consoante  ");
        System.out.print(count);
    }
}