package Polimorphisme;

public class PhoneAPP {

    public static void main(String[] args) {

        Phone phone = new Phone("IPHONE","A21S" ,2000000);
        phone.Explain();

        phone = new Samsung("Samsung", 3000000);
        phone.Explain();
        
        phone = new Nokia("Nokia", 7800000);
        phone.Explain();

        Polimor(new Phone("Motrola"));
        Polimor(new Samsung("BlueBerry", 0));
        Polimor(new Nokia("Hp Game", 0 ));

        sayHello(new Phone("IPHONE"));
        sayHello(new Samsung("Samsung", null, 0));
        sayHello(new Nokia("Nokia", 0));

    }

    //Polimorphisme bisa kita set parameternya di dalam method

    static void Polimor(Phone phone){
        System.out.println("name " + phone.name);
    }

    //type check and cast untuk pengecekan type data

    static void sayHello(Phone phone){
        if(phone instanceof Samsung){
            Samsung samsung = (Samsung) phone;
            System.out.println("Hallo saya hp " + samsung.name);
        }else if(phone instanceof Nokia){
            Nokia nokia = (Nokia) phone;
            System.out.println("Hallo saya hp " + nokia.name);
        } else {
            System.out.println("Hallo saya hp " + phone.name);
        }
    }
    
}
