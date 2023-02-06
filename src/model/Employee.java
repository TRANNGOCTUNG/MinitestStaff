package model;

public  class Employee {
    private String employeeCode;
    private String name;
    private int age;
    private String numberPhone;
    private String email;

    public Employee() {
        this.employeeCode = "01";
        this.name = "Lương Đình Vương";
        this.age = 23;
        this.numberPhone = "0350656262" ;
        this.email = "vuongxu@gamil.com";
    }

    public Employee(String employeeCode, String name, int age, String numberPhone, String email) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.age = age;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode=" + employeeCode +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
