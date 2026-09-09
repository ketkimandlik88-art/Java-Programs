public class OperatorsDemo {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }

    int multiply(int a, int b) {
        return a * b;
    }

public static void main(String[] args) {

    int x = 20, y = 4;
    System.out.println("x + y = " + (x + y));
    System.out.println("x  - y = " + (x - y));
    System.out.println("x * y = " + (x * y));
    System.out.println("x / y = " + (x / y));
    System.out.println("x % y = " + (x % y));

    byte a = 30, b = 50;
    int result = a + b;
    System.out.println("Addition of a + b: " + result);

    OperatorsDemo obj = new OperatorsDemo();
    obj. add(6, 10 );
    int product = obj.multiply(2, 8);
    System.out.println("Multiplication: " + product);
}    
}