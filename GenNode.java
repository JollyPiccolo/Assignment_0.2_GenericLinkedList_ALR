/**
 * 
 */

/**
 * @author AdelineLR
 *
 */
public class GenNode<T>{
	
	/**
	 * Variable Instantiation
	 */
	T data;
	GenNode<T> nextNode;
	
	/**
	 * Constructor Instantiation
	 */
	public GenNode(){
		nextNode = null;
		data = null;
	}
	
	/**
	 * Mutator 
	 * modifies the data tied to the node
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	/**
	 * Accessor
	 * returns the node itself as a value
	 * @return GenNode this
	 */
	public GenNode<T> getNode() {
		return this;
	}
	
	/**
	 * Mutator
	 * sets the target of the current node's pointer
	 * @param nextNode
	 */
	public void setNextNode(GenNode<T >nextNode)
	{
		this.nextNode=nextNode;
	}
	
}
