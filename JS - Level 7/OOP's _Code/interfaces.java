//Using Abstract Keyword:

interface  Animal{
    void sound();

    public static void getTypeofOrganism(){// Can have only default static or public static methods
        System.out.println("This is a Animal");
    }
}

class Dog implements  Animal{
    @Override
    public void sound(){// Since by default the interfaces are public 
        System.out.println("Dog barks.");
    }
}

public class interfaces{
    public static void main(String[] args){
        Animal animal = new Dog();
        animal.sound();
        // animal.getTypeofOrganism();
        // Since methods in interfaces cannot be accessed by the child;
    }
}