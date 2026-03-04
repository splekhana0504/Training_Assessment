package Module3;

class BankAccount {
    int accountNumber;
    double balance;

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountNumber = 185;
        b.deposit(3000);
        b.withdraw(1000);
        System.out.println("Balance: " + b.balance);
    }
}
