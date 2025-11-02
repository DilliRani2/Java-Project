package Day4;


class Engine{
    void start(){
        System.out.println("Engine Started");
    }
}
class Car{
    Engine engine=new Engine();
    void startCar(){
        engine.start();
        System.out.println("Car Started");
    }
}
public class Composition {
    public static void main(String[] args) {
        Car car=new Car();
        car.startCar();
    }
}
