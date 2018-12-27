// Q2 The one with Mr.X

import java.util.*;
//import java.util.*;
public class RemDuplicate{
	public static void main(String[] args){
		
	  Scanner scanner = new Scanner(System.in);
	  String str = scanner.next();
	  scanner.close();
	  StringBuilder sbuilder = new StringBuilder(" ");

	  for(int i=0; i<str.length()-1; i++){
	    if(str.charAt(i) != str.charAt(i+1)){
	      if(sbuilder.toString().charAt(sbuilder.toString().length()-1) != str.charAt(i))
	        sbuilder.append(str.charAt(i));
	        sbuilder.append(str.charAt(i+1));
      }
	  }
	  System.out.println("Mr.X's good string is: " + sbuilder.toString().trim());
  }
}
