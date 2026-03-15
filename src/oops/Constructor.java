package oops;

public class Constructor {
    int l;
    String name;

    //Default Constructor

    //Parameterized Constructor
    Constructor(int l, String name) {
        this.l = l;
        this.name = name;
    }

    //Copy Constructor
    Constructor(Constructor other) {
        this.l = other.l;
        this.name = other.name;
    }

    //Private Constructor
    private Constructor() {
    }
}
