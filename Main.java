public class Main {
    public static void main(String[] args) {
        double deposit = 60;
        double withdraw = 25;
        double processCheck = 50;
        String money;
        String moneyDeposited;
        String moneyWithdrawn;
        String checkProcessed;
        boolean completed;

        //Checking Account
        CheckingAccount myCheckingAccount =
                new CheckingAccount("Joe", 100);
        System.out.println("Checking Account:" +
                myCheckingAccount.getOwner());
        money = String.format("%.2f", myCheckingAccount.getBalance());
        System.out.println("Initial balance = $" + money);
        //Withdraw
        myCheckingAccount.withdraw(withdraw);
        moneyWithdrawn = String.format("%.2f", withdraw);
        money = String.format("%.2f", myCheckingAccount.getBalance());
        System.out.println("After withdrawing $" + moneyWithdrawn + ", balance = $" + money);

        System.out.println();

        // Savings Account
        SavingsAccount mySavingsAccount =
                new SavingsAccount("Emily", 200);
        System.out.println(" Savings Account: " +
                mySavingsAccount.getOwner());
        money = String.format("%.2f", mySavingsAccount.getBalance());
        System.out.println("Initial balance = $" + money);

        //Deposit
        mySavingsAccount.deposit(deposit);
        moneyDeposited = String.format("%.2f", deposit);
        money = String.format("%.2f",
                mySavingsAccount.getBalance());
        System.out.println("After depositing $" +
                moneyDeposited + ", balance = $" +
                money);
        checkProcessed = String.format("%.2f", processCheck);
        money = String.format("%.2f",

        //process check
        mySavingsAccount.getBalance());
        System.out.println("After processing check for $" +
                checkProcessed + ", balance = $" + money);

//Interest
        mySavingsAccount.postInterest();
        money = String.format("%.2f",
                mySavingsAccount.getBalance());
        System.out.println("After monthly interest " +
                "has been posted, " +
                "balance = $" + money);
        System.out.println();


    }
}

