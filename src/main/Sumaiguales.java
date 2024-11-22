package main;

import java.util.Scanner;

public class Sumaiguales {
    public static void main(String[] args) {
        int[] numeros = {2,5,8,5,34,1,97,7,5,4,9,0};
        System.out.println("Para que numeros quieres buscar las posibles combinaciones?: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(saumaigual(numeros, sc.nextInt()));

    }
    public static String saumaigual(int[] a, int objetivo) {
        String resultado = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == objetivo) {
                    resultado += a[i] + "+" + a[j] + ",";
                }
            }
        }
        return resultado;
    }
}
