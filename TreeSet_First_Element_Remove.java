import java.util.TreeSet;
import java.util.Iterator;

  public class Exercise {
  public static void main(String[] args) {

   TreeSet <Integer>tree_num = new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
     

   tree_num.add(10);
   tree_num.add(22);
   tree_num.add(36);
   tree_num.add(25);
   tree_num.add(16);
   tree_num.add(70);
   tree_num.add(82);
   tree_num.add(89);
   tree_num.add(14);
   
   System.out.println("Strictly less than 69 : "+tree_num.lower(69));
   System.out.println("Strictly less than 12 : "+tree_num.lower(12));
   }    
}