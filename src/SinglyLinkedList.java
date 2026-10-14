/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        berhan gül
 * Your Student ID:  240444047
 * Your Date:        12.10.2026
 */

public class SinglyLinkedList {

    // -------------------------------------------------------
    // Instance variable

    private Node head;

    // -------------------------------------------------------
    // Constructor

    public SinglyLinkedList() {
        head = null;
    }

    // -------------------------------------------------------
    // Add a node to the end of the list

    public void add(int data) {

        Node newNode = new Node(data);
        Node curr = head;

        if(head == null){
            head = newNode;

        }else {
            while (curr.next != null){
                curr = curr.next;
            }

            curr.next = newNode;

        }




    }

    // -------------------------------------------------------
    // Display the linked list

    public void display() {

        System.out.print("Linked list: ");
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.print("NULL");
        System.out.println();


    }

    // -------------------------------------------------------
    // Find the middle node

    public Node findMiddle() {

        Node slowPointer = head;
        Node speedPointer = head;
        Node middleNode;

        while (speedPointer != null && speedPointer.next != null){
            slowPointer = slowPointer.next;
            speedPointer = speedPointer.next.next;
        }

        middleNode = slowPointer;

        return middleNode;
    }

    // -------------------------------------------------------
    // Delete the middle node
    public void deleteMiddle() {

        if(head == null || head.next == null){
            head = null;
        }

        Node slowPointer = head;
        Node speedPointer = head;
        Node beforeMiddle = null;

        while (speedPointer != null && speedPointer.next != null){
            beforeMiddle = slowPointer;
            slowPointer = slowPointer.next;
            speedPointer = speedPointer.next.next;
        }

        if(beforeMiddle != null){
            beforeMiddle.next = slowPointer.next;
        }

    }

    // -------------------------------------------------------
    // Get the head
    public Node getHead() {
        return head;
    }
}