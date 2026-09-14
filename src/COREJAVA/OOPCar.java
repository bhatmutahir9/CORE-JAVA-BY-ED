package COREJAVA;

public class OOPCar {
    // Properties of Car class
    String Name;
    String Color;
    String Brand;
    int speed;
    int year;

    //Behavior of Car is defined in Methods to use the properties to get  work done
    public void  accelerate(int increment) {
        speed = speed + increment;
    }

    public void brake(int decrement){
        speed = speed - decrement;
            if(speed < 0){
                speed = 0;
            }

    }
}