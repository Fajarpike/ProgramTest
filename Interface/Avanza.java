package Interface;

public class Avanza implements Car{


    @Override
    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("Avanza");
    }

    @Override
    public int getTire() {
        // TODO Auto-generated method stub
        return 4;
    }

    public String getBrand(){
        return "toyota";
    }

    public boolean isMaintenance(){
        return false;
    }
    
}
