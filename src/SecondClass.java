import java.util.Arrays;

*
 * Created by dobrianska_i on 01.03.2017.


public class SecondClass {

 int[]arrDigits = new int[10];

        public void method(){
           arrDigits[0] = 2;
           arrDigits[9] = 10;
        }


  public static void main(String[] args) {
        int[]arrDigits = { 2, 5, 8, 9, 1, 7, 9, 4, 7, 10 };
        arrDigits[0] = 2;
        arrDigits[9] = 10;{
        System.out.println(Arrays.toString(arrDigits));
    }


String[] arrStrs = new String[10];

        public void method(){
            arrStrs [0] = "st1";
            arrStrs [1] = "st2";
        }

    public static void main(String[] args) {
        String[]arrStrs = {"st1", "st2"};
        System.out.println(Arrays.toString(arrStrs));

    }



    public static void main(String[] args) {
        int[] mas = new int[5];
        int[] tas = {1, 2, 3, 4, 5, 6};

        mas[4] = tas[5];
        mas[3] = tas[4];

        System.out.println(Arrays.toString(mas));
        System.out.println(Arrays.toString(tas));

        for (int i = 0; i< mas.length; i++) {
           mas[i] = mas[i]+100;
        }
        System.out.println(Arrays.toString(mas));

        int i = 0;
        while (i < tas.length) {
            tas[i] = tas[i] / 2;
            i++;
        }

        System.out.println(Arrays.toString(tas));
    }
  }
