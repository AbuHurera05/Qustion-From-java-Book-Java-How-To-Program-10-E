class Date{
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void displaydate(){
        System.out.println(day+"/"+month+"/"+year);
    }
}
public class DateTest {
    public static void main(String[] args) {
        Date date=new Date(23,5,2022);
        System.out.println("Initial date");
        date.displaydate();
        date.setDay(25);
        date.setMonth(4);
        date.setYear(2024);
        System.out.println("After changing");
        date.displaydate();
    }
}
