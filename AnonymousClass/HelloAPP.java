package AnonymousClass;

public class HelloAPP {
    
    public static void main(String[] args) {
        
        Hello sapa = new Hello(){

            public void hello(){
                System.out.println("hello");
            }

            public void hello(String name){
                System.out.println("Hello" + name);
            }
        };

        sapa.hello();
        sapa.hello("Fajar");
    }
}
