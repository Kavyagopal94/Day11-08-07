package LinkedList;

public class LinkedList<T> 
{
	//declares a variable head of type Node<T>
	Node<T> head;
	int size = 0;
	
	public LinkedList() 
	{
		this.head = head;
		this.size = 0;
	}

	public void addEnd(T data)
	{
		Node<T> newNode = new Node<>(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node<T> temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}	
	}
	
	public void addFront(T data)
	{
		Node<T> newNode = new Node<>(data);
		if(head == null)
		{
			head = newNode;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void addBetween(T data)
	{
		Node<T> newNode = new Node<>(data);
		Node<T> slow=head;
		Node<T> fast=head;
		
		while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        newNode.next = slow.next;
        slow.next = newNode;
	}
	
	public void removeFront() {
        if (head == null) {
            System.out.println("List is empty");
        }
        head = head.next;
    }
	
	public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
        }
        if (head.next == null) {
            head = null;
        }
        Node<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
	
	public void removeBetween()
	{
		Node<T> slow = head;
        Node<T> fast = head;
        Node<T> temp= null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            temp = slow;
            slow = slow.next;
        }

        if (temp != null) {
            temp.next = slow.next;
        }
	}	
	
	public void display()
	{
		System.out.println();
		Node<T> temp = head;
		if(head==null)
		{
			System.out.println("Linked List is Empty");
		}
		while(temp != null) 
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
