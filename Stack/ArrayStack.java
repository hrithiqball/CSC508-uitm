package Stack;

public class ArrayStack {
  int maxStackSize = 100;
  int[] newStack = new int[maxStackSize];
  int top;

  public ArrayStack() {
    top = 0;
  }

  public boolean isEmpty() {
    return top == 0;
  }

  public boolean isFull() {
    return top == maxStackSize;
  }

  public void push(int elem) {
    if (!isFull()) {
      newStack[top++] = elem;
    } else {
      System.out.println("Stack is full");
    }
  }

  public int pop() {
    if (!isEmpty()) {
      return (newStack[--top]);
    } else {
      System.out.println("Stack is empty");
      return 0;
    }
  }

  public void print() {
    System.out.print("Stack: ");

    if (isEmpty()) {
      System.out.println("Empty");
      return;
    }

    for (int i = 0; i < top; i++) {
      System.out.print(newStack[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    ArrayStack S1 = new ArrayStack();

    S1.print();

    S1.push(6);
    S1.push(7);
    S1.push(3);

    S1.print();

    S1.pop();

    S1.print();

    S1.push(4);
    S1.push(9);
    S1.push(1);

    S1.pop();

    S1.print();
  }

}
