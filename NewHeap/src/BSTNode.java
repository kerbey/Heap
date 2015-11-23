public class BSTNode <T>
{
	binarySearchTree<T> tree= new binarySearchTree<>();
	public String list,completeList;
	protected T info;
	protected BSTNode<T> left, node;
	protected BSTNode<T> right;
	public BSTNode(T info)
	{
		//System.out.println("BSTNode");
		this.info = info;
		left = null;
		right = null;
		//System.out.println("this.info="+this.info);
	}
	public T getInfo() {
		//System.out.println("getInfo=="+this.info);
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public BSTNode<T> getLeft() {
		//System.out.println("getLeft=="+this.left);
		return left;
	}

	public void setLeft(BSTNode<T> left) {
		this.left = left;
	}

	public BSTNode<T> getRight() {
	//	System.out.println("getRight=="+this.right);
		return right;
	}

	public void setRight(BSTNode<T> right) {
		this.right = right;
	}
}