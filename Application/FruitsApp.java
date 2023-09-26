package Application;

import Data.Fruits;
import Data.Mangga;

public class FruitsApp {

    public static void main (String[] args) {
    
    Fruits fruits = new Fruits("Mangga", "Kuning", "Manis");
    fruits.sayHello();

    Mangga mangga = new Mangga("Mangga simana lagi", "hijau", "manis legit");
    mangga.sayHello();
    }
    
    
}
