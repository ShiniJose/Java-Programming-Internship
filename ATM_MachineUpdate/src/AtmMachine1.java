import java.util.Scanner;

public class AtmMachine1 {
    private static int withdraw = 0; // static keyword used for shares the variable or method in class
    private static int deposit = 0;
    private static int balance = 20000;
    private int pin = 1996;

    static Scanner scan = new Scanner(System.in);

    // Default constructor just prints the statement
    public AtmMachine1() {
        System.out.println("Default Constructor is AtmMachine1");
    }

    // Parameterized constructor to initialize the variable
    public AtmMachine1(int withdraw, int deposit, int balance, int pin) {
        AtmMachine1.withdraw = withdraw;
        AtmMachine1.deposit = deposit;
        AtmMachine1.balance = balance;
        this.pin = pin;
    }

    // Use withdraw() method to withdraw money from account
    public static void moneyWithdraw() {
        System.out.println("Enter the amount to withdraw:");
        int withdraw = scan.nextInt();

        if (balance >= withdraw) {
            System.out.println("Please Collect your Money");
            balance -= withdraw;
        } else {
            System.out.println("You have insufficient Balance");
        }
        System.out.println("");
    }

    // Method to deposit money into the account
    public static void moneyDeposit() {
        System.out.println("Enter the amount to deposit:");
        int deposit = scan.nextInt();
        balance += deposit;
        System.out.println("Your money has been deposited");
        System.out.println("");
    }

    // Method to check the balance
    public static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
        System.out.println("");
    }

    public static void main(String[] args) {
        AtmMachine1 atm = new AtmMachine1();
        boolean exit = true;

        while(true)
        {
            System.out.println("Insert the Card");
            System.out.println("Enter your Pin (default is 0):");
            int inputPin = scan.nextInt();

            // Here you can add pin validation if needed
            if (inputPin == atm.pin) {
                System.out.println("Press 1 for money withdraw");
                
                System.out.println("Press 2 for money deposit");
                
                System.out.println("Press 3 for check Balance");
                System.out.println("Press 4 to Exit");
                

                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        moneyWithdraw();
                        break;
                    case 2:
                        moneyDeposit();
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using our ATM");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
                
            } else {
                System.out.println("Invalid Pin. Please try again.");
            }
        }
    }
}


