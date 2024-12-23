public class MyClass {
    private int x = 10;

    public void myMethod() {
        int x = 5; // Local variable x shadows instance variable x
        System.out.println(x); // Prints 5
        System.out.println(this.x); // Prints 10
    }
}