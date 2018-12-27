//Code which has the ability to produce a comma delimited list of numbers, grouping the
//numbers into a range when they are sequential.
//assuming that the list is in sequential order

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FindRange {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(2,3,4,5,8,10,11,12,15,16,17,18,19,25,26,30,32);
		List<List<Integer>>linkedList = new ArrayList<List<Integer>>();
		System.out.println("List is: "+ myList);
		int first = 0;
		int i = 0;
		List<Integer> startList = new ArrayList<Integer>(2);
		
		for (i = 1; i < myList.size(); i++) {
			if (myList.get(i - 1) + 1 != myList.get(i)) {
				startList.add(myList.get(first));
				startList.add(myList.get(i-1));
				linkedList.add(startList);
				startList = new ArrayList<Integer>(2);
				first = i;
			}
		}
		startList.add(myList.get(first));
		startList.add(myList.get(myList.size()-1));
		linkedList.add(startList);
		System.out.println("The List in Range: " + linkedList);
	}
}
