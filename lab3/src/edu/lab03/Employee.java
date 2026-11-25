package edu.lab03;

public class Employee extends Person{
    protected Double empRate;
    protected Double baseSalary;

    private static final String KIND = "PRACOWNIK";

    public Employee(Person person, Double empRate, Double baseSalary) {
        super(person);
        this.empRate = empRate;
        this.baseSalary = baseSalary;
    }

    public Employee(String name, String familyName, Long pesel, Double empRate, Double baseSalary) {
        super(name, familyName, pesel);
        this.empRate = empRate;
        this.baseSalary = baseSalary;
    }

    public static String  getKIND() {
        return KIND;
    }

    public Double calculateSalary(){
        return baseSalary * empRate;
    }

    @Override
    public String info() {
        return super.info() + "\n\tto " + KIND + " o wymiarze etatu: " + empRate
                + " i pensji zasadniczej " + baseSalary;
    }

//Gettery i Settery
    public Double getEmpRate() {
        return empRate;
    }

    public void setEmpRate(Double empRate) {
        this.empRate = empRate;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
