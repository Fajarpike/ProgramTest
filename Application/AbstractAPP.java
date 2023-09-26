package Application;

import Abstract.Cat;
import Abstract.City;

public class AbstractAPP {

    public static void main(String[] args) {
        
        // Location location = new Location()//error
        City city = new City();
        city.name = "Subang";
        System.out.println(city.name);

        //invoke abstract Method class Cat

        Cat cat = new Cat();
        cat.name = "Rully";
        cat.run();
        
    }
    
}
