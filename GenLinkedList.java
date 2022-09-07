/**
 * 
 */

/**
 * @author AdelineLR
 *
 */
public class GenLinkedList<T> {
	
	/**
	 * Variable Instantiation
	 */
	GenNode<T> head;
	int length;
	GenNode<T> tail;
	
	/**
	 * Constructor Instantiation
	 */
	public GenLinkedList(){
		head=null;
		length=0;
		tail=head;
	}
	
	/**
	 * Accessor 
	 * checks the list to see if its empty
	 * @return True if the list is empty, otherwise returns false
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	
	/**
	 * Accessor
	 * returns the first node in the list
	 * @return GenNode head
	 */
	public GenNode<T> getList()
	{
		return head;
	}
	
	/**
	 * Mutator
	 * adds a node to the end of the list
	 * @param aNode
	 */
	public void addNode(GenNode<T> aNode){
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode = aNode;
		tail = tail.nextNode;
		tail.nextNode = null;
		length++;
		
	}

	
	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Variable Instantiation
		 */
		GenLinkedList<String> myList = new GenLinkedList<String>();
		GenNode<String> aNode=new GenNode<String>();
		
		/**
		 * setData test
		 */
		aNode.setData("Bill");
		
		/**
		 * addNode test
		 */
		myList.addNode(aNode);
		
		/**
		 * Instantiation - second node
		 */
		aNode = new GenNode<String>();
		
		/**
		 * setData second test
		 */
		aNode.setData("Chris");
		
		/**
		 * addNode second test
		 */
		myList.addNode(aNode);
		
		/**
		 * getList test
		 */
		GenNode<String> tempnode=myList.getList();
		
		/**
		 * print string
		 */
		do {
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
			
	}

}
