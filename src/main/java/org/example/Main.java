package org.example;

import static org.example.DoublyLinkListTraversal.*;

class Node {
    char data;
    Node next;
    Node prev;

    public Node(char data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

public class Main {
    public static void main(String[] args) {
        Node head = new Node('A');
        Node second = new Node('B');
        Node third = new Node('C');

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println("Forward Traversal: ");
        forwardTraversal(head);
        System.out.println("Backward Traversal: ");
        backwardTraversal(third);
        System.out.println("Length of the Doubly Link List: ");
        System.out.println(findLength(head));
    }
}