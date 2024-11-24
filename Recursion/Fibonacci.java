package Recursion;

public class Fibonacci {

  private static int fibonacci(int number) {
    if (number == 0)
      return 0;
    else if (number == 1)
      return 1;
    else
      return fibonacci(number - 1) + fibonacci(number - 2);
  }

  public static void main(String[] args) {
    int number = fibonacci(6);

    System.err.println("Fibonacci of 6 is: " + number);
  }
}
