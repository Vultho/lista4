package company;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        float[][] notasAlunos = new float[10][4];
        float[] alunosMedia = new float[10];
        int alunosMedia7 = 0;

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Aluno " + i  + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.println((j + 1) + " Bimestre, ");
                Scanner myObj = new Scanner(System.in);
                notasAlunos[i][j] = myObj.nextFloat();
            }
        }
        for( int i=0; i< 10 ; i++){
            for(int m=0; m <4; m++){
                alunosMedia[i]= alunosMedia[i] + notasAlunos[i][m];
            }
            alunosMedia[i]= alunosMedia[i]/4;
        }
        System.out.println("Alunos com nota maior que 7.0: ");
        for (int i=0; i<10; i++){
            if(alunosMedia[i] >= 7){
                alunosMedia7++;
            }
        }
        System.out.println("Alunos com media maior ou iqual a 7: " + alunosMedia7);
    }
}
