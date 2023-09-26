package Application;

import Data.Product;


public class ProductAPP {

    public static void main(String[] args) {
        
        Product product = new Product("Tango", 1000);
        product.sayHi();

        Product product2;
        product2 = new Product("Tango", 1000);
        System.out.println(product);
        //membandingkan tipe data dan isinya menggunakan method equals
        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }
    
}
