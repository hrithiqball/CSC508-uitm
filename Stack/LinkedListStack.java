package Stack;

import Helper.Node;

public class LinkedListStack {
  private Node top;

  LinkedListStack() {
    top = null;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public void push(int elem) {
    Node newNode = new Node(elem);
    newNode.next = top;
    top = newNode;
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack is empty");

      return 0;
    } else {
      int poppedValue = top.data;
      top = top.next;

      return poppedValue;
    }
  }

  public void print() {
    System.out.print("Stack: ");

    if (isEmpty()) {
      System.out.println("Empty");
      return;
    }

    Node current = top;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }

    System.out.println();
  }

  public static void main(String[] args) {
    LinkedListStack S1 = new LinkedListStack();

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
