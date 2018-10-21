public class StringChecker {
    public static void main(String[] args) {
        String str = "Lannister zawsze splaca swoje dlugi.";

        System.out.println("tekst to: "+str);
        System.out.println("dlugosc tesktu: "+str.length()+" znakow");
        System.out.println("znak na pozycji 6. to : "+str.charAt(6));//liczy o zera a nie od jeden
        System.out.println("Fragment od znaku 10. do 16. : "+str.substring(10,16)+".");//nie wlacza koncowej litery
        System.out.println("Indeks pierwszej litery 't': " +str.indexOf('t'));//podajemy w apostrofie
        System.out.println("Indeks pierwszego podtekstu \"dlugi\": " +str.indexOf("dlugi"));//podajemy juz w cudzyslowie
        System.out.println("Caly teskt wielimi literami: " +str.toUpperCase());//podajemy w apostrofie
    }
}
