import java.util.Scanner;
public class Chap2_Ex2_33 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your weight in puounds: ");
        double wightInPounds=input.nextFloat();
        System.out.print("Enter your hight in inches: ");
        double hightInInches=input.nextFloat();
        double BMI=wightInPounds*703/hightInInches*hightInInches;
        System.out.println("Your BMI is: "+BMI);
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("BNormal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
    input.close();
    }
}
