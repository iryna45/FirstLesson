import java.util.Arrays;
import java.util.concurrent.locks.Condition;

/**
 * Created by dobrianska_i on 25.02.2017.
 */
public class Home {
    public static void main(String[] args) {
        System.out.println("Hello, Ira!");

        int t = 5;
        int d = 10;
        if (t * d == 50) {
            System.out.println("true");
        }
        if (t * d == 20) {
            System.out.println("false");
        }
        String a = "hello ";
        String b = " Kitty";
        String f = a + b;
        System.out.println(f);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
              }

    }



