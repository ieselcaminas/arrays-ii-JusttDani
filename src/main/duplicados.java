te;

public class duplicados {
    public static void main(String[] args) {
        int[] numeros = {2,4,6,6,2,2,7,9,4,10};
        System.out.println(repetidos(numeros));

    }
    public static String repetidos(int[] a){
        int contador = -1;
        String resultado = "";
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i] == a[j]){
                    contador++;
                    if(contador>2) {
                    }
                }
                if(j==a.length-1 && contador>1){
                    resultado += a[i] + " ";
                    contador = 0;
                }
            }
        }
        return resultado;
    }
}
