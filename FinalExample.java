// Simple program using final keyword
class Parent {
    final int number = 100;   // final variable

    final void showMessage() {   // final method
        System.out.println("This is a final method.");
    }
}

// Final class (cannot be inherited)
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

public class FinalExample {
    public static void main(String[] args) {
        Parent obj = new Parent();

        // Using final variable
        System.out.println("Final variable value: " + obj.number);

        // obj.number = 200;

        // Calling final method
        obj.showMessage();

        // Using final class
        FinalClass f = new FinalClass();
        f.display();
    }
}
