package org.example;

public class Student {
    private String stNo;
    private String course;
    private long fees;
    private Person personObject;

    public Student()
    {}

    public Student(String stNo, String course, long fees, String name, int birthDay, int birthMonth, int birthYear)
    {
        this.personObject = new Person(name, birthDay, birthMonth, birthYear);
        this.stNo = stNo;
        this.course = course;
        this.fees = fees;
    }

    public String getStNo() {
        return stNo;
    }

    public void setStNo(String stNo) {
        this.stNo = stNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public long getFees() {
        return fees;
    }

    public void setFees(long fees) {
        this.fees = fees;
    }

    public void payFees(long amount)
    {
        fees = fees - amount;
    }
}
