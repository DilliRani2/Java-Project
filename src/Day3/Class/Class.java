package Day3.Class;

class Student{
    int rno;
    String name;
    String dept;
    public void display(){
        System.out.println("RNo: "+rno+"\nName: "+name+"\nDept: "+dept);
    }
}
public class Class {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Dilli";
        s1.rno=9;
        s1.dept="IT";
        s1.display();
        System.out.println("---------------------------------");
        Student s2=new Student();
        s2.name="Rani";
        s2.rno=26;
        s2.dept="Mech";
        s2.display();

    }
}
