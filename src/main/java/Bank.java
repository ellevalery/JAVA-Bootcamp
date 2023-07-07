import java.util.ArrayList;
import java.util.List;


class Bank {
    private List<User> users;

    public Bank() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void replaceUser(int accountNumber, User newUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAccountNumber() == accountNumber) {
                users.set(i, newUser);
                System.out.println("User with account number: " + accountNumber + " replaced successfully.");
                return;
            }
        }
        System.out.println("User with account number: " + accountNumber + " not found.");
    }

    public void creditUser(int accountNumber, double amount) {
        for (User user : users) {
            if (user.getAccountNumber() == accountNumber) {
                user.credit(amount);
                return;
            }
        }
        System.out.println("User with account number: " + accountNumber + " not found.");
    }

    public void debitUser(int accountNumber, double amount) {
        for (User user : users) {
            if (user.getAccountNumber() == accountNumber) {
                user.debit(amount);
                return;
            }
        }
        System.out.println("User with account number: " + accountNumber + " not found.");
    }

    public void displayUserBalance(int accountNumber) {
        for (User user : users) {
            if (user.getAccountNumber() == accountNumber) {
                user.displayBalance();
                return;
            }
        }
        System.out.println("User with account number: " + accountNumber + " not found.");
    }
}