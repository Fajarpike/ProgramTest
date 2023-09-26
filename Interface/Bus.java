package Interface;

public class Bus implements Car {

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("Bus Drive");
    }

    @Override
    public int getTire() {
        // TODO Auto-generated method stub
        return 8;
    }

    @Override
    public boolean isBig() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isMaintenance() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getBrand() {
        // TODO Auto-generated method stub
        return "Hino";
    }

    
    
}
