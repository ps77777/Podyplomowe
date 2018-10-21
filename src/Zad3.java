public class Zad3 {

/*Napisz program wyświetlający liczbę dziesiętną w systemie dwójkowym, ósemkowym i szesnastkowym.
    Wykorzystaj statyczne metody klasy Integer.
 */
public static void main(String[] args) {

    int a =6;

    System.out.println("binarny: "+Integer.toBinaryString(a));

    System.out.println("8mkowy: "+Integer.toOctalString(a));

    System.out.println("16tkowy: "+Integer.toHexString(a));
}
}
