package main;

public class Comunes {
    public static void main(String[] args) {
        int[] primero = {2,3,4,5,6};
        int[] segundo = {1,2,3,4,5};
        System.out.println(comunes(primero, segundo));

    }
    public static String comunes(int[] a, int[] b){
        String res = "";
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    res += a[i] + " ";
                }
            }
        }
        return res;
    }
}