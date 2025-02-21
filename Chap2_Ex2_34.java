import java.util.Scanner;
public class Chap2_Ex2_34 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long currentPopulation=811883599;
        double growthRate=3.1;
        System.out.print("Enter the number of year to pridict the population: ");
        int year=input.nextInt();
        long estimatedPopulation=(long)(currentPopulation*Math.pow(growthRate, year));
        System.out.println("The estimated populations after "+year+" years is: "+estimatedPopulation);
        input.close();
    }
}
