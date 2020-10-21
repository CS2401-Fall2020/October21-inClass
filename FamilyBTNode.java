
public class FamilyBTNode {
  //values
  
  FamilyBTNode(String inFirst, String inLast){
    
  }
  
  public String relationship(FamilyBTNode inNode, int levels) {
    return null;
  }

  public boolean inSubtree(FamilyBTNode inNode) {
    return false;
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
