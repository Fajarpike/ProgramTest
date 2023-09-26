package Polimorphisme;

public class Nokia extends Samsung {

    Nokia(String name, int price){
        super(name, price);
    }

    
    public void Explain() {
        System.out.println("Nama Ponsel " + name +" Harganya " + price);
    }
}
