class Person {
    // properties or fields
    String name;
    int age;

    // methods
    void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
    void sayHello() {
        System.out.println("Hello!");
    }
    void introduce(String friendName) {
        System.out.println("This is my friend " + friendName);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John Doe";
        person1.age = 30;
        person1.speak(); // will print "My name is John Doe and I am 30 years old."
        person1.sayHello(); // will print "Hello!"
        person1.introduce("Jane"); // will print "This is my friend Jane"

        Person person2 = new Person();
        person2.name = "Jane Smith";
        person2.age = 25;
        person2.speak(); // will print "My name is Jane Smith and I am 25 years old."
        person2.sayHello(); // will print "Hello!"
        person2.introduce("John"); // will print "This is my friend John"
    }
}
