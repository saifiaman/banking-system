package banking.entities;

public class SavingAccount extends Account {
    private double interstRate;

    public SavingAccount(String accountNumber, String accountHolderName, double balance, double interstRate){
        super(accountNumber, accountHolderName, balance);
        this.interstRate = interstRate;
    }

    public void addInterst(){
        double interst = balance * (interstRate)/100;
        deposit(interst);
    }

    @Override
    public void displayAccountDetails(){
        System.out.println("Saving Account - Account Number : " + accountNumber + ", Account Holder Name : " + accountHolderName + ", Balance : " + balance);
    }
}
