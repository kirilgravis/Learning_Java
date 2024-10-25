public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Calculator calc = new Calculator();
        int sum = calc.add(5, 10);
        System.out.println("Sum of 5 and 10 is: " + sum);
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}