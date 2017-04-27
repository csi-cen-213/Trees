public class BSTree {
  // properties
  public BSTree parent;
  public BSTree left;
  public BSTree right;
  public int data;
    
  // constructor
  public BSTree() {
    this.parent = null;
    this.left = null;
    this.right = null;
    this.data = 0;
  }
  
  public BSTree(int data) {
    this.parent = null;
    this.left = null;
    this.right = null;
    this.data = data;
  }
  
  // methods
  
  public boolean hasLeft() {
    return !(this.left == null);
  }
  
  public boolean hasRight() {
    return !(this.right == null);
  }
  
  public boolean hasParent() {
    return !(this.parent == null);
  }
  
  public void add(int data) {
    this.add(new BSTree(data));
  }
  
  // add new node to right if greater or equal, 
  // left if less than
  public void add(BSTree subtree) {
    if (subtree.data < this.data) {
      if (this.hasLeft())
        this.left.add(subtree);
      else
        this.left = subtree;
    }
    else
      if (this.hasRight())
        this.right.add(subtree);
      else
        this.right = subtree;
  }
}