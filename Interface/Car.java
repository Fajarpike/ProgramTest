package Interface;

public interface Car extends Hashbrand, isMaintenance{

    public abstract void drive();

    public abstract int getTire();

    //default method digunakan untuk mendeklarasikan method secara konkrit di interface
    //dengan syarat kata kunci depannya diawali default.
    public default boolean isMaintenance(){
        return false;
    }

    public default boolean isBig(){
        return true;
    }


    
}
