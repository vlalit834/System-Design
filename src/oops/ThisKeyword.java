package oops;

public class ThisKeyword {
    private final int age;
    private String name;

    ThisKeyword(String name) {
        this(name, 18);//constructor chaining it will call other constructor
    }

    ThisKeyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    ThisKeyword setName(String name) {
        this.name = name;
        return this; // method chaining
    }

    public void displayName() {
        System.out.println("Name is " + name);
    }

    public void greet(ThisKeyword person) {
        System.out.println("Hello ");
        person.displayName();
    }

    public void introduce() {
        greet(this);
    }
}
