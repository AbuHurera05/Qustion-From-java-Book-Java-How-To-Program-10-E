import java.util.Scanner;
public class Chap2_Ex2_24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1,number2,number3,number4,number5;
        System.out.print("Enter first number: ");
        number1=input.nextInt();
        System.out.print("Enter second number: ");
        number2=input.nextInt();
        System.out.print("Enter third number: ");
        number3=input.nextInt();
        System.out.print("Enter fourth number: ");
        number4=input.nextInt();
        System.out.print("Enter fifth number: ");
        number5=input.nextInt();
        int largeNo=number1;
        int smallNo=number1;
        if (number2>largeNo) 
            largeNo=number2;
        else
           smallNo=number2;
        if (number3>largeNo) 
            largeNo=number3;
        else
            smallNo=number3;
         if (number4>largeNo) 
            largeNo=number4;
        else
            smallNo=number4;
        if (number5>largeNo) 
            largeNo=number5;
        else
            smallNo=number5;
         System.out.println("Largest No is: "+largeNo);
         System.out.println("Smallest No is: "+smallNo);
         input.close();
           
    }
}
