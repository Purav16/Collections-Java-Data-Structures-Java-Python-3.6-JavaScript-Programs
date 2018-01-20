import java.awt.List;
import java.util.ArrayList;

public class Array_List_Insretion_Retrival {
	public static void main(String[] args){
		ArrayList<String> Stuncet_Names = new ArrayList<String>();
		Stuncet_Names.add("Red");
		Stuncet_Names.add("Green");
		Stuncet_Names.add("Orange");
		Stuncet_Names.add("White");
		Stuncet_Names.add("Black");
		System.out.println(Stuncet_Names);
		// ArrayList updating for given index
		Stuncet_Names.set(1, "Silver");
		Stuncet_Names.set(2, "Orange");
		System.out.println(Stuncet_Names);
		// ArrayList removing data for given index
		Stuncet_Names.remove(0);
		Stuncet_Names.remove(2);
		System.out.println(Stuncet_Names);
		// ArrayList printing data for given index
		String element = Stuncet_Names.get(0);
		System.out.println("First element is: "+element);
		String element2 = Stuncet_Names.get(1);
		System.out.println("First element is: "+element2);  
		// ArrayList Searching specific elements
		
	}

}
