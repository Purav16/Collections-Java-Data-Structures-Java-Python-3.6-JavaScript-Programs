import java.util.*;  
public class Example1 {  
  public static void main(String args[]) {  
  
  // Function to create HashMap	 
  //System.out.println("Function to create HashMap");
  HashMap<Integer,String> hash_map1  = new HashMap<Integer,String>(); 
  HashMap<Integer,String> hash_map2 = new HashMap<Integer,String>();
  // Adding Data to HashMap1
//System.out.println("Adding data to HashMap1");
  hash_map1.put(1, "Red");
  hash_map1.put(2, "Green");
  hash_map1.put(3, "Black");
  hash_map1.put(4, "White");
  hash_map1.put(5, "Blue");
  
  // Adding data to HashMap2
 // System.out.println("Adding data to HashMap2");
  hash_map2.put(6, "Pink");
  hash_map2.put(7, "Red_2");
  hash_map2.put(8, "Pink_2");
  hash_map2.put(9, "White_2");
  
  
  // Iterating through the HashMap
  for(Map.Entry x:hash_map1.entrySet()){  
   System.out.print(x.getKey()+" "+x.getValue()+" ");  
  }  
  System.out.println();
  // Function to print the size of 
  System.out.println("Size of the hash map: "+hash_map1.size());

  // Function to coppy att the data to another HashMap
  hash_map1.putAll(hash_map2);
  for (Map.Entry y :hash_map1.entrySet()){
	  System.out.print(y.getKey() + " "+ y.getValue() + " ");
  }
  
  // Deleting all the data from HashMap
  hash_map2.clear();
  System.out.println("After clearing the HashMap Data");
  System.out.println("hash_map2 is: " + hash_map2);
  System.out.println("hash_map is: " + hash_map1);
  
  // Checking if the HashMap is empty or not
  boolean result = hash_map1.isEmpty();
  System.out.println("hash_map is empty?: " + result);
  
  boolean result2 = hash_map2.isEmpty();
  System.out.println("hash_map2 is empty?: " + result2);
  
  // Clonig the HashMap
  HashMap<Integer,String> hash_map3 = new HashMap<Integer,String>();
  hash_map3 = (HashMap<Integer, String>) hash_map1.clone();
  HashMap<Integer,String> hash_map4 = new HashMap<Integer,String>();
  hash_map4 = (HashMap<Integer, String>) hash_map2.clone();
  System.out.println("HashMap after Cloning :" + hash_map3);
  System.out.println("HashMap after Cloning :" + hash_map4);
  
  
 }  
}