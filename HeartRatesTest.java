import java.util.Calendar;
import java.util.Scanner;
class HeartRates{
    private String firstName;
    private String lastName;
    private int year;
    private int month;
    private int day;
    public HeartRates(String firstName, String lastName, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.month = month;
        this.day = day;
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
        return (minTargetHeartRate+" to "+ maxTargetHeartRate);
    }
}
public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first name:");
        String firstName=input.nextLine();
        System.out.print("Enter first name:");
        String lastName=input.nextLine();
        System.out.print("Enter day:");
        int day=input.nextInt();
        System.out.print("Enter mont from 1 to 12:");
        int mont=input.nextInt();
        System.out.print("Enter year:");
        int yaer=input.nextInt();
        HeartRates hr=new HeartRates(firstName, lastName, yaer, mont, day);
        System.out.println();
        System.out.println("\t\tP E R S O N A L  D A T A");
        System.out.println("Name:"+hr.getFirstName()+" "+hr.getLastName());
        System.out.println("Date of Birth: "+hr.getDay()+"/"+hr.getMonth()+"/"+hr.getYear());
        System.out.println("Age:"+hr.calculateAge());
        System.out.println("Maximum Heart Rate:"+hr.calculateMaxHertRate());
        System.out.println("Target Heart Rate Range:"+hr.targetHeartRate());
        input.close();
    }
}
