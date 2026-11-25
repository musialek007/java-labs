package edu.lab03;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Jan", "Kowalski", 1999, 99010112345L );
        Student student = new Student("Tomasz", "Iksinski", 92051212345L, "Informatyka stosowana", 4);
        Employee employee = new Employee("Janusz", "Nowak", 88030312345L, 0.5, 5000.0);
        Lecturer lecturer = new Lecturer(new Employee("Jan", "Kos", 77070712345L, 1.0, 5555.50), 50);
        Driver driver = new Driver(new Employee("Karol", "Krawczyk", 66112212345L, 0.75, 2000.0), 2345.0);

        System.out.println("--- Obiekt Person ---");
        System.out.println(person.info());

        System.out.println("\n--- Obiekt Student ---");
        System.out.println(student.info());
        System.out.println(student.studyReport());

        System.out.println("\n--- Obiekt Employee ---");
        System.out.println(employee.info());
        System.out.printf("Wyliczona pensja: %.2f zł%n", employee.calculateSalary());

        System.out.println("\n--- Obiekt Lecturer ---");
        System.out.println(lecturer.info());
        System.out.printf("Wyliczona pensja (z nadgodzinami): %.2f zł%n", lecturer.calculateSalary());

        System.out.println("\n--- Obiekt Driver ---");
        System.out.println(driver.info());
        System.out.printf("Wyliczona pensja (z dodatkiem): %.2f zł%n", driver.calculateSalary());

        // person.setBirthYear(1850); // Zgłasza wyjątek: Niepoprawny rok urodzenia (poniżej 1900)
        // person.setBirthYear(2050); // Zgłasza wyjątek: Niepoprawny rok urodzenia (powyżej obecnego roku)
        // student.setPesel(100L);    // Zgłasza wyjątek: Niepoprawny numer PESEL (poniżej 210000000L)

        System.out.println("\n--- Tablica polimorficzna people ---");
        Person[] people = new Person[5];
        people[0] = new Person("Anna", "Nowak", 1995, 95020211111L);
        people[1] = new Student("Jan", "Kos", 99010133333L, "Informatyka", 4);
        people[2] = new Employee("Piotr", "Zieliński", 85040422222L, 1.0, 4800.0);
        people[3] = new Lecturer(new Employee("Wojciech", "Kowalczyk", 80010112345L, 1.0, 5000.0), 50);
        people[4] = new Driver(new Employee("Marek", "Mostowiak", 75060644444L, 1.0, 4200.0), 1200.0);

        for (Person p : people) {
            System.out.println(p.info());
        }
    }
}
