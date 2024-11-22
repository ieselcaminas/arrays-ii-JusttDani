package main;

import utils.Utilidades;

import java.util.Arrays;

public class Inverso {
    public static void main(String[] args) {
        int[] array = new int[10];
        Utilidades.rellenaArray(array,0,10);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copiainversa(array)));
    }
    public static int[] copiainversa(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - 1 - i];

        }
        return array2;
    }
}
