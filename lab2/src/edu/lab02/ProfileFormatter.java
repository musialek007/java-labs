package edu.lab02;

public class ProfileFormatter {
    private Integer precision;

    public ProfileFormatter(Integer precision) {
        this.precision = precision;
    }

    public String format(Profile profile){
        return String.format("%." + precision.toString() + "f", profile.getArea());
    }
}

