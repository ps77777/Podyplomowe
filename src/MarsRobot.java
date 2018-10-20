public class MarsRobot implements NowyInterface{
    String status;
    int speed;
    float temperature;

    void checkTemperature() {
        if (temperature<-80){
            status = "powrot do domu";
            speed=5;
        }

    }
    void showAttributes ( ){
        System.out.println("Status: "+ status);
        System.out.println("Predkosc: "+ speed);
        System.out.println("Temperatura: "+ temperature);
    }

    public void checkStatus(){
        System.out.println("Biezacy status:" + status);
    };
    public void checkTemprature(){};
}
