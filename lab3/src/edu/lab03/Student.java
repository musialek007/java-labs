package edu.lab03;

public class Student extends Person{
    protected String field;
    protected Integer semester;
    private static final String KIND = "STUDENT";

    public Student(Person person, String field, int semester) {
        super(person);
        this.field = field;
        this.semester = semester;
    }

    public Student(String name, String familyName, Long pesel, String field, int semester) {
        super(name, familyName, pesel);
        this.field = field;
        this.semester = semester;
    }

    public static String getKIND(){
        return KIND;
    }

    public String studyReport(){
        return "Potwierdzenie: " + name + " " + familyName + ", jest studentem "
                + semester + " semestru na kierunku " + field;
    }

    @Override
    public String info() {
        return super.info() + "\n\tjest to " + KIND + " kierunku \"" + field + "\", semestr " + semester;
    }

    public String getField() {
        return field;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }
}
