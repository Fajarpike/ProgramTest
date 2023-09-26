package Polimorphisme;

public class Phone {

    String name;
    String merk;
    int price;

    Phone(String name, String merk, int price) {
        this.name = name;
        this.merk = merk;
        this.price = price;
    }

    Phone(String name){
        this.name = name;
    }

    public void Explain(){
        System.out.println("Nama handphone " + name +" merk " + merk + " harga " + price);
    }
    
}
