package company;

public class exercicio9 {
    public static void main(String[] args) {
        int[] numeros= {20,10,32,15,10,17,20,8,9,56};
        int somaQuad= 0;

        for (int i= 0; i< numeros.length; i++){
            somaQuad += (numeros[i] * numeros[i]);
        }
        System.out.println("Soma total: " + somaQuad);
    }
}
