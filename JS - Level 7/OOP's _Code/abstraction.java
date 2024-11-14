//Using Abstract Keyword:

abstract class Animal{
    abstract void sound();

    public static void getTypeofOrganism(){
        System.out.println("This is a Animal");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks.");
    }
}

public class abstraction{
    public static void main(String[] args){
        Animal animal = new Dog();
        animal.sound();
        animal.getTypeofOrganism();
    }
}