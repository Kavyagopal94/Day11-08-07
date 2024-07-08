package LinkedList;

public class Main 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		l1.display();
		
		l1.addEnd(1);
		l1.addEnd(2);
		l1.addEnd(4);
		l1.addEnd(5);
		l1.addEnd(6);
		
		l1.display();
	    
     	l1.addFront(0);
		l1.addBetween(3);
		
		l1.display();
		
		l1.removeFront();
		l1.removeLast();
		l1.removeBetween();
		
		l1.display();
		
	}
}
