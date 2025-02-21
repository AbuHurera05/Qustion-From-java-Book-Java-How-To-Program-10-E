import java.util.Scanner;
public class Chap2_Ex2_16 {
    public static void main(String[] args) {
        int number1;
        int number2;
        System.out.print("Enter first number: ");
        Scanner input=new Scanner(System.in);
        number1=input.nextInt();
        System.out.print("Enter second number: ");
        number2=input.nextInt();
        if (number1>number2) 
            System.out.println(number1+" is larger");
        if(number1<number2)
        System.out.println(number2+" is larger");
        if (number1==number2) 
        System.out.println("\n"+number1+" and "+number2+"These numbers are Equal");

        input.close();
    }
}
