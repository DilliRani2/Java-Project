package Day5;

interface Payable{
    void generatePayslip();
}
interface Bonus{
    void calculateBonus();
}

class Contractor implements Payable,Bonus{
    @Override
    public void generatePayslip() {
        System.out.println("Contractor salary will be calculated on day basis");
    }

    @Override
    public void calculateBonus() {

    }
}
class FullTimeEmployee implements Payable{
    @Override
    public void generatePayslip() {
        System.out.println("Full time employees salary will be calculated on month basis");
    }
}

public class Interface {
    public static void main(String[] args){
        Payable  contractor=new Contractor();
        contractor.generatePayslip();
        Payable FTE=new FullTimeEmployee();
        FTE.generatePayslip();
    }
}
