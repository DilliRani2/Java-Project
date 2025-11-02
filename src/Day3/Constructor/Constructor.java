package Day3.Constructor;

class Students{
    String name;
    int rno;
    String dept;
    static String college;

    public Students(String name,int rno,String dept,String college){
        this.name=name;
        this.rno=rno;
        this.dept=dept;
        this.college=college;
    }
    //    No-args Constructor
    public Students(){

    }
    public void display(){
        System.out.println("Name: "+name+"\nRno: "+rno+"\nDept: "+dept+"\nCollege Name: "+college);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Students.college="MSAJCE";
        Students s1=new Students("Dilli",26,"IT","MSAJCE");
        s1.display();
        System.out.println("--------------------------------------");
        Students s2=new Students();
        s2.name="Rani";
        s2.rno=76;
        s2.dept="Civil";
        s2.display();
        Students s3=new Students();
        s3.name="Atchaya";
        s3.rno=14;
        s3.dept="AIDS";
        s3.display();
        Students s4=new Students();
        s4.name="Abi";
        s4.rno=35;
        s4.dept="CSE";
        s4.display();


    }
}
