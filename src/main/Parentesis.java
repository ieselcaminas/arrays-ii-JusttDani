public class Parentesis {
    public static void main(String[] args) {
        System.out.println(revisador("()()()"));
    }
    static boolean revisador(String a){
        int contador = 0;
        for (int i = 0; i < a.length() ; i++) {
            if (a.charAt(i) == '(') {
                contador++;
            }
            if (a.charAt(i) == ')') {
                contador--;
            }
            if (contador == -1){
                return false;
            }

        }

        return contador == 0;
    }
}
