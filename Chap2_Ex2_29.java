import java.util.Scanner;
public class Chap2_Ex2_29 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        char cha;
        System.out.println("Please enter any character: ");
        cha=input.next().charAt(0);
        System.out.println("The character "+cha+" has the value "+(int)cha);
        input.close();
    }
}
