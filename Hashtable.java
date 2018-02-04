import java.util.*;
public class NewClass {

   public static void main(String args[]) {
      // Create a hash map
      Hashtable employee = new Hashtable();
      Enumeration name;
      String str;
      double bal;

      employee.put("Zara", new Double(3434.34));
      employee.put("Mahnaz", new Double(123.22));
      employee.put("Ayan", new Double(1378.00));
      employee.put("Daisy", new Double(99.22));
      employee.put("Qadir", new Double(-19.08));

      // Show all balances in hash table.
      name = employee.keys();
      
      while(name.hasMoreElements()) {
         str = (String) name.nextElement();
         System.out.println(str + ": " + employee.get(str));
      }        
      System.out.println();
      
      // Deposit 1,000 into Zara's account
      bal = ((Double)employee.get("Zara")).doubleValue();
      employee.put("Zara", new Double(bal + 10000));
      System.out.println("Zara's new balance: " + employee.get("Zara"));
   }
} 