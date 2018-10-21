public class Cast {
    public static void main(String[] args) {
        double d =4.45;
        short s = 8;
//        int i;
//       // i=(int)d; //nie przejdzie bez explicit (int)d zgody na utrate deimala
////        i =s; //przechodzi bez problemu bo int jest wiekszy niz short ale mozna tez z explicit rzutowaniem (int)s
//        System.out.println(i);

        Employee emp = new Employee();
        VicePresident veep =new VicePresident();

        emp=veep;
        veep = (VicePresident)emp;

        Float f1 =4.23F;
        Float f2 =6.43F; //przkonwertuje z obiektu F na typ danych f
        System.out.println(Math.min(f1,f2));




    }
}

class Employee{ }
class VicePresident extends Employee{}