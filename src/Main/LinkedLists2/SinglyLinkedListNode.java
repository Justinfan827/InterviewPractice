package Main.LinkedLists2;

/**
 * Implementation of a singly linked list
 */
public class SinglyLinkedListNode {
  SinglyLinkedListNode next = null;
  int data;

  /**
   * Constructor
   */
  SinglyLinkedListNode(int d) {
    this.data = d;
  }

  void appendToTail(int node) {
    SinglyLinkedListNode nextNode = new SinglyLinkedListNode(node);
    SinglyLinkedListNode n = this;
    while(n.next != null){
      n = n.next;
    }
  }
}
