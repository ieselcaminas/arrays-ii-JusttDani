package main;

public class Duplicados {
    public static void main(String[] args) {
        int[] numericos = {9, 1, 2, 3, 9, 11, 2, 2, 2, 7, 7, 9, 4, 7};
        System.out.println(duplicados(numericos));

    }

    static String duplicados(int[] numeros) {
        String repe = "";
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j] && !repe.contains(numeros[i] + " " )) {
                    repe = repe.concat(numeros[i] + " ");

                }
            }
        }
        return repe;
    }
}
