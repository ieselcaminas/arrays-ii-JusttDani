package main;

import utils.Utilidades;

public class iguales {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        Utilidades.rellenaArray(array1,0,10 );
        Utilidades.rellenaArray(array2,0,10 );
        if(iguales(array1,array2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

    }
    public static boolean iguales(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
           if (a[i] != b[i]){
               return false;
           }
        }
        return true;
    }
}
