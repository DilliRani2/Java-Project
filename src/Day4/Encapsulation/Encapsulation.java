package Day4.Encapsulation;

class Student{
    private int rno;
    private String name;
    private int marks;
    public void setRno(int rno){
        this.rno=rno;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public int getRno(){
        return rno;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setRno(406);
        s1.setName("Anuu");
        s1.setMarks(78);
        System.out.println(s1.getRno()+" "+s1.getName()+" "+s1.getMarks());

        Student s2=new Student();
        s2.setRno(408);
        s2.setName("Nira");
        s2.setMarks(68);
        System.out.println(s2.getRno()+" "+s2.getName()+" "+s2.getMarks());
    }
}
