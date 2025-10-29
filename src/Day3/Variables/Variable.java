package Day3.Variables;

class Shape{
    int length;
    int width;
    int radius;
    public double areaOfRectangle(){
        return length*width;
    }
    public double areaOfCircle(){
        double pi=3.147;
        //double area=pi*Math.pow(radius,2);
        double area=pi*(radius*radius);
        return area;
    }
}
public class Variable {
    public static void main(String[] args) {
        Shape rectangle=new Shape();
        rectangle.length=15;
        rectangle.width=25;
        System.out.println("Area of Rectangle: "+rectangle.areaOfRectangle());
        Shape circle=new Shape();
        circle.radius=5;
        System.out.println("Area of Circle: "+circle.areaOfCircle());

    }
}
