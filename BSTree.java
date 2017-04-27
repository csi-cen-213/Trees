public class BSTree {
  // properties
  private BSTree parent;
  private BSTree left;
  private BSTree right;
  private int data;
    
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
  
}