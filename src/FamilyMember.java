public class FamilyMember { //klasa
    static String surname = "Nowak"; // deifiniowana poza metoda main bo dotyczy calej klasy, rozni sie od stalej zmiennej slowem final i
            // stalej zmiennej nie da sie wiecej zmienic kiedy static zmienna mozna zmienic (dla calej klasy)
            //pojawiaja sie kursywa i tak je mozna rozpoznac Klasa.zmienna_statyczna
    String name;
    int age;

    public static void main(String[] args) {
       FamilyMember dad = new FamilyMember(); //obiekt klasy w ktorej juz jestesmy
        dad.age=27;
        dad.name="Jan";

        FamilyMember mum = new FamilyMember();
        mum.age=25;
        mum.name="Agata";

        dad.surname = "Kowalski"; // i tak zmieni dla obu family members bo zmienna klasowa
        //przy zmianach uzywac w zwiazku z tym nazwe klasy FamilyMember a nie poszczegolnych obiektow bo to mylne
        System.out.println("Tata: "+dad.name+" "+dad.surname+" lat "+dad.age);
        System.out.println("Mama: "+mum.name+" "+mum.surname+" lat "+mum.age);

    int i = 686868;
    String str =String.valueOf(i);//metoda klasowa - podmieni int na string
    System.out.println(str.charAt(5));

    }
}
