public class MyClass {
    private int x = 10;

    public void myMethod() {
        int y = 5; // Changed local variable name to avoid shadowing
        System.out.println(y); // Prints 5
        System.out.println(this.x); // Prints 10
    }
}