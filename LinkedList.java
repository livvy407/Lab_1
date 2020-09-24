public class LinkedList{
	Node head;//variable declaration
	Node tail;
	int size;

	public LinkedList(){
		head = null; //Assigning value to the variable
		tail = null;
		size = 0;
	}

	//size() method
	public int size(){
		return size; //give the size value of the list.
	}

	//isEmpty() method
	public boolean isEmpty(){//boolean is used to fulfill the condition.
		if(size == 0){//if size of list is zero then the result will be true.
			return true;
		}
		return false;//if size of the list is not zero, the result will be false.
	}

	//first() method
	public int first(){
		return head.getElement();//to get the value first element of the list.
	}

	//lase() method
	public int last(){
		return tail.getElement();//to get the last element of the list.
	}

	//addfirst method
	public void addFirst(int n){//void is used because to not return the value again.
		Node newest = new Node(n, null);// new node is created with the name newest. 

		if (size == 0) {    //if the size of the list is zero then the new node of the element will be both head and tail.
			head = newest;
			tail = newest;
		}
		else{//if the size of the list is not zero then the head will be the next node that is added.
			newest.setNext(head);
			head = newest;
		}
		size = size + 1;//the size of the list will be increased by 1.
	}

	//addlast method
	public void addLast(int n){
		Node newest = new Node(n, null);
		if(size == 0){ //if the size of the list is zero then the new added element will be both head and tail of the list.
			head = newest;
			tail = newest;
		}
		else{
			tail.setNext(newest);   //the new inserted element at the last of the list will be the tail.
			tail = newest;
		}
		size += 1;
	}

	//removeFirst() method
	public int removeFirst(){
		int deletedElement = head.getElement();
		if (size == 0) {
			return 0; //Output flase result if the size of the list is zero.
		}
		else{
			head = head.getNext();//After deletion of one element form the list the head will be the next element.
			size = size -1; //reduce the size of the list by one.
		}
		return deletedElement;//will give the value of the deleted element.
	}

}

class Node{
	private int element;//variable declaration to access within the class.
	private Node next;

	//constructor
	public Node(int element, Node next){ 	
		this.element = element;
		this.next = next;
	}

	//getElement
	public int getElement(){ //get and set is used in order to be used in public class.
		return element;
	}

	//getNext()
	public Node getNext(){
		return next;
	}

	//setElement
	public void setElement(int n){
		element = n;
	}
	
	//setNext
	public void setNext(Node n){
		next = n;
	}
}