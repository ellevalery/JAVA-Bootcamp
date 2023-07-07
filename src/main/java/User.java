class User {
    private int accountNumber;
    private double balance;
    private String name;
    private String gender;

    public User(int accountNumber, double balance, String name, String gender) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.gender = gender;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        balance += amount;
        System.out.println("Credited " + amount + " to account number: " + accountNumber);
    }

    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Debited " + amount + " from account number: " + accountNumber);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account number: " + accountNumber + ", Balance: " + balance);
    }
}