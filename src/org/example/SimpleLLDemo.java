package org.example;


public class SimpleLLDemo /* LinkedList */ {

    public SimpleLLDemo(){
        super();
    }

    public static void main(String[] args) {

        LinkedList test = new LinkedList();
        test.add(2);  test.add(0);  test.add(1);  test.add(5);
        test.list();

        Item objItem = new Item(-16);
        test.Add(objItem);

        test.Add(new Item(-3));
        test.list();

        int[] demo = test.List();
        for(int i : demo) System.out.print(" " + i);
        System.out.println("\n" + test);

        
        test.Delete();          // sterge primul element din lista 
        test.delete(0);         // sterge elementul cu valoarea = 0 
        test.deleteLastEl();    // sterge ultimul element din lista

        System.out.println("\nlista contine " + test.count() + " elemente ");
        System.out.println("\nlista contine " + test.Count() + " el. pozitive");
        test.delete(objItem);   // sterge elementul cu ref objIt 

        test.list(); // afiseaza elementele listei inlantuite

    }
}
