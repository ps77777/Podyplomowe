public class Equals {

    public static void main(String[] args) {
//        String str1, str2;
//        str1="jakis tekst";
//        str2="jakis tekst";
//
//
//            if (str1.equals(str2)){ //tylko tak a nie = czy ==
//                System.out.println("Rowne");
//            }

            A a = new A();
            B b = new B();

            if (a.equals(b)){//porwnuje referencje a nie wartosci a oba obiekty maja inne ref choc oba sa puste wiec wartosci takie same
                System.out.println("rowne");
            }

    }
}


class A{} //kazda klasa ma niejawnie extends Object() czyli dziedziczy od razu metody Object
class B{}