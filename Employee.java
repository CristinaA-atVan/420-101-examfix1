/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true if an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true if an employee is above 16 years old
     * Answer for Question 12
     * Fixed
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        int ageDiff = (16 - age);
        if (age>=16){
            System.out.println("This employee can drive");
            return true;
        }
        else{
            System.out.println("This employee can drive in " + ageDiff + " year(s)");
            return false;
        }
    }

    /**
     * Returns the net pay for the outstanding unpaid hours
     * Answer for Question 13
     * Fixed
     */
    private double calculatePay(){
        double untaxedValue = unpaidHours * hourlyWage;
        double taxPercent = 0.30;
        double tax = untaxedValue * taxPercent;
        return untaxedValue - tax;
    }

    /**
     * Output the payment record and resets unpaid hours
     * Answer for Question 14
     * Fixed
     */
    public void paySalary(){
        double pay = calculatePay();
        System.out.println(fullname + " has received a wire transfer of " + pay + " CAD");
        unpaidHours = 0;
    }
    
    /**
     * Setter method for Question 11
     */
    public void setWage(double newWage){
        newWage = hourlyWage;
    }
    
    /**
     * Getter method for Question 11
     */
    public double getWage(){
        return hourlyWage;
    }
}