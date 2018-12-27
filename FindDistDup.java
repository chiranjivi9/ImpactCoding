// Q3. Find all duplicate values and store it in an array.
// Assuming that we are given an array which has duplicate elements.
// This code will store those elements in a new set and print it.
import java.util.HashSet;
import java.util.Set;

public class FindDistDup {
	public static void main(String[] args) {
		Integer[] arr = {12, 3, 1, 3, 4, 5, 5, 2, 12, 10, 11, 11};
		int size = arr.length;
		Set<Integer> distinctSet = new HashSet<Integer>();
		Set<Integer> duplicateSet = new HashSet<Integer>();

		for(int i = 0; i < size; i++) {
			if(distinctSet.add(arr[i]) == false) {
				duplicateSet.add(arr[i]);
			}
		}
		if(duplicateSet.size() == 0) {
			duplicateSet.add(-1);
		}

		System.out.println("The duplicate values in the array(Ordered) are: " + duplicateSet);
	//		System.out.println("The disticnt values in the array are: " + distinctSet);
	}
}
