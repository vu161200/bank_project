package chap3;

public class SavingAccount extends Account
{
    public SavingAccount(double id, double balance){
        super(id, balance);
    }

    public void deposit(){
        super.deposit();
    }

    public void withDrawal(){
        super.withDrawal();
    }

    public void transfer(){
        super.transfer();
    }

    public void display(){
        super.display();
    }

    public void interestRate(){
        System.out.println("Enter interest rate: ");
        double rate;
        rate = sc.nextDouble();
        balance += balance*rate/100;
        System.out.println("Your balance are: " + balance);
    }

}