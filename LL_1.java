import java.util.LinkedList;
public class Main
{
	public static void main(String args[])
    {
    	LinkedList<String> ll = new LinkedList<String>();
      	ll.add("15");
      	ll.add("20");
      	ll.add("30");
      	System.out.print("First el:"+ll.getFirst());
      	System.out.print("\nLast el:"+ll.getLast());
      
      	//add at first and last
      	ll.addFirst("Hello");
      	ll.addLast("Bye");
      	System.out.print("\nLinkedList : "+ll);
      
      
    }

}
