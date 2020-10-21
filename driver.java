
public class driver {

  public static void main(String[] args) {
    
    BSTNode root = new BSTNode('d');
    root.insert('b');
    root.insert('f');
    root.insert('a');
    root.insert('c');
    root.insert('e');
    root.insert('h');
    root.print();
    System.out.println("Height: " + root.height());
    System.out.print("Find: ");
    for(char i='a'-1; i<='i'; i++) {
      System.out.print(i + ":" + root.find(i) + ",");
    }
    System.out.println();
    System.out.print("Depth: ");
    for(char i='a'-1; i<='i'; i++) {
      System.out.print(i + ":" + root.depth(i) + ",");
    }
    System.out.println();
    root.remove('a');
    System.out.println("After remove 'a': ");
    root.print();
    root.remove('c');
    System.out.println("After remove 'c': ");
    root.print();
  }

}
