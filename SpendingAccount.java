package chap3;

public class SpendingAccount extends Account {
    public SpendingAccount(double id, double balance){
        super(id, balance);
    }

    public void deposit(){
        super.deposit();
    }

    public void transfer(){
        super.transfer();
    }

    public void display(){
        super.display();
    }

    public void withDrawal(){
        int n = 0, m = 0;
        for( ; ; ){
            System.out.println("Enter the amount to withdraw");
            double amount = sc.nextDouble();
            balance -= amount;
            System.out.println("You've withdrawn: " + amount);
            n++;
            System.out.println("Do you want to continue? (true/false)");
            boolean answer = sc.nextBoolean();
            if(answer == true){
                continue;
            }else{
                m=n;
                break;
            }
        }
        if(n>3){
            balance -= (m-3)*2;
        }
        System.out.println("Your balance are: " + balance);
    }
}
