package Application;

import Interface.Avanza;
import Interface.Car;

//application Car Interface
public class CarAPP {

    public static void main(String[] args) {
        
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTire());
    }
    
}
