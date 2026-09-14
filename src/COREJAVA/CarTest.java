package COREJAVA;

public class CarTest {
    public static void main(String[] args) {
        OOPCar car = new OOPCar(); // creating object and providing memory to the object

        // Properties of Car
        car.Name = "THAR-ROXX";
        car.Brand = " Mahindra ";
        car.Color = " Black ";
        car.speed = 60;
        car.year = 2027;
       System.out.println("Car Name is : " + car.Name);
         System.out.println("Car Brand is : " + car.Brand);
          System.out.println("Car Color is : " + car.Color);
           System.out.println("Car Year is : " + car.year);
        //Calling of Methods to Perform work
        car.accelerate(10);
        System.out.println(car.speed);
        car.brake(15);
        System.out.println(car.speed);
    }
}
