package Data;

public class Mangga extends Fruits{
    
   public Mangga(String name, String color, String rasa){
        super(name, color, rasa);
    }

    public void sayHello(){
        System.out.println("Hallo saya buah " + name + " warna saya " + color + " rasa dari saya " + rasa);
    }
}
