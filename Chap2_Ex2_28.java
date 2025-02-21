import java.util.Scanner;
public class Chap2_Ex2_28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float radius;
        System.out.print("Please Enter radius of the circle: ");
        radius=input.nextFloat();
        double diameter = 2*radius;
        double circumference = 2*3.14159*radius;
        double area =radius*3.14159;
        System.out.println("\nDiamenter of Circle:\t\t"+diameter);
        System.out.println("Circumference of Circle:\t"+circumference);
        System.out.println("Area of Circle:\t\t\t"+area);
        input.close();
    }
}
