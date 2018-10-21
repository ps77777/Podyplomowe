//Utwórz program, który zmienia datę urodzin w formacie DD/MM/RRRR (na przykład 29/04/2016) na trzy oddzielne teksty.

import java.util.StringTokenizer;

public class Zad321 {

    public static void main(String[] args) {

        StringTokenizer separator;

        String DoB = "29/04/2016";
        separator = new StringTokenizer(DoB, "/");

        System.out.println("Token 1: " + separator.nextToken());
        System.out.println("Token 2: " + separator.nextToken());
        System.out.println("Token 3: " + separator.nextToken());

    }
}
