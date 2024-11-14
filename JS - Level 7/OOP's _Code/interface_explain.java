public class interface_explain{
    public static void main(String[] args) {
        Animal.Species();  // Calling the static method from the interface
        Cat myCat = new Cat();
        myCat.sound();  // Calling the instance method implemented by Cat
        myCat.tigerName(); 
    }
}

interface Animal {
    void sound();// Implicitly the methods in interface are public 

    static void Species() { 
        // Static methods in an interface cannot be overridden, only accessed via the interface
        System.out.println("All Animals belong to the Animalia Kingdom.");
    }
}

interface tigers{
    public void tigerName();
}

class Cat implements Animal ,tigers {
    @Override
    public void sound() {  // Ensure the method has public access
        System.out.println("Cat meows.");
    }
    @Override
    public void tigerName() {
        
            System.out.println("This Cat belongs to tiger family");
        
    }
}

