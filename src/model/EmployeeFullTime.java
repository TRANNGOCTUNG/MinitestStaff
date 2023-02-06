package model;

public class EmployeeFullTime extends Employee implements Comparable<EmployeeFullTime>{
    private double moneyReward;
    private double moneyFindAmount;
    private double moneyHardSalary;
    public EmployeeFullTime(){

    }

    public EmployeeFullTime(String employeeCode, String name, int age, String numberPhone, String email, double moneyReward, double moneyFindAmount, double moneyHardSalary) {
        super(employeeCode,name,age,numberPhone,email);
        this.moneyReward = moneyReward;
        this.moneyFindAmount = moneyFindAmount;
        this.moneyHardSalary = moneyHardSalary;
    }

    public double getMoneyReward() {
        return moneyReward;
    }

    public void setMoneyReward(double moneyReward) {
        this.moneyReward = moneyReward;
    }

    public double getMoneyFindAmount() {
        return moneyFindAmount;
    }

    public void setMoneyFindAmount(double moneyFindAmount) {
        this.moneyFindAmount = moneyFindAmount;
    }

    public double getMoneyHardSalary() {
        return moneyHardSalary;
    }

    public void setMoneyHardSalary(double moneyHardSalary) {
        this.moneyHardSalary = moneyHardSalary;
    }
   public double moneyFullTime(){
        return getMoneyHardSalary() + getMoneyReward() - getMoneyFindAmount();
   }

    @Override
    public String toString() {
        return "EmployeeFullTime{" +
                "moneyReward=" + moneyReward +
                ", moneyFindAmount=" + moneyFindAmount +
                ", moneyHardSalary=" + moneyHardSalary +
                '}'
                +super.toString();
    }

    @Override
    public int compareTo(EmployeeFullTime o) {
        return (int) (getMoneyHardSalary() - o.getMoneyHardSalary());
    }
}
