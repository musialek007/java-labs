package edu.lab03;

public class Lecturer extends Employee{
    protected Integer overtime;
    private static final String KIND = "WYKŁADOWCA";

    public static String KIND(){
        return KIND;
    }

    public Lecturer(Employee e, int ov) {
        super(e, e.getEmpRate(), e.getBaseSalary());
        setOvertime(ov);
    }

    @Override
    public String info() {
        return super.info() + "\n\t\ta ściślej " + KIND + " i ma " + overtime + " nadgodzin";
    }

    public Integer getOvertime() {
        return overtime;
    }

    public void setOvertime(Integer overtime) {
        this.overtime = overtime;
    }
}
