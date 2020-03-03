package org.example;

public class Person {
    private String name;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public Person()
    {}

    public Person(String nm, int bd, int bm, int by)
    {
        this.name = nm;
        this.birthDay = bd;
        this.birthMonth = bm;
        this.birthYear = by;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int CalculateAge()
    {
        return 2020 - getBirthYear();
    }
}
