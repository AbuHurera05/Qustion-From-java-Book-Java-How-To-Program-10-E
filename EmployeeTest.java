class Employee{
    private String firstName;
    private String lastName;
    private double monthlySalary;
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary>0.0) {
            this.monthlySalary = monthlySalary;
        }
        
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
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary>0.0) {
            this.monthlySalary = monthlySalary+monthlySalary;
        }
        
    }
    public double getYearlySalary(){
        return monthlySalary*12;
    }
    public void riseSalary(double percentage){
        monthlySalary=monthlySalary*(1+percentage/100);
    }
    
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1=new Employee("Muhammad", "Aslam", 200);
        Employee employee2=new Employee("Abu", "Hurera", 1000);
        System.out.println("Employee 1: "+employee1.getFirstName()+" "+employee1.getLastName());
        System.out.println("Employee1 Yearly Salary: "+employee1.getYearlySalary());
        System.out.println("Employee 2:  "+employee2.getFirstName()+" "+employee2.getLastName());
        System.out.println("Employee2 Yearly Salary: "+employee2.getYearlySalary());
        employee1.riseSalary(10);
        employee2.riseSalary(10);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Rising 10% Salary");
        System.out.println("Employee 1:  "+employee1.getFirstName()+" "+employee1.getLastName());
        System.out.println("Employee1 Yearly Salary: "+employee1.getYearlySalary());
        System.out.println("Employee 2:  "+employee2.getFirstName()+" "+employee2.getLastName());
        System.out.println("Employee2 Yearly Salary: "+employee2.getYearlySalary());
        
    }
}
