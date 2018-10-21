import java.util.Locale;

public class Formater {

    public static void main(String[] args) {

        int i =898;
        String s = "jakis napis";
        double   d= Math.PI;

        System.out.printf("%d",i);
        System.out.printf("%50s",s);
        System.out.printf(new Locale("us"), "%.50f",d);
    }
}
