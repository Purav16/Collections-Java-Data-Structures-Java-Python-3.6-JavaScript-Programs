import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Creation_Iteration {
	public static void main(String[] args){
		LinkedList<Integer> linked_list = new LinkedList<Integer>();
		// Adding elements to the Linked List
		System.out.println("Adding elements in Linked List: ");
		linked_list.add(1);
		linked_list.add(2);
		for ( int i = 2 ; i < 20 ; i++ ){
			linked_list.add(i+1);
		}
		// Iterating through all of the elements from the start
		for (Integer element : linked_list) {
		    System.out.print(element+" , ");
		    }
		System.out.println();
		// Iterating through all the elements from given index
		Iterator p = linked_list.listIterator(1);
		// print list from second position
		//System.out.println("Iterating through all the elements from given index :"+ p);
		while (p.hasNext()) {
		System.out.print(p.next() + " , ");
		}
		Iterator p = linked_list.listIterator(5);
		while(p.hasNext()){
			System.out.print(p1.next() + " ,"));
		}
		
	}

}
