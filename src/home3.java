import java.util.Arrays;

/**
 * Created by dobrianska_i on 05.03.2017.
 */
public class home3 {
    public static void main(String[] args) {
        int tolo [] = new int [33];

        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                tolo [index] = i;
                index++;

            }
        }
        System.out.println(Arrays.toString(tolo));
    }
}