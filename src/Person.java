public class Person {


    private int age;
    private String firstname;
    private String lastName;
    private Adress adress;


    public Person(int age, String firstname, String lastName, Adress adress) {
        this.age = age;
        this.firstname = firstname;
        this.lastName = lastName;
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress=" + adress +
                '}';
    }
}
