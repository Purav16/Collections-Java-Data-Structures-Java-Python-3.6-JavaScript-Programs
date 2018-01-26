package linkedlist;

public class Singly_Linked_List {
	// Adding head element
	private Node1<T> head;
	
	// add methods
	public void add (T element){
		Node1<T> nd = new Node<T>();
		nd.setValue(element);
		System.out.println("Adding elemtns: "+ element);
		Node<T> temp = head;
		
		
	}
	
	
	
	
	
	public static void main(String[] args){
		
	}

}

class Node1<T> implements Comparable<T>{
	private T value;
	private Node<T> nextreference;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNextreference() {
		return nextreference;
	}
	public void setNextreference(Node<T> nextreference) {
		this.nextreference = nextreference;
	}
	
	public int compareTo(T argument){
		if(argument == this.value){
			return 0;
		}
		else{
			return 1;
		}
	}
}
