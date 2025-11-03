package Day5;

abstract class Shape{
    String color;
    abstract void draw();
    public void getColor(String color){
        this.color=color;
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle...");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square....");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Shape rectangle=new Rectangle();
        rectangle.draw();
        Shape square=new Square();
        square.draw();

    }
}
