class Account1{
    private String name;
    private double balance;
    public Account1(String name, double balance) {
        this.name = name;
        if (balance>0.0) {
            this.balance = balance;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance>0.0) {
            this.balance = balance;
        }
    }
    public void withdraw(double amount){
        if (amount<balance) {
            this.balance=balance-amount;
            System.out.println("Withdraw amount is: "+balance);
        }
        else
            System.out.println("Withdrawal amount exceeded account balance." );
    }
    
}
public class AccountTest1 {
    public static void main(String[] args) {
        Account1 acc=new Account1("Hurera", 2000);
        System.out.println("Name: "+acc.getName());
        System.out.println("The initial balance is: "+acc.getBalance());
        acc.withdraw(5000);
        System.out.println("After Withdraw balance is: "+acc.getBalance());
    }
}
