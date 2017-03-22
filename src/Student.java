import java.util.Arrays;

/**
 * Created by dobrianska_i on 14.03.2017.*/

public class Student {

    public static void main(String[] args) {

        int [] bul = new int [10];
        bul[0] = 0;
        bul[1] = 1;

            for (int b = 2; b < bul.length; b++){
            bul[b] = bul[b - 1] + bul[b - 2];

            }
        System.out.println(Arrays.toString(bul));
        }
}




