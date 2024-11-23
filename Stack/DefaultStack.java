package Stack;

import java.util.Stack;

public class DefaultStack {

  public static void main(String[] args) {
    Stack<Character> S1 = new Stack<Character>();

    S1.push('A');
    S1.push('G');
    S1.push('B');
    S1.push('H');

    System.out.println("Top S1: " + S1);

    S1.pop();
    S1.pop();

    System.out.println("Top S1: " + S1);
  }
}
