package Day4.Inheritance;

class GrandFather{
    public void land(){
        System.out.println("10 Acres of land");
    }
}
class Father extends GrandFather{
    public void house(){
        System.out.println("2BHK House");
    }
}
class Son extends Father{
    public void car(){
        System.out.println("7 Seater car");
    }
}
class Daughter extends Father{
    public void jewels(){
        System.out.println("Having Some Jewels");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Son son=new Son();
        son.car();
        son.house();

        Father father=new Father();
        father.house();

        Daughter daughter=new Daughter();
        daughter.jewels();
        daughter.land();
        daughter.house();

    }
}
