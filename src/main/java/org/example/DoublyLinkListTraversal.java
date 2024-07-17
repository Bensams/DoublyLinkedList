package org.example;

public class DoublyLinkListTraversal {
    
    static void forwardTraversal(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            
            current = current.next;
        }

        System.out.println();
    }

    static void backwardTraversal(Node tail) {
        Node current = tail;

        while (current != null) {
            System.out.print(current.data + " ");

            current = current.prev;
        }

        System.out.println();
    }
    // Function to find the length of a doubly linked list
    static int findLength(Node head) {
        int length = 0; // Variable that store the length of the list or node
        Node current = head; // Pointer to traverse the list starting on the Head or first value

        // Traverse the list until reaching the null or end
        while (current != null) {
            length++; // Increment the length for each node that are not empty or null
            current = current.next; // Move to the next node
        }

        return length; // Return the length of the list
    }
    
}
