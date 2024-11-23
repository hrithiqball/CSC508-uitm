package LinkedList;

import Helper.Node;

public class DefinedLinkedList {
  Node head;
  Node tail;
  int size;

  DefinedLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  private void insertFirst(int elem) {
    Node newNode = new Node();

    newNode.data = elem;
    newNode.next = head;
    head = newNode;

    if (tail == null)
      tail = head;

    size++;
  }

  private void insertLast(int elem) {
    if (head == null) {
      insertFirst(elem);
    } else {
      Node newNode = new Node();

      newNode.data = elem;
      newNode.next = null;
      newNode.prev = tail;

      tail = newNode;

      if (head == null) {
        head = newNode;
      } else {
        newNode.prev.next = newNode;
      }

      size++;
    }
  }

  private void removeFirst() {
    if (head == null)
      System.out.println("Empty list");
    else {
      head = head.next;
      size--;
    }
  }

  private void removeLast() {
    if (head == null)
      System.out.println("Empty list");
    else if (size == 1) {
      removeFirst();
      size--;
    } else {
      Node temp = head;
      while (temp.next.next != null)
        temp = temp.next;
      temp.next = null;
      size--;
    }
  }

  public void insertAtBeginning(int elem) {
    Node newNode = new Node();
    newNode.data = elem;

    if (tail == null) {
      tail = newNode;
      tail.next = tail;
    } else {
      newNode.next = tail.next;
      tail.next = newNode;
    }

    size++;
  }

  private void doublyInsertFirst(int elem) {
    Node newNode = new Node();

    newNode.data = elem;
    newNode.next = head;
    newNode.prev = null;
    head = newNode;

    if (tail == null) {
      tail = head;
    } else {
      newNode.next.prev = newNode;
    }

    size++;
  }

  private void printLL() {
    System.out.println("***");

    if (head == null)
      System.out.println("List is empty");
    else {
      Node temp = head;
      while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
      }
    }
  }

  private void printReverse() {
    for (int limit = size - 1; limit >= 0; limit--) {
      Node temp = head;
      for (int i = 0; i < limit; i++) {
        temp = temp.next;
        System.out.println(temp.data);
      }
    }
  }

  private void printReversell() {
    printRecursive(head);
  }

  private void reversePrint() {
    Node temp = tail;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.prev;
    }
  }

  public void print() {
    if (tail != null) {
      Node temp = tail.next;
      do {
        System.out.println(temp.data);
        temp = temp.next;
      } while (temp != tail.next);
    }
  }

  private void printRecursive(Node temp) {
    if (temp != null) {
      printRecursive(temp.next);
      System.out.println(temp.data);
    }
  }

  public static void main(String[] args) {
    DefinedLinkedList LL1 = new DefinedLinkedList();

    LL1.printLL();

    LL1.insertFirst(6);
    LL1.insertFirst(8);
    LL1.insertLast(3);
    LL1.insertLast(5);

    LL1.printLL();

    LL1.removeFirst();
    LL1.removeLast();

    LL1.printLL();

    LL1.removeLast();
    LL1.removeLast();

    LL1.printLL();

    LL1.insertAtBeginning(7);
    LL1.insertAtBeginning(9);

    LL1.printLL();

    LL1.doublyInsertFirst(4);
    LL1.doublyInsertFirst(2);

    LL1.printLL();

    LL1.printReverse();

    LL1.printReversell();

    LL1.reversePrint();
  }
}
