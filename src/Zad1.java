public class Zad1 {
// zad 1
    public static void main(String[] args) {
        int inwestycja =14000;
        double rok1 = 1.4;
        double rok2 = 1500;
        double rok3 = 1.12;

        double wynik = calc(inwestycja, rok1, rok2, rok3);
//        double rok1 = inwestycja * 1.4;
//        double rok2 = rok1 - 1500;
//        double rok3 = rok2 *1.12;
//
//        System.out.println("Wartosc po pierwszym roku: " + rok1+ " zl");
//        System.out.println("Wartosc po drugim roku: " + rok2 + " zl");
//        System.out.println("Wartosc po trzecim roku: " + rok3+ " zl");
        System.out.println(wynik);

    }

    static double calc ( int inwestycja, double rok1, double rok2, double rok3){

        return (inwestycja * rok1 - rok2) *rok3;

    }

}

