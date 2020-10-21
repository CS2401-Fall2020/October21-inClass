
public class driver {

  public static void main(String[] args) {

    // TODO Auto-generated method stub
    FamilyBTNode root = new FamilyBTNode("Kylo", "Ren");
    root.mother = new FamilyBTNode("Princess","Leia");
    root.father = new FamilyBTNode("Han","Solo");
    root.mother.mother = new FamilyBTNode("Queen","Padme");
    root.mother.father = new FamilyBTNode("Anakin","Skywalker");
    root.mother.father.mother = new FamilyBTNode("Shimi", "Skywalker");
    root.mother.mother.mother = new FamilyBTNode("Jobal","Naberrie");
    root.mother.mother.father = new FamilyBTNode("Ruweee","Naberrie");
    root.mother.mother.father.father = new FamilyBTNode("Who","Knows");
    
    root.print();
    System.out.println(root.find("Kylo", "Ren") != null);
    System.out.println(root.find("Who","Knows") != null);
    System.out.println(root.find("Ivan","Gastelum") != null);
    
    
    System.out.println(root.mother.firstName + " in " + root.firstName  + ": " + root.inSubtree(root.mother));
    System.out.println(root.mother.firstName + " in " + root.father.firstName  + ": " + root.father.inSubtree(root.mother));
    System.out.println(root.father.father + " in " + root.father.firstName  + ": " + root.father.inSubtree(root.father.father));
    //should print "Kylo > Princess: Mother"
    System.out.println(root.firstName + ">" + root.mother.firstName + ": " + root.relationship(root.mother, 0));
    System.out.println(root.mother.firstName + ">" + root.mother.father.firstName + ": " + root.mother.relationship(root.mother.father, 0)); 
    System.out.println(root.firstName + ">" + root.mother.mother.firstName + ": " + root.relationship(root.mother.mother, 0));

    System.out.println(root.firstName + ">" + root.mother.mother.father.firstName + ": " + root.relationship(root.mother.mother.father, 0));
    System.out.println(root.firstName + ">" + root.mother.mother.father.father.firstName + ": " + root.relationship(root.mother.mother.father.father, 0));
    //root.mother root.mother.father.mother
    System.out.println(root.mother.firstName + ">" + root.mother.father.mother.firstName + ": " + root.mother.relationship(root.mother.father.mother, 0));
    System.out.println(root.father.firstName + ">" + root.mother.mother.firstName + ": " + root.father.relationship(root.mother.mother,0));
    
  }

}
