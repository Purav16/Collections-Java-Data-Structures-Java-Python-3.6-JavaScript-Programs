import java.util.*;
public class A {
     public static void main(String args[]) {

       /* Linked List Declaration */
       LinkedList<String> linked_list = new LinkedList<String>();

       /*add(String Element) is used for adding 
        * the elements to the linked list*/
       linked_list.add("Item1");
       linked_list.add("Item5");
       linked_list.add("Item3");
       linked_list.add("Item6");
       linked_list.add("Item2");

       /*Display Linked List Content*/
       System.out.println("Linked List Content: " +linked_list);

       /*Add First and Last Element*/
       linked_list.addFirst("First Item");
       linked_list.addLast("Last Item");
       System.out.println("LinkedList Content after addition: " +linked_list);
       /*Display Linked List Content*/
     //  System.out.println("Linked List Content: " +linked_list);

       /*This is how to get and set Values*/
       Object firstvar = linked_list.get(0);
       System.out.println("First element: " +firstvar);
       linked_list.set(0, "Changed first item");
       Object firstvar2 = linked_list.get(0);
       System.out.println("First element after update by set method: " +firstvar2);

       /*Remove first and last element*/
       linked_list.removeFirst();
       linked_list.removeLast();
       System.out.println("LinkedList after deletion of first and last element: " +linked_list);

       /* Add to a Position and remove from a position*/
       linked_list.add(0, "Newly added item");
       linked_list.remove(2);
       System.out.println("Final Content: " +linked_list); 
     }
}