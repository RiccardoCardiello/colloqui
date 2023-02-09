package org.example;

public class Main {
  public static void main(String[] args) {
    LinkedList linkedList = createLinkedList(10);

    // TODO eliminare tutti gli elementi in posizione dispari
  }

  static LinkedList createLinkedList(int x) {
    var retVal = new LinkedList();
    var next = retVal.root;
    for (int i = 0; i < x - 1; i++) {
      next.elem = String.valueOf(i * 2);
      next.next = new Node();
      next = next.next;
    }
    next.elem = String.valueOf(x * 2);
    return retVal;
  }

  static class LinkedList {
    Node root = new Node();
  }

  static class Node {
    String elem;
    Node next;
  }
}