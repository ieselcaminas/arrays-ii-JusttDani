package main;

import utils.Utilidades;

import java.util.Arrays;
import java.util.Scanner;

public class Eliminar {
    public static void main(String[] args) {
        int[] array = new int[10];
        Utilidades.rellenaArray(array,0,10);
        System.out.println(Arrays.toString(array));
        eliminar(array,20);
        System.out.println();
        System.out.print(Arrays.toString(array));

    }
    public static int[] eliminar(int[] array, int index) {
        if (index > array.length) {
            System.out.println("Ese indice se pasa del rollo, dame otro: ");
            Scanner sc = new Scanner(System.in);
            index = sc.nextInt();
        }
            int numeroborrar = array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = numeroborrar;
     return array;
    }

}