public class IncDec {


    public static void main(String[] args) {
        int x,y,z;
        x=42;
        y =x++;// y =42, x =43 przypisanie 42 do y i dopiero podniesienie
        z=++x; // x=44, z =44 podniesienie i przypisanie

        System.out.println("x: " +x );
        System.out.println("y: " +y );
        System.out.println("z: " +z );

        int a =0, b;
        b =a++ + a++; // przypisanie 0 do dzialania i podniesienie a o 1 + przypisanie 1 i podniesienie a o 1
                        // wiec 0 +1 =1 i a =2
        System.out.println("a: " +a );
        System.out.println("b: " +b );


        }
}
