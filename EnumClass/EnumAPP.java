package EnumClass;
public class EnumAPP {

    public static void main(String[] args) {
        
        Customer customer = new Customer();
        customer.setName("Fajar Pikekah");
        customer.setEnumClass(EnumClass.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getEnumClass());
        System.out.println(customer.getEnumClass().getDescription());

        //contoh mengkonversi enum menjadi data objek menggunakan valueOf
        EnumClass enumclass = EnumClass.valueOf("PREMIUM");
        System.out.println(enumclass);

        System.out.println("Print Enum Class");
        for(EnumClass value: EnumClass.values()){
            System.out.println(value);
        }
    }
    
}
