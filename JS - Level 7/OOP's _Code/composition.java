// public class composition{
//     public static void main(String[] args) {
//         Car myCar = new Car();
//         myCar.startCar();
//     }
// }

// class Engine {
//     public void start() {
//         System.out.println("Engine starting...");
//     }
// }

// // Car class using Composition
// class Car {
//     private Engine engine;  // Car "has-a" Engine

//     // Constructor to initialize the engine
//     public Car() {
//         this.engine = new Engine();  // Instantiate the Engine
//     }

//     public void startCar() {
//         engine.start();  // Delegate starting to the engine
//         System.out.println("Car started.");
//     }
// }
public class composition{
    public static void main(String[] args) {
        Engine myEngine = new Engine();
        Car myCar = new Car(myEngine);
        myCar.CarStarts();
    }
}

class Engine{
    public void start(){
        System.out.println("Engine Started...");
    }
}

class Car{
    private Engine engine;

    Car(Engine engine){
        this.engine = engine;
    }
    public void CarStarts(){
        engine.start();
        System.out.println("Car Started...");
    }
}