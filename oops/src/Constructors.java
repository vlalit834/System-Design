/* 
- automatically invoked when object is created or instantiated 
- no return value 
- name is same to the the class name only 
- supports overloading i.e multiple constructors but with different parameters 
*/

//type 1 default constructor 
/*
if constructor is not mentioned then automatically provide default values \
int 0 
double 0.0
boolean false 
object null
*/
class DefaultConstructor {
    int rno;
    double age;
    boolean married;
    Object obj;

    @Override
    public String toString() {
        return "DefaultConstructor [rno=" + rno + ", age=" + age + ", married=" + married + ", obj=" + obj + "]";
    }

}

// custom default constructor
class CustomDefaultConstructor {
    String title;
    int duration;

    public CustomDefaultConstructor() {
        this.title = "Null";
        this.duration = 0;
    }

    @Override
    public String toString() {
        return "CustomDefaultConstructor [title=" + title + ", duration=" + duration + "]";
    }
}

// Parameterized constructor
class ParameterizedConstructor {
    int age;
    String name;

    public ParameterizedConstructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ParameterizedConstructor [age=" + age + ", name=" + name + "]";
    }

}

// Copy Constructor
class CopyConstructor {
    String name;
    int age;

    public CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public CopyConstructor(CopyConstructor other) {
        this.name = other.name;
        this.age = other.age;
    }

    @Override
    public String toString() {
        return "CopyConstructor [name=" + name + ", age=" + age + "]";
    }
}

// Private Constructors
class PrivateConstructor {
    private static PrivateConstructor instance;

    private PrivateConstructor() {
    }

    public static PrivateConstructor getInstance() {
        if (instance == null) {
            instance = new PrivateConstructor();
        }
        return instance;
    }
}

public class Constructors {
    public static void main(String[] args) {
        DefaultConstructor c1 = new DefaultConstructor();
        System.out.println(c1);

        CustomDefaultConstructor c2 = new CustomDefaultConstructor();
        System.out.println(c2);

        ParameterizedConstructor c3 = new ParameterizedConstructor(10, "Lalit");
        System.out.println(c3);

        CopyConstructor c4 = new CopyConstructor("Lalit", 10);
        System.out.println(c4);

        CopyConstructor c5 = new CopyConstructor(c4);
        System.out.println(c5);

        PrivateConstructor c6 = PrivateConstructor.getInstance();
        PrivateConstructor c7 = PrivateConstructor.getInstance();
        System.out.println(c6 == c7);

        
    }
}
