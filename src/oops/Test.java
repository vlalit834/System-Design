package oops;

public class Test {
    static void main(String[] args) {
        ThisKeyword t = new ThisKeyword("Lalit Verma");
        //method chaining
        t.setName("Lalit").displayName();
        t.introduce();
    }
}
