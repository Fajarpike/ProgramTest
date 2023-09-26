package Polimorphisme;

public class Samsung extends Phone{

    Samsung(String name, String merk, int price){
        super(name, merk, price);
    }

    Samsung(String name, int price){
        super(name, null, price);
    }

    public void Explain(){
        System.out.println("Nama Ponsel " + name + " harga nya " + price);
    }
    
}
