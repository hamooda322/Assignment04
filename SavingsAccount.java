public class SavingsAccount extends BankAccount{
    double rate= 0.05;
    int savingsNumber= 0;
    String accountNumber;
    public SavingsAccount(String name, double amt){
        super(name,amt);
        this.accountNumber = super.getAccountNumber()+ "-"+savingsNumber;
    }
    public void postInterest(){

    }
    public String getAccountNumber(){
        return null;
    }
    public SavingsAccount(SavingsAccount acc,double balance){
        super(String.valueOf(acc), balance);
        this.accountNumber = super.getAccountNumber()+ "-"+ savingsNumber;
    }
}