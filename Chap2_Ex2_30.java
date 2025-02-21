import java.util.Scanner;
public class Chap2_Ex2_30 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("Please enter five digit Number: ");
        number=input.nextInt();
        int a1=number%10;
        number=number/10;
        int a2=number%10;
        number=number/10;
        int a3=number%10;
        number=number/10;
        int a4=number%10;
        number=number/10;
        int a5=number%10;
        number=number/10;
        System.out.println(a5+"   "+a4+"   "+a3+"   "+a2+"   "+a1);
        input.close();
    }
}
