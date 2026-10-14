/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        berhan gül
 * Your Student ID:  240444047
 * Your Date:        12.10.2026
 */

public class MiddleNodeDemo {
    public static void main(String[] args) {

        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();

        // -------------------------------------------------------
        // Test 1: Odd number of nodes
        // TODO: 
        // 1. Created a singlyLİnkedList
        // 2. Add 1,2,3,4,5 Nodes to the list
        // 3. Display the list
        // 4. Found and print the middle Node

        SinglyLinkedList newList = new SinglyLinkedList();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(5);



        System.out.println("List 1:");
        newList.display();


        System.out.println("Middle Node: " + newList.findMiddle().data);
        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // TODO: 
        // 1. Created another singlyLİnkedList
        // 2. Add 10,20,30,40,50,60 Nodes to the list
        // 3. Display the list
        // 4. Found and print the middle Node
        SinglyLinkedList newList2 = new SinglyLinkedList();
        newList2.add(10);
        newList2.add(20);
        newList2.add(30);
        newList2.add(40);
        newList2.add(50);
        newList2.add(60);


        System.out.println("List 2:");

        newList2.display();


        System.out.println("Middle Node: " + newList2.findMiddle().data );
        System.out.println();
    }
}