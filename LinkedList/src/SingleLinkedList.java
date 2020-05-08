
/*
 * In Java  Linked List is represented as a class and
 * Node as a seperate class.
 * The LinkedList class has a reference of Node class.
 */

public class SingleLinkedList {
    public static Node head;	//head of linked list
    public static int numNodes=1;//for size
    public SingleLinkedList(Object data) {
        head = new Node(data);
    }
    public SingleLinkedList() {
        //defualt
    }
    class Node{
        //linked list node
        Object data;
        Node next;
        /*
         * Constructor to create data and
         * By Defulat Node will assign with null value
         */
        Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return data;
        }

    }

    //Method to insert data into linked list
    public void insert(Object data) {
        //Create a new Node with Given data

        Node new_node = new Node(data);
        new_node.next= null;
        //check if head is null and assign the new node if it is true.
        if(head == null) {
            head = new_node;
            numNodes++;
        }
        else {
            //else we need to traverse through the list upto last node
            // insert the data at the last node.
            Node last = head; // starting from the head
            while(last.next != null) {
                //traversing through the list
                last = last.next;
            }
            //asigning the value at the last node.
            last.next= new_node;
            numNodes++;
        }
    }
    //adds at head
    public void addAtHead(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next=temp;
        numNodes++;
    }
    //adds at tail
    public void addAtTail(Object data) {
        Node temp = head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    //add at Index
    public void addAtIndex(int index, Object data) {
        Node temp = head;
        Node holder;
        for(int i=0;i<index-1&&temp.next!=null;i++) {
            temp=temp.next;
        }
        holder = temp.next;
        temp.next =new Node(data);
        temp.next.next=holder;
        numNodes++;
    }
    //delete at Index
    public void deleteAtIndex(int index) {
        Node temp=head;
        for(int i=0;i<index-1&&temp.next!=null;i++) {
            temp=temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    //find using index

    public static Node find(int index) {
        Node temp = head;
        for(int i=0;i<index-1&&temp.next!=null;i++) {
            temp = temp.next;
        }
        return temp;
    }

    //Method to print Linked list
    public static void printList() {
        //traverse through the list
        Node temp = head;
        while(temp!=null) {
            System.out.print(" "+temp.data);
            temp=temp.next;
        }

    }
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        SingleLinkedList list = new SingleLinkedList(1);
        // ******INSERTION******
        // Insert the values
        list.insert(10);
        list.addAtHead(20);
        list.addAtTail(22);
        list.addAtHead(30);
        list.addAtTail(39);
        list.addAtTail(05);
        list.addAtIndex(2, 25);
        list.deleteAtIndex(0);
        System.out.println(find(3).getData());
        System.out.println("Size:"+numNodes);


        // Print the LinkedList
        printList();
    }
}

