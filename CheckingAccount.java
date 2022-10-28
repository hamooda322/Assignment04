class CheckingAccount extends BankAccount {
    int insuffiecientFundsFee = 15;
    public CheckingAccount(String name, double amount){
        super(name,amount);
    }
    public boolean withdraw(double amount){
        double totalAmount = amount + insuffiecientFundsFee;
        return super.withdraw(totalAmount);
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