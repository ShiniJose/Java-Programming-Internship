class UserBankAccount {
    double accountBal;

    public UserBankAccount(double accountBal) {
        this.accountBal = accountBal;
        System.out.println("Your Account Balance is: " + accountBal);
    }

    void checkBalance() {
        System.out.println("Your Account Balance is: " + accountBal);
        System.out.println("");
    }

    public static void main(String[] args) {
        AtmMachine1 atm = new AtmMachine1();
        UserBankAccount uba = new UserBankAccount(20000.0);

        atm.moneyWithdraw();
        atm.moneyDeposit();
        uba.checkBalance();
    }
}