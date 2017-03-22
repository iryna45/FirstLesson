import java.util.Arrays;
import java.util.List;

/**
 * Created by dobrianska_i on 15.03.2017.*/

public class Student2 {

    public static void main(String[] args) {

        List<String> pul = Arrays.asList("do", "re", "mi", "fa", "sol");

            for (int A = pul.size(); A >= 0; A--) {
                System.out.println();

                System.out.println();
            }

            for(String str : pul){
                System.out.println(str);
            }

    }
}