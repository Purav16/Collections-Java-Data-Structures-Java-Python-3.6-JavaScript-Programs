
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author purav
 */
public class A {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
        ArrayList al = new ArrayList(Arrays.asList(array));
        for (int i: al)
	  {
		System.out.println(i);
       	  }
         String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

	  /*Array to ArrayList conversion*/
	  ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));
        
        System.out.println(citylist);
    }
    
}
