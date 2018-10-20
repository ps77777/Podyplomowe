public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        MarsRobot spirit2 = new MarsRobot();

        spirit2.status = "nowy spirit";
        spirit2.speed = 7;
        spirit2.temperature = -33;
            spirit2.showAttributes();

        spirit.status = "eksploracja";
        spirit.speed=2;
        spirit.temperature=-60;

        spirit.showAttributes();

        System.out.println("Zwiekszamy predkosc do 3");

        spirit.speed =3;
        spirit.showAttributes();

        System.out.println("Zmiana temperatury na -90");
        spirit.temperature= -90;
        spirit.showAttributes();;

        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttributes();

        System.out.println("Sprawdzanie nowej metody biezacego statusu");
        spirit.checkStatus();
    }

}
