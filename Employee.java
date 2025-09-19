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
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     * Answer for Question 12
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        int ageDiff = (16 - age);
        if (age>=16){
            return true;
            printlf("This employee can drive");
        }
        else{
            return false;
            printlf("This employee can drive in " + ageDiff + " years");
        }
    }

    /**
     * Returns the net pay for the outstanding unpaid hours
     * Answer for Question 13
     */
    private double calculatePay(){
        return (unpaidHours * hourlyWage) - 30%;
    }

    /**
     * Output the payment record and resets unpaid hours
     * Answer for Question 14
     */
    public void paySalary(){
        pay = calculatePay();
        printlf(fullname + "has received a wire transfer of " + pay + " CAD");
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