package Day7;


class InsufficientBalance extends Exception{
    public InsufficientBalance(String message){
        super(message);
    }
}
class BankAccount{
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount) throws InsufficientBalance{
        if(amount>balance){
            throw new InsufficientBalance("Balance is less than amount");
        }else{
            balance-=amount;
        }
    }
    public int getBalance(){
        return balance;
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount(10000);
        acc.deposit(1500);
        System.out.println(acc.getBalance());
        try {
            acc.withdraw(15000);
        }catch (InsufficientBalance e){
            System.out.println(e.getMessage());
        }
        System.out.println(acc.getBalance());

    }
}
