package edu.lab03;

import java.time.Year;

public class Person {
    protected String name;
    protected String familyName;
    protected Integer birthYear;
    protected Long pesel;

    public static String NATIONALITY ="PL";
    private static final String KIND = "OSOBA";

    public Person(String name, String familyName, Integer birthYear, Long pesel) {
        this.name = name;
        this.familyName = familyName;
        this.birthYear = birthYear;
        this.pesel = pesel;
    }

    public Person(String name, String familyName, Long pesel) {
        setName(name);
        setFamilyName(familyName);
        setPesel(pesel);

        int year = Math.toIntExact(pesel/1000000000L);
        year += ((Math.toIntExact((pesel % 1000000000L)/10000000L)<13) ? 1900 : 2000);
        this.birthYear = year;
    }

    public Person(Person person){
        this.name = person.name;
        this.familyName = person.familyName;
        this.birthYear = person.birthYear;
        this.pesel = person.pesel;
    }

    public static String getKIND() {
        return KIND;
    }

    public String info(){
        return name + " " + familyName + ", ur. w " + birthYear + ", PESEL " + pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        if((birthYear < 1900) || (birthYear > Year.now().getValue()))
            throw new IllegalArgumentException("Niepoprawny rok urodzenia");
       this.birthYear = birthYear;
    }

    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long pesel) {
        if((pesel < 210000000L) || (pesel > 99999999999L))
            throw new IllegalArgumentException("Niepoprawny pesel");
        this.pesel = pesel;
    }

    public static String getNATIONALITY() {
        return NATIONALITY;
    }

    public static void setNATIONALITY(String NATIONALITY) {
        Person.NATIONALITY = NATIONALITY;
    }
}
