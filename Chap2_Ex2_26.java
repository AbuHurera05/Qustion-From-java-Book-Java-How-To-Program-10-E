import java.util.Scanner;
public class Chap2_Ex2_26 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1,number2;
        System.out.println("Please first integer;");
        number1=input.nextInt();
        System.out.println("Please second integer;");
        number2=input.nextInt();
        if (number2%number1==0) 
            System.out.println(number1+" is the multiple of "+number2);
        else
            System.out.println(number1+" is not the multiple of "+number2);
            input.close();
    }
}
