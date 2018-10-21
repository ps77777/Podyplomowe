//Utwórz klasę ze zmiennymi egzemplarza height, weight, depth, będącymi liczbami całkowitymi. Utwórz aplikację, która korzysta z nowej klasy, ustawia zmienne w obiekcie a następnie je wyświetla.
public class Zad322 {
    public static void main(String[] args) {

        NowaKlasa egz = new NowaKlasa();

        egz.depth =20;
        egz.height =80;
        egz.weight=1300;

        System.out.println("depth: "+egz.depth + "\t" + "height: "+egz.height+"\t"+"weight: " +egz.weight );

    }
}


class NowaKlasa{
    int height;
    int weight;
    int depth;
}