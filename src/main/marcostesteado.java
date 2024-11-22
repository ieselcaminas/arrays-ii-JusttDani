package main;

import java.util.Arrays;

public class marcostesteado {
    public static void main(String[] args) {
        String[] texto = {"yckf", "ejfjyjjrtrs", "ujtn", "ejemplo"};
        for (int i = 0; i < marco(texto,max(texto)).length; i++) {
        System.out.println(marco(texto,max(texto))[i]);
        }

    }
    public static int max(String[] a){
        int max = a[0].length();
        for (int i = 1; i < a.length; i++) {
            if (max < a[i].length()) {
                max = a[i].length();
            }

        }
        return max;
    }
    public static String[] marco(String[] a, int n) {
        String estrella = "*";
        String espacio = " ";
        int longitu = n + 4;
        String[] resultado2 = new String[a.length + 2];
        for (int i = 0; i < a.length + 2; i++) {
            resultado2[i] = "";
        }
        for (int i = 0; i < longitu ; i++) {
            resultado2[0] += estrella;
            resultado2[resultado2.length-1] += estrella;
        }
        for (int i = 1; i < resultado2.length-1; i++) {
            resultado2[i] += estrella + espacio + a[i-1];
            int z = resultado2[i].length();
            for (int j = 0; j <longitu - z - 1 ; j++) {
                resultado2[i] += espacio;
            }
            resultado2[i] += estrella;
        }
        return resultado2;
    }
}
