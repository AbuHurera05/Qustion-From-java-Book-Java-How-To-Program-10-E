import java.util.Calendar;
import java.util.Scanner;
class HeartProfile{
    private String firstName;
    private String lastName;
    private String gender;
    private int year;
    private int month;
    private int day;
    private double heightInInhes;
    private double wieghtInPounds;
    
    public HeartProfile(String firstName, String lastName, String gender, int year, int month, int day,
            double heightInInhes, double wieghtInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.year = year;
        this.month = month;
        this.day = day;
        this.heightInInhes = heightInInhes;
        this.wieghtInPounds = wieghtInPounds;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getHeightInInhes() {
        return heightInInhes;
    }
    public void setHeightInInhes(double heightInInhes) {
        this.heightInInhes = heightInInhes;
    }
    public double getWieghtInPounds() {
        return wieghtInPounds;
    }
    public void setWieghtInPounds(double wieghtInPounds) {
        this.wieghtInPounds = wieghtInPounds;
    }
    public int calculateAge(){
        Calendar today=Calendar.getInstance();
        int age=today.get(Calendar.YEAR)-year;
        if(month>today.get(Calendar.MONTH)+1|| (month == today.get(Calendar.DAY_OF_MONTH))){
            age--;
        }
        return age;
    }
    public int calculateMaxHertRate(){
        return 220-calculateAge();
    }
    public String targetHeartRate(){
        int maxHeartRate=calculateMaxHertRate();
        int minTargetHeartRate= (int)(maxHeartRate*0.5);
        int maxTargetHeartRate=(int)(maxHeartRate*0.85);
        return (minTargetHeartRate+" - "+ maxTargetHeartRate);
    }
    public void bmi(){
        double bmi= (wieghtInPounds/(heightInInhes*heightInInhes))*703;
        System.out.println("Your BMI is: "+bmi);
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("BNormal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
    }
}

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first name:");
        String firstName=input.nextLine();
        System.out.print("Enter first name:");
        String lastName=input.nextLine();
        System.out.println("Enter Gender: ");
        String gendr=input.nextLine();
        System.out.print("Enter day:");
        int day=input.nextInt();
        System.out.print("Enter mont from 1 to 12:");
        int month=input.nextInt();
        System.out.print("Enter year:");
        int year=input.nextInt();
        System.out.println("Enter Height in inches:");
        Double hight=input.nextDouble();
        System.out.println("Enter Weight in Pounds: ");
        Double weight=input.nextDouble();
        System.out.println();
        System.out.println("\t\tP E R S O N A L  I N F O M A T I O N ");
        HeartProfile hp=new HeartProfile(firstName, lastName, gendr, year, month, day, hight, weight);
        System.out.println("Name:"+hp.getFirstName()+" "+hp.getLastName());
        System.out.println("Gender: "+hp.getGender());
        System.out.println("Date of Birth: "+hp.getDay()+"/"+hp.getMonth()+"/"+hp.getYear());
        System.out.println("Age:"+hp.calculateAge());
        System.out.println("Maximum Heart Rate:"+hp.calculateMaxHertRate());
        System.out.println("Target Heart Rate Range:"+hp.targetHeartRate());
        System.out.println("Height: "+hp.getHeightInInhes());
        System.out.println("Weight: "+hp.getWieghtInPounds());
        hp.bmi();
        input.close();
    }
}
