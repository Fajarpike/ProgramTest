package VariableHiding;

class Parent {

    String name;
    static void doIt(){
        System.out.println("ini kelas parent");
    }
}


class Child extends Parent{
    
    String name;
    static void doIt(){
        System.out.println("ini kelas child");
    }
}