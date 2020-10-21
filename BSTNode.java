
public class BSTNode {
  // values
  
  BSTNode(char inVal){
    
  }
  
  public void insert(char inVal) {
    
  }
  
  public boolean find(char inVal) {
    return false;
  }
  
  public void remove(char inVal) {
    
  }
  
  public int height() {
    return 0;
  }
  
  public int depth(char inVal) {
    return 0;
  }
  
  public void print() { print(""); }
  private void print(String prefix) {
    //System.out.println(prefix + value);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    //if(left != null) left.print(prefix + "\u251C ");
    //if(right != null) right.print(prefix + "\u2514 ");
  }
}
