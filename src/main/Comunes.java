public class comunes {
        public static void main(String[] args) {
            int[] numeros = {2,4,6,10};
            int[] numeros2 = {2,4,7,9};
            System.out.println(comunes(numeros, numeros2));

        }
        public static String comunes(int[] a, int[] b){
            String resultado = "";
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a.length; j++){
                    if(a[i] == b[j]){
                        resultado += b[j] + " ";
                    }

                }
            }
            return resultado;
        }
}
