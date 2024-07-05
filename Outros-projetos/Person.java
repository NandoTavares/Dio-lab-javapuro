public class Person {
    public String name;
    public String dateBirth;

    public Person(String name, String dateBirth) {
        this.name = name;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Date Birth: " + dateBirth;
    }
}
