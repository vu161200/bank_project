package chap3;

import java.util.Scanner;

public class Account {
    public double id; // số tài khoản
    public double balance; // số dư

    Scanner sc = new Scanner(System.in);

    public Account(double id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public double getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // nạp tiền
    public void deposit() {
        double deposit;
        System.out.print("Enter the amount to send: ");
        deposit = sc.nextDouble();
        if (deposit >= 0) {
            balance += deposit;
            System.out.println("You have successfully deposited: " + deposit);
            System.out.println("Your account balance is: " + balance);
        } else {
            System.out.println("Error!");
        }
    }

    // rút tiền
    public void withDrawal() {
        double withDrawal;
        System.out.print("Enter the amount to withdraw: ");
        withDrawal = sc.nextDouble();
        if (withDrawal >= 0 && withDrawal <= balance) {
            balance -= withDrawal;
            System.out.println("You have successfully withdrawn: " + withDrawal);
            System.out.println("Your account balance is: " + balance);
        } else {
            System.out.println("Error!");
        }
    }

    // chuyển khoản
    public void transfer() {
        System.out.println("Enter the number of the account you want to transfer funds to");
        double id2 = sc.nextDouble();

        System.out.print("Enter your amount to transfer: ");
        double amount = sc.nextDouble();
        
        if(amount >= 0 && amount <= balance){
            balance -= amount;
            System.out.println("You've just transferred " + amount + " to " + id2);
            System.out.println("Your account balance are: " + balance);
        }else{
            System.out.println("Error!!");
        }
    }

    //xem thông tin 
    public void display(){
        System.out.println("Account number: " + id);
        System.out.println("Your account balance: " + balance);
    }

}
