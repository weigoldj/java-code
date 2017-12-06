// ArrayList implements Collections.List
package examples.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListCode {
	
  private ArrayList<String> cast = 
          new ArrayList<>(Arrays.asList("Eric", "Kenny", "Kyle", "Stan", "Chef", "Bebe"));
	  
  public ArrayListCode() { }
  
  // appends the element to the end of the list
  public void addMember(String name) {
    cast.add(name);
  }
  
  public List<String> getList() {
    return cast;
  }
  
  // removes the first element and returns true if the element existed.
  public boolean removeMember(String name) {
    return cast.remove(name);
  }
  
  // sort the cast by name and then print.
  public void loop() {
    Collections.sort(cast, String.CASE_INSENSITIVE_ORDER);
    
    for(String name : cast) {
      System.out.println(name);
    }
    
    // can also iterate over the list
    Iterator<String> itr = cast.iterator();
    while(itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
	  
}
