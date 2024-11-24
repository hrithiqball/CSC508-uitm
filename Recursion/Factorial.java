package Recursion;

public class Factorial {

  public static int factorial(int num) {
    if (num == 0)
      return 1;
    else {
      System.out.println("num = " + num);
      return num * factorial(num - 1);
    }
  }

  public static void main(String[] args) {
    int num = factorial(4);
    System.out.println("Factorial : " + num);
  }
}
