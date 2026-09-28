class BankAccount{
    public String acctHolder;
    private double balance;
    BankAccount(String acctHolder, double balance){
        this.acctHolder = acctHolder;
    }
    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    class Transaction {

        void deposit(double amt) {
            balance += amt;
            System.out.println("Deposited: " + amt);
            System.out.println("New Balance: " + balance);
        }

        void withdraw(double amt) {
            if (balance < amt) {
                System.out.println("Insufficient balance");
            } else {
                balance -= amt;
                System.out.println("Withdrawn: " + amt);
                System.out.println("New Balance: " + balance);
            }
        }
    }
}

public class Bank {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Babar", 10000);

        BankAccount.Transaction t = account.new Transaction();

        t.deposit(5000);
        t.withdraw(3000);
        t.withdraw(15000);
    }
}
