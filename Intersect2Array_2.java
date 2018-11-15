// save as Intersect2Array_2.java
// Time and Space complexity
// Time big oh max(n1,n2)
//Space complexity in constant time
import java.util.*;
public class Intersect2Array_2 {
	public static void main(String[] args) {
	Intersect2Array_2 it2 = new Intersect2Array_2(); // create an object instance

	int[] out = it2.intersection(new int[] {2,2,6, 1},  new int[] {2,2,6});

	//for (int i = 0 ; i < out.length ; i++)
	//	System.out.println(out[i]);

	for (Integer x : out)
		System.out.println(x);


} // end main method

public int[] intersection(int[] nums1, int[] nums2) {
	HashSet<Integer> set = new HashSet<>();
	HashSet<Integer> set2 = new HashSet<>();
	HashSet<Integer> set3 = new HashSet<>();

	ArrayList<Integer> output = new ArrayList<>();
	for (Integer x : nums1)
		set.add(x); // add each element to HashSet

	for (Integer y : nums2)
		set2.add(y); // add second array to HashSet

	

	Iterator<Integer> itr = set.iterator();

	while(itr.hasNext()) {
	int temp = itr.next();
	if (set2.contains(temp)) {
		output.add(temp);

	} // end if
	// output.add(itr.next());

	// System.out.println("Output " + itr.next());
} // end while loop

	// return new int[] {};

	int[] output_1 = new int[output.size()];
	int i = 0;
	for (Integer x : output) {

		// System.out.println("x " + x);
		output_1[i] = x;
		i++;
	} // end enhanced for loop

	return output_1;

} // end method intersection





}// end class Intersect2Array