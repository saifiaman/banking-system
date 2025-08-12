package banking.entities;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit){
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount){
        if(amount <= balance + overdraftLimit){
            System.out.println(amount + " withdrawn. " + balance + "remaining balance");
        }
        else{
            System.out.println("Overdraft limit exceeded!");
        }
    }

    @Override
    public void displayAccountDetails(){
        System.out.println("Current Account - Account Number : " + accountNumber + ", Account Holder Name : " + accountHolderName + ", Balance : " + balance);
    }
}
