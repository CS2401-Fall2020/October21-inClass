
public class FamilyBTNode {
  public String firstName; 
  public String lastName; 
  public FamilyBTNode mother; 
  public FamilyBTNode father;
  
  FamilyBTNode(String inFirst, String inLast){
    firstName = inFirst;
    lastName = inLast; 
    mother = null;
    father = null;
  }
  
  // returns the node that has this name, or null if its not found
  public FamilyBTNode find(String inFirst, String inLast) {
    //base case(s)
    // when found
    if(firstName.compareTo(inFirst)==0 && lastName.equals(inLast)) {
      return this;
    }
    // if both null
    
    //recursive call(s)
    FamilyBTNode returnM = null;
    if(mother != null)
      returnM = mother.find(inFirst, inLast);
    FamilyBTNode returnF = null;
    if(father != null)
      returnF = father.find(inFirst, inLast);
    if(returnM != null) return returnM;
    return returnF;
  }
  
  // returns a string with the relationship between the two nodes
  public String relationship(FamilyBTNode inNode, int levels) {
    // base case(s)
    if(this == inNode) return "Self";
    
    if(mother == inNode) {
      if(levels == 0) return "Mother";
      String rtn = "";
      for(int i=2; i<=levels; i++) {
        rtn += "Great ";
      }
      rtn += "Grandmother";
      return rtn;
    }
    if(father == inNode) {
      if(levels == 0) return "Father";
      String rtn = "";
      for(int i=2; i<=levels; i++) {
        rtn += "Great ";
      }
      rtn += "Grandfather";
      return rtn;
    }
    
    if(mother != null && mother.inSubtree(inNode)) {
      return mother.relationship(inNode, levels+1);
    }
    if(father != null && father.inSubtree(inNode)) {
      return father.relationship(inNode, levels+1);
    }
    
    return "No relationship";
  }
  
  // given a node in the tree, see if its in *my* subtree
  public boolean inSubtree(FamilyBTNode inNode) {
    // base case
    //  its me.....
    if(inNode == this) {
      return true;
    }
    
    // recursive calls
    boolean rtn = false; 
    if(mother != null) rtn |= mother.inSubtree(inNode);
    if(father != null) rtn |= father.inSubtree(inNode);
    return rtn;
  }
  
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + firstName + " " + lastName);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(mother != null) mother.print(prefix + "\u251C ");
    //else System.out.println(prefix + "null");
    if(father != null) father.print(prefix + "\u2514 ");
    //else System.out.println(prefix + "null");
  }
}
