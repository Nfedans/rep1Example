public class Student {

    // Instance variables (or fields) are normally private.
    private String name;
    private String address;
    private int age;

    // Constructors - are called when object is created
    public Student() // no-argument constructor
    {
        name = "";
        address = "";
        age = 0;
    }

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // Instance Methods.
    // getter methods (accessors)
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getAge() {
        return this.age;
    }

    // setter methods (mutators)
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void print() {
        System.out.println("Name:\t\t" + this.name);
        System.out.println("Address:\t" + this.address);
        System.out.println("Age:\t\t" + this.age);
    }

    public String toString() {
        String out = "Name: " + this.name
                + ", Address: " + this.address
                + ", Age: " + this.age;

        return out;
    }
}