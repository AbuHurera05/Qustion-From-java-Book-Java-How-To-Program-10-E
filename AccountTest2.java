import java.util.Scanner;
class Account2{
    private String name;
    private double amount;
    public Account2(String name, double amount) {
        this.name = name;
        if (amount>0.0) {
            this.amount = amount;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAmount() {
        return amount;
    }
    public void diposit(double dipositamount) {
        if (dipositamount>0.0) {
            this.amount = amount+dipositamount; 
        }
        
    }
}
public class AccountTest2 {
    public static void displayAccount2(Account2 accountToDisplay) 
    {
        System.out.println(accountToDisplay.getName()+"   \t    :        "+accountToDisplay.getAmount());
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Account2 acc1=new Account2("Abu Hurera", 100);
        Account2 acc2=new Account2("Aslam", 400);
        System.out.println("Initial Value of Account1\nName       \t    :        Amount");
        displayAccount2(acc1);
        System.out.println("Initial Value of Account2\nName        \t    :        Amount");
        displayAccount2(acc2);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Enter deposit amount for account1");
        double amount1=input.nextDouble();
        acc1.diposit(amount1);
        System.out.println("Enter deposit amount for account2");
        double amount2=input.nextDouble();
        acc2.diposit(amount2);
        System.out.println("New Value of Account1\nName       \t    :        Amount");
        displayAccount2(acc1);
        System.out.println("New Value of Account2\nName        \t    :        Amount");
        displayAccount2(acc2);
        input.close();
    }
}
