//Napisz klasę, która zlicza wszystkie swoje instancje. Wskazówka: podczas tworzenia obiektu każdorazowo wywoływany jest konstruktor.
public class Zad323 {
    public static void main(String[] args) {
        Nowa aaa = new Nowa();
        Nowa bbb = new Nowa();
        Nowa ccc = new Nowa();
        Nowa ddd = new Nowa();
        Nowa eee = new Nowa();


        System.out.println("stworzono " +Nowa.counter );

    }

}


class Nowa{

   static int counter;

    public Nowa(){

        counter++;
                }
}