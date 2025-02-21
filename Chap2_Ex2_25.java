import java.util.Scanner;
public class Chap2_Ex2_25 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number;
        System.out.print("Enter any Integer: ");
        number=input.nextInt();
        if (number%2==0) 
            System.out.println(number+" is even number.");
        else if (number%2==1) 
            System.out.println(number+" is Odd number:");
        else
            System.out.println("Please input Correct Integer");
            input.close();      
    }
}
