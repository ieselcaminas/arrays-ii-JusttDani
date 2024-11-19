public class SumaBinario {
    public static void main(String[] args) {
        String ola = "10110";
        String adios = "11101";
        System.out.println(suma(ola, adios));

    }
    static String suma(String a, String b) {
        StringBuilder res = new StringBuilder("");
        if (a.length() > b.length()) {
            int diferencia = a.length() - b.length();
            for (int i = 0; i < a.length(); i++) {
                if (diferencia > 0) {
                    res.append(a.charAt(i));
                    diferencia--;
                }else{
                if (a.charAt(i) == 1 && b.charAt(i-diferencia)==1) {
                    res.append("10");
                }else{
                    res.append(0);
                }
                }
            }
        } else {
            int diferencia = b.length() - a.length();
            for (int i = 0; i < b.length(); i++) {
                if (diferencia > 0) {
                    res.append(b.charAt(i));
                    diferencia--;
                }else{
                    if (a.charAt(i) == 1 && b.charAt(i-diferencia)==1) {
                        res.append("10");
                    }else{
                        res.append(0);
                    }
                }

            }
        }
        return a;
    }
}
