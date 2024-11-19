import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class Comunes {
    public static void main(String[] args) {
        int[] real= {3,7,4,3,3,1,2};
        real = Arrays.stream(real).sorted().toArray();
        System.out.println(Arrays.toString(real));
        System.out.println(binarySearch(real, 4));

    }


}
