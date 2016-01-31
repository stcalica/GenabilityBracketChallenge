
package com.kyle.app;

import java.util.*;
 
/**
 * Bracket Balance Challenge in Java using Maven build
 *
 */
public class App 
{
    public static List<Character> start = Arrays.asList('(', '{', '['); //like to make Java "globals" using static
    public static Stack st = new Stack(); 
    public static boolean f( String input )
    {
	boolean balanced = false; 
    	Map<Character, Character> pairs = new HashMap<Character,Character>(); 
    	pairs.put('(', ')');  
    	pairs.put('{', '}');  
    	pairs.put('[', ']');  
	//Scanner cin = new Scanner(System.in); 
	//String input; 
        //System.out.println("Insert a string:\t"); 
//	input = cin.next(); 
	

	for(int i = 0; i < input.length(); i++){
		Character ch = input.charAt(i); 
		if(start.contains(ch)){
			//then push it on to the stack 
			st.push(ch); 
		} else {
			//check if stack is empty
			if(st.isEmpty()){
				balanced = false; 
			} else {
				//pop the top of the stack off and match it with ending
				if(ch == pairs.get(st.pop())){
					balanced = true; 
				} else {
					balanced = false;
				}			
	
			}

		}
		
	}
//	System.out.println(st.toString()); 
	if(st.isEmpty()){
		balanced = true; 

	} else {
		balanced = false; 
	}
//	System.out.println(balanced); 
	return balanced; 

	
    }
}
