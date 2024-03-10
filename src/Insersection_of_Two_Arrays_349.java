import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Insersection_of_Two_Arrays_349 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int num : nums1) {
			set1.add(num);
		}
		for (int num : nums2) {
			if(set1.contains(num)) {
				set2.add(num);
			}
		}
		int result[] = new int[set2.size()];
		int i = 0;
		for(int x : set2) {
			result[i] = x;
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		int nums1[] = { 4, 9, 5 };
		int nums2[] = { 9, 4, 9, 8, 4 };

		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
}
