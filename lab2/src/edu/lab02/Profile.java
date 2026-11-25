package edu.lab02;

public class Profile {
    private String name;
    protected Double h;
    protected Double bf;
    protected Double tf;
    protected Double tw;
    protected Double R;
    protected  Double area;
    private static String standard = "PN-EN 10056-1:2000";

    public static String getStandard() {
        return standard;
    }

    private void calculateArea(){
        area = 2 * bf * tf + tw * (h - 2 * tf) + R * R * ( 4 - Math.PI);
    }

    public Double getArea() {
        return area;
    }

    public final void setParams(Double h ,Double bf, Double tf, Double tw, Double R){
        this.h = h;
        this.bf = bf;
        this.tf = tf;
        this.tw = tw;
        this.R = R;

        if(h > 0 || bf > 0 || tf > 0 || tw > 0 || R > 0){
            calculateArea();
        }
        else{
            throw new NumberFormatException("Bad argument range");
        }
    }

    public Profile(String name, Double h, Double bf, Double tf, Double tw, Double R) {
        this.name = name;
        setParams(h, bf, tf, tw, R);
    }

    public Profile() {
        this.name = "I_100";
        setParams(100., 50., 6.8, 4.5, 4.5);
    }
}
