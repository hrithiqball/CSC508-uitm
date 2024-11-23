package Array;

public class DefinedArray {
  private int size;
  private int[] newArray;

  public DefinedArray() {
    newArray = new int[10];
    size = 0;
  }

  private void addElement(int elem) {
    newArray[size++] = elem;
    size++;
  }

  private void deleteElement(int index) {
    if (size == 0 || index >= size) {
      System.out.println("Invalid index");
    } else {
      for (int i = index; i < size; i++) {
        newArray[i] = newArray[i + 1];
        size--;
      }
    }
  }

  private void printArray() {
    if (size == 0) {
      System.err.println("Empty array");
    } else {
      for (int i = 0; i < size; i++) {
        System.out.println(newArray[i]);
      }
    }
  }

  private void printSize() {
    System.out.println("Size: " + size);
  }

  public static void main(String[] args) {
    DefinedArray arr = new DefinedArray();

    arr.addElement(4);
    arr.addElement(6);
    arr.addElement(78);

    arr.printArray();

    arr.deleteElement(0);

    arr.printArray();

    arr.printSize();
  }
}
