
public class BankAccount {
        int numberOfAccounts = 2;
        double balance;
        String owner;
        String accountNumber;

        double monthlyInterestRate;

        double annualInterestRate;

        //Checking Account for Joe
public BankAccount() {
    BankAccount CheckingAccount = new BankAccount();
    CheckingAccount.owner = "Joe";
    CheckingAccount.balance = 100;
            accountNumber = numberOfAccounts + "";
            numberOfAccounts++;
        }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        monthlyInterestRate = annualInterestRate / 12;
    }
// Savings Account for Emily
public BankAccount(String name, double amount)
        {
            owner = "Emily";
            balance = 200;
            accountNumber = numberOfAccounts + "";
            numberOfAccounts++;
        }

//deposit to account
        public void deposit(double amount)
        {
            balance = balance + amount;
        }

        public boolean withdraw(double amount)
        {
            boolean completed = true;

            if (amount <= balance)
            {
                balance = balance - amount;
            }
            else
            {
                completed = false;
            }
            return completed;
        }

        public double getBalance()
        {
            return balance;
        }

        public String getOwner()
        {
            return owner;
        }

        public String getAccountNumber()
        {
            return accountNumber;
        }

        public void setBalance(double newBalance)
        {
            balance = newBalance;
        }
    public void setAccountNumber(String newAccountNumber)
        {
            accountNumber = newAccountNumber;
        }
    }