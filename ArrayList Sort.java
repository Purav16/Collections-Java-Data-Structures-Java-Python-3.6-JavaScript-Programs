import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
	public static void main(String[] args){
		List<String> colours = new ArrayList<String>();
		  colours.add("Red");
		  colours.add("Green");
		  colours.add("Orange");
		  colours.add("White");
		  colours.add("Black");
		  // Sorting an ArrayList using collections method for String values
		  Collections.sort(colours);
		  System.out.println("After Sorting :"+colours);
		  // Again Shuffling the values
		  // List<String> list2 = Collections.shuffle(colours);
		  System.out.println("After Shuffling :"+colours);
		  
		  List<Integer> colour_code = new ArrayList<Integer>();
		  colour_code.add(41);
		  colour_code.add(82);
		  colour_code.add(93);
		  colour_code.add(14);
		  colour_code.add(52);
		  // Sorting an ArrayList using collections method for String values
		  Collections.sort(colour_code);
		  System.out.println("After Sorting :"+colour_code);
		  // Again Shuffling the values
		  Collections.shuffle(colour_code);
		  System.out.println("After Shuffling :"+colour_code);


	}

}
