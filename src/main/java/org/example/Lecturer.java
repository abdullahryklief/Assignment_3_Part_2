package org.example;

public class Lecturer {
    private String empNum;
    private long salary;
    private Person personObject;

    public Lecturer()
    {}

    public Lecturer(String empNum, long sal, String name, int birthDay, int birthMonth, int birthYear)
    {
        this.personObject = new Person(name, birthDay, birthMonth, birthYear);
        this.empNum = empNum;
        this.salary = sal;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void salaryIncrease(long amount)
    {
        salary += amount;
    }
}
