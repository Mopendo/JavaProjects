package Chapter3;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(){
        firstName = "Nil";
        lastName = "Nil";
        monthlySalary = 0.0;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public void setMonthlySalary (double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public double getYearlySalary()
    {
        return monthlySalary * 12; // yearly salary
    }
    //method to retrieve yearly salary after giving 10% raise
    public double getRaiseSalary(){
        double raise = monthlySalary * 0.1;
        double raiseSalary = (monthlySalary + raise) *12;
        return raiseSalary;
    }
}
