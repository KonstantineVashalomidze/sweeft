package org.example;



/**
 * Problem statement:
 * 3. მოცემულია ერთმიმართულებიანი linked list-ის თავი. დაწერეთ ფუნქცია, რომელიცარ
 * დააბრუნებს შეტრიალებულ ვერსიას. ListNode reverseList(ListNode head);მოგდით
 * მაგ. head = 1->2->3->4->5, result = 1<-2<-3<-4<-5.
 *
 *
 *
 * @author Konstantine Vashalmidze
 */
public class Solution3
{

    /**
     * This method reverses linked list and returns the head of the reversed linked list.
     * @param head linked list to reverse.
     * @return reversed linked list.
     */
    ListNode reverseList(ListNode head)
    {
        // initialise references
        ListNode previousNode = null, currentNode = head, nextNode = null;

        while (currentNode != null)
        {
            nextNode = currentNode.next; // move next node one step ahead
            currentNode.next = previousNode; // change reference of current node to point its previous node
            previousNode = currentNode; // move previous node one step ahead
            currentNode = nextNode; // move current node one step ahead
        }

        return previousNode; // return head of the reversed linked list
    }


    /**
     * This class represents node of linked list,
     * it has integer value and reference to next node object.
     */
    static class ListNode
    {
        int val;
        ListNode next;
        ListNode() {  }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}


