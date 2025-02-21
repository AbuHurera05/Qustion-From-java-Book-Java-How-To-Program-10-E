import java.util.Scanner;
public class Chap2_Ex2_35 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter total miles driven per day: ");
        double milesPerDay=input.nextDouble();
        System.out.println("Enter cost per gallon of gasoline: ");
        double costPerGallon=input.nextDouble();
        System.out.println("Enter Average miles per gallon: ");
        double averageMilesPerGallon=input.nextDouble();
        System.out.println("Enter Parking fees per day: ");
        double parkinPerDay=input.nextDouble();
        System.out.println("Enter tolls per day: ");
        double tollsPerDay=input.nextDouble();
        double totalCostPerDay=(milesPerDay/averageMilesPerGallon)*costPerGallon+parkinPerDay+tollsPerDay;
        System.out.println("Your daily driving cost is: "+totalCostPerDay);
        double milesDriveWithCarpool=milesPerDay*0.5;
        double totalCostPerDayWithCarpool=(milesDriveWithCarpool/averageMilesPerGallon)*costPerGallon+parkinPerDay+tollsPerDay;
        double potentialSavings=totalCostPerDay-totalCostPerDayWithCarpool;
        System.out.println("By carpooling you could save: "+potentialSavings+" Per day.");
        input.close();
    }
}
