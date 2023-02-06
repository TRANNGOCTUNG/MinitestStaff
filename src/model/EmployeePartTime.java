package model;

public class EmployeePartTime extends Employee{
    private double numberWorkingHours;

   public EmployeePartTime(){

   }

    public EmployeePartTime(String employeeCode, String name, int age, String numberPhone, String email, double numberWorkingHours) {
        super(employeeCode, name, age, numberPhone, email);
        this.numberWorkingHours = numberWorkingHours;
    }

    public double getNumberWorkingHours() {
        return numberWorkingHours;
    }

    public void setNumberWorkingHours(double numberWorkingHours) {
        this.numberWorkingHours = numberWorkingHours;
    }
public double moneyPartTime(){
        return getNumberWorkingHours() * 100000;
}
    @Override
    public String toString() {
        return "EmployeePartTime{" +
                "numberWorkingHours=" + numberWorkingHours +
                '}'
                + super.toString();
    }
}
