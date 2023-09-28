package StaticKeyword;

public class StaticKeywordAPP {
    
    public static void main(String[] args) {
        
        //Mengakses class example
        System.out.println(Example.APPLICATION);
        System.out.println(Example.VERSION);

        //Mengakses class Example2
        System.out.println(Example2.sum(90,80,70,77));

        //Mengkases class Example3
        Example3.Example4 example4 = new Example3.Example4();
        example4.setName("PT SINAR FAJAR");
        System.out.println(example4.getName());

    }
}
