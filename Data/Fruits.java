package Data;

public class Fruits {

    public String name;
    public String color;
    public String rasa;

   public Fruits(String name, String color, String rasa){
        this.name = name;
        this.color = color;
        this.rasa = rasa;
    }

    public void sayHello(){
        System.out.println("Saya jenis buah " + name + " warna saya "+ color + " rasa saya "+ rasa);
    }
}
