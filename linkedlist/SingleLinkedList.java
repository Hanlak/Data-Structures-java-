package linkedlist;

/*
 * In Java  Linked List is represented as a class and
 * Node as a seperate class.
 * The LinkedList class has a reference of Node class. 
 */

public class SingleLinkedList {
	Node head;	//head of list
	static class Node{
	//linked list node
		int data;
		Node next;
	/*
	 * Constructor to create data and
	 * By Defulat Node will assign with null value
	 */
		Node(int data) {
			this.data = data;
		}
		
	}
	
	//Method to insert data into linked list
	public static SingleLinkedList insert(SingleLinkedList list, int data) {
		//Create a new Node with Given data
		 
		Node new_node = new Node(data);
		new_node.next= null;
		//check if head is null and assign the new node if it is true. 
		if(list.head == null) {
			list.head = new_node; 
		}
		else {
			//else we need to traverse through the list upto last node 
			// insert the data at the last node.
			Node last = list.head; // starting from the head
			while(last.next != null) {
				//traversing through the list
				last = last.next;
			}
			//asigning the value at the last node.
			last.next= new_node;
		}
		return list;	
	}
	
	//Method to print Linked list
	public static void printList(SingleLinkedList list) {
		//traverse through the list
		Node curr_node = list.head;
		System.out.println("Linked list");
		while(curr_node != null) {
			System.out.print(curr_node.data+" ");
			curr_node = curr_node.next;
		}
		
	}
	public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        SingleLinkedList list = new SingleLinkedList(); 
        // ******INSERTION****** 
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list); 
    }
}

