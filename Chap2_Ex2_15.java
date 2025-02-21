import java.util.Scanner;
public class Chap2_Ex2_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1;
        int number2;
        int sum,product,difference,quotient;
        System.out.print("Enter first integer: ");
        number1=input.nextInt();
        System.out.print("Enter second integer: ");
        number2=input.nextInt();
        sum=number1+number2;
        System.out.println("Sum is: "+sum);
        product=number1*number2;
        System.out.println("Product is: "+product);
        difference=number1-number2;
        System.out.println("Difference is: "+difference);
        quotient=number1/number2;
        System.out.println("Qoutient is: "+quotient);
        input.close();
    }
}
