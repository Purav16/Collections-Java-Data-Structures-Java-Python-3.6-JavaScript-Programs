import java.util.HashMap;
import java.util.Set;

public class HashMap2 {
	 
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
	  
	  // Checking if key is present or not?
	  if(hash_map1.containsKey(1)){
		  System.out.println("Yes, Key is present");
	  }
	  else{
		  System.out.println("No, Key is not present");
	  }
	  
	  // Checking if key Value is present or not
	  if(hash_map2.containsValue("Pink")){
		  System.out.println("Yes, Key-Value is present");
	  }
	  else{
		  System.out.println("No, Key-Value isnt present");
	  }
	  
	  // Converting HashMap into Set
	  Set set = hash_map1.entrySet();
	  System.out.println("HashMap values into set is: " + set);
	  
	  // Getting Values for following keys
	  String value = hash_map1.get(1);
	  System.out.println(value);
	  
	  String values2 = hash_map1.get(2);
	  System.out.println(values2);
	  
	  // checking collection view of the map
	  System.out.println("Collection view is: "+ hash_map1.values());
	  // checking collection view of the map
	  System.out.println("Collection view is: "+ hash_map2.values());

}
}
