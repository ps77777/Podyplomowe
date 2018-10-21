public class Binary {
//OPERATORY

    public static void main(String[] args) {

//        int ii =123;
//        System.out.println("dzisietny: "+ii);
//        System.out.println("binarny: "+Integer.toBinaryString(ii));
//        System.out.println("16tkowy: "+Integer.toHexString(ii));
//        System.out.println("8mkowy: "+Integer.toOctalString(ii));
//
//        int y =0173; // 173 w 8-mkowym to 123 w 10-tnym - zawsze dopisujemy 0 w 8-kmowym
//        System.out.println("dzisietny: "+y);
//        System.out.println("binarny: "+Integer.toBinaryString(y));
//        System.out.println("16tkowy: "+Integer.toHexString(y));
//        System.out.println("8mkowy: "+Integer.toOctalString(y));
//

        // & - iloczyn bitowy
        // ! - suma bitowa
        // ^ - XOR (eXclusive OR)

        // ~ - nehacja bitowa
        //System.out.println("negacja 5: " + (~5));

        // << - przesuniecie w lewo
//        System.out.printf("%10s\n",Integer.toBinaryString(5)); //101
//        System.out.printf("%10s\n",Integer.toBinaryString(5 >> 1)); //010
//        System.out.printf("%10s\n",Integer.toBinaryString(5 >> 3));//000
        // >> -  przesuniecie w prawo

        //1 1 --> 0
        //0 1 --> 1
        //1 0 --> 1
        //0 0 --> 0



        int a = 6;
        int b = 5;
        int c= calculate(a, b);
        show(a,b,c);    }

    static void show(int a, int b, int c) {
        System.out.println("operacja: "+ a + " & " +b + " = " +c);
        System.out.printf("%10s\n",Integer.toBinaryString(a));//przesuniecie 10 znakow do prawej strony
        System.out.printf("%10s\n",Integer.toBinaryString(b));
        System.out.println("---------------");
        System.out.printf("%10s\n",Integer.toBinaryString(c));
    }

    static int calculate (int a, int b) {
        return a & b;
    }

}

