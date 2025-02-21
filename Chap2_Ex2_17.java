import java.util.Scanner;
public class Chap2_Ex2_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int sum,produt,average;
        System.out.print("Enter first number: ");
        number1=input.nextInt();
        System.out.print("Enter second number: ");
        number2=input.nextInt();
        System.out.print("Enter third number: ");
        number3=input.nextInt();
        sum=number1+number2+number3;
        average=sum/3;
        produt=number1*number2*number3;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        System.out.println("Product: "+produt);
        int largest=number1;
        int smallest=number1;
        if (number2>largest) 
            largest=number2;
        else
            smallest=number2;
        if(number3>largest)
            largest=number3;
        else
            smallest=number3;
        System.out.println(largest+" is the largest Number");
        System.out.println(smallest+" is the smallest Number");
        input.close();
    }
}


