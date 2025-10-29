package Day3.Constructor;

class Students{
    int rno;
    String name;
    String dept;
    static String college;
    // Parameterized Constructor
    public Students(String name,int rno,String dept,String college){
        this.name=name;
        this.rno=rno;
        this.dept=dept;
        this.college=college;
    }
    //No-args Constructor
    public Students(){
        this("Bindhu",14,"IT","MSAJCE");
    }
    //Copy Constructor
    public Students(Students s1){
        this.name=s1.name;
        this.rno=s1.rno;
        this.dept=s1.dept;
        this.college=s1.college;
    }
    public void display(){
        System.out.println("RNo: "+rno+"\nName: "+name+"\nDept: "+dept+"\nCollege Name: "+college);
    }

}
public class Constructor {
    public static void main(String[] args) {
        Students s1=new Students("Dilli",9,"IT","MSAJCE");
        s1.display();
        System.out.println("-----------------------------------------");
        Students s2=new Students();
        s2.name="Rani";
        s2.rno=26;
        s2.dept="Mech";
        s2.display();
        System.out.println("-------------------------------------");
        Students s3=new Students(s1);
        s3.display();
        Students s4=new Students();
    }
}
