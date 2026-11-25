package edu.lab03;

public class Driver extends Employee{
    protected Double distanceBonus;
    private static final String KIND = "KIEROWCA";

    public Driver(Employee e, Double distanceBonus) {
        super(e, e.getEmpRate(), e.getBaseSalary());
        setDistanceBonus(distanceBonus);
    }

    public static String getKIND(){
        return KIND;
    }

    @Override
    public Double calculateSalary() {
        return super.calculateSalary() + distanceBonus;
    }

    @Override
    public String info() {
        return super.info() + "\n\t\ta ściślej " + KIND + " z dodatkiem za odległość: " + distanceBonus;
    }

    public Double getDistanceBonus() {
        return distanceBonus;
    }

    public void setDistanceBonus(Double distanceBonus) {
        this.distanceBonus = distanceBonus;
    }
}
