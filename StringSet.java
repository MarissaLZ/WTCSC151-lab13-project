import java.util.*;
import java.util.ArrayList;


public class StringSet extends ArrayList<String> {
	//no instance variables
	
    //no arg constructor
    public StringSet() {
    	//constructor of ArrayList called first
    	//ArrayList<String> list = new ArrayList<String>();	
    }
    
    //use add and size methods directly from ArrayList class
    public void pop() {
        if (super.size() > 0) {
            super.remove(super.size() - 1);
        }
    }
    
    // an accessor that returns the total number of characters in all of the Strings that have been added to this StringSet object
    public int numChars() {
        int numCharacters = 0;
        for (int i = 0; i < super.size(); i++) {
            numCharacters = numCharacters + (super.get(i).length()) ;
        }
        return numCharacters;
    }
  
 // an accessor that returns the number of Strings in the StringSet object that contain a given substring
    public int countStrings(String stringToLookFor) {
        int count = 0;
    	for (int i = 0; i < super.size(); i++) {
            if ( super.get(i).contains(stringToLookFor) ) {
                count++;
            }
        }
        return count; 
    }
} 
    
