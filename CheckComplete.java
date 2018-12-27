
// Q4. A string is said to be complete if it contains all the chars from a to z.
// Given a string,check if it complete or not.
// Note: UPPERCAS and LOWERCASE are considered to be the same.

public class CheckComplete {
	public static void main(String[] args) {

    System.out.println( checkAllChars( "QWERTYUIOPASDFGHJKLZXCVBNM" ) );
    System.out.println( checkAllChars( "asdfghjklpoiuytrewqasdgfdsad" ) );
    System.out.println( checkAllChars( "123456rfghjhgf356" ) );
    System.out.println( checkAllChars( "qwertyuiopasdfghjklzxcvb@#" ) );
    System.out.println( checkAllChars( "mnbvcxzpoiuytrewqlkjhgfdsa" ) );

  }
  private static String checkAllChars ( String input ) {
    //If input length is less than 26 then it can never be complete
	   if(input.length() < 26) {
        return "\nString is incomplete as it does not contain all the characters from a to z.";
      }
      for (char ch = 'A'; ch <= 'Z'; ch++) {
        if (input.indexOf(ch) < 0 && input.indexOf((char) (ch + 32)) < 0) {
            return "\nString is incomplete as it does not contain all the characters from a to z.";
        }
      }
    return "\nStirng is a perfect match!";
	}
}
 
