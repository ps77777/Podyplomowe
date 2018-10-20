import java.text.DecimalFormat;

public class Vars {

    public static void main(String[] args) {


            String str = "to jest ciag znakow";
        System.out.println(str);

        double x =12e22; // 12* 10 ^22;
        double y = 12e-22; //12*10^22;

        DecimalFormat decimalFormat = new DecimalFormat("#.##########################################");

          System.out.println(y);
          System.out.println(decimalFormat.format(y));

        int a =5;
        int b =2;
        System.out.println(a/b);
    }
}
