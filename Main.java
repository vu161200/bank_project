package chap3;

import java.util.Scanner;


public class Main {
    public static void SavingAccount(){
        System.out.println("Enter your account number");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Enter the amount");
        double b= new Scanner(System.in).nextDouble();
        SavingAccount savingAccount = new SavingAccount(a, b);
        System.out.println("\nPlease choose");
        System.out.println("1.Deposit");
        System.out.println("2.Withdrawal");
        System.out.println("3.Transfer");
        System.out.println("4.Account information");
        System.out.println("5.Interest rate");
        System.out.println("6.Exit\n");
        int choose = new Scanner(System.in).nextInt();
        switch (choose) {
            case 1:
            {   
                savingAccount.deposit();
                break;
            }

            case 2:
            {   
                savingAccount.withDrawal();;
                break;
            }

            case 3:
            {   
                savingAccount.transfer();
                break;
            }

            case 4:
            {   
                savingAccount.display();
                break;
            }

            case 5:
            {   
                savingAccount.interestRate();;
                break;
            }


            case 6:
            {   
                System.out.println("Good bye !!! ");
                break;
            }
            default:
            {
                System.out.println("Error! \nPlease try again");
                break;
            }
        }
    }
    
    public static void SpendingAccount(){
        System.out.println("Enter your account number");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Enter the amount");
        double b= new Scanner(System.in).nextDouble();
        SpendingAccount spendingAccount = new SpendingAccount(a, b);
        System.out.println("\nPlease choose");
        System.out.println("1.Deposit");
        System.out.println("2.Withdrawal");
        System.out.println("3.Transfer");
        System.out.println("4.Account information");
        System.out.println("5.Exit\n");
        int choose = new Scanner(System.in).nextInt();
        switch (choose) {
            case 1:
            {   
                spendingAccount.deposit();
                break;
            }

            case 2:
            {   
                spendingAccount.withDrawal();;
                break;
            }

            case 3:
            {   
                spendingAccount.transfer();
                break;
            }

            case 4:
            {   
                spendingAccount.display();
                break;
            }

            case 5:
            {   
                System.out.println("Good bye !!!");
                break;
            }
            default:
            {
                System.out.println("Error! \nPlease try again");
                break;
            }
        }
    }

    public static void main(String[] args){
        System.out.println("\nPlease choose");
        System.out.println("1.Saving account");
        System.out.println("2.Spending account\n");
        int choose = new Scanner(System.in).nextInt();
        switch (choose) {
            case 1:
            {
                SavingAccount();
                break;
            }

            case 2:
            {
                SpendingAccount();
                break;
            }
            
            default:
            {
                System.out.println("Error!! \nPlease try again.");
                break;
            }
        }
    }
}
