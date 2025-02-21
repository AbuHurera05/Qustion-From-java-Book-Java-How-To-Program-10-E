import java.util.Scanner;
public class Chap2_Ex2_32 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1,number2,number3,number4,number5;
        System.out.println("Please enter five numbers: ");
        System.out.print("1. ");
        number1=input.nextInt();
        System.out.print("2. ");
        number2=input.nextInt();
        System.out.print("3. ");
        number3=input.nextInt();
        System.out.print("4. ");
        number4=input.nextInt();
        System.out.print("5. ");
        number5=input.nextInt();
        int positive=0;
        int negative=0;
        int zero=0;
        if (number1>0) 
            positive+=1;
        else if (number1<0) 
            negative+=1;
        else
            zero+=1;
        if (number2>0) 
            positive+=1;
        else if (number2<0) 
            negative+=1;
        else
            zero+=1;
        if (number3>0) 
            positive+=1;
        else if (number3<0) 
            negative+=1;
        else
            zero+=1;
        if (number4>0) 
            positive+=1;
        else if (number4<0) 
            negative+=1;
        else
            zero+=1;
        if (number5>0) 
            positive+=1;
        else if (number5<0) 
            negative+=1;
        else
            zero+=1;
        System.out.println("The number of positive numbers input: "+positive);
        System.out.println("The number of negative numbers input: "+negative);
        System.out.println("The number of zeroes numbers input: "+zero);
        input.close();
    }
}
