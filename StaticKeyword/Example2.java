package StaticKeyword;

public class Example2 {

    //ini adalah contoh static method
    public static int sum(int... value){
        int total = 0;
        for(int values : value ){
            total += values;
        }
        return total;
    }
    
}
