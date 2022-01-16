package mypackage1;



class Node
{
	public String data;
	public Node next;
	
	public void printData()
	{
		System.out.println(data+">>");
	}
}

class SingleLinkedList
{
	public Node head;
	
	public boolean isEmpty()
	{
		return (head==null);
	}
	
	public void insertFirst(String data)
	{
		Node n = new Node();
		n.data=data;
		n.next=head;
		head=n;
	}
	
	public void deleteFirst()
	{
		head=head.next;		
	}
	
	public void insertLast(String data)
	{
		Node n = new Node();
		n.next=null;
		n.data=data;
		
		if(head==null)
			head=n;		
		else
		{
			Node current=head;
			
			while(current.next!=null)
			{			
				current=current.next;
			}
			current.next=n;
		}
	}
	public Node deleteLast(Node head)
	{
		 {
		        if (head == null)
		            return null;
		 
		        if (head.next == null) {
		            return null;
		        }
		 
		        // Find the second last node
		        Node current = head;
		        while (current.next.next != null)
		        	current = current.next;
		 
		        // Change next of second last
		        current.next = null;
		 
		        return head;
		 }
		    }
 

	
	public void printElements()
	{		
		Node current=head;
		while(current!=null)
		{
			current.printData();
			current=current.next;
		}
	}
}

class MyClass 
{
	public static void main(String[] args) 
	{
		SingleLinkedList sl = new SingleLinkedList();
		
		sl.insertLast("Infosys");
		sl.insertLast("Cognizant");
		
		if(sl.isEmpty())
			System.out.println("List is empty");
		else
			System.out.println("List is not empty");

	}
}