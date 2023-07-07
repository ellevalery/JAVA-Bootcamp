public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Registering users
        User user1 = new User(12345, 1000, "John Doe", "Male");
        User user2 = new User(67890, 2000, "Jane Smith", "Female");
        bank.addUser(user1);
        bank.addUser(user2);

        // Performing operations
        bank.displayUserBalance(12345); // Display balance for user with account number 12345
        bank.creditUser(12345, 500); // Credit 500 to user with account number 12345
        bank.displayUserBalance(12345);
        bank.debitUser(12345, 200); // Debit 200 from user with account number 12345
        bank.displayUserBalance(12345);

        // Replacing a user
        User newUser = new User(12345, 5000, "John Doe", "Male");
        bank.replaceUser(12345, newUser);
        bank.displayUserBalance(12345);
    }
}




