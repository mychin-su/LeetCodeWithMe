
public class Binary_Subarrays_With_Sum_930 {
	public static int numSubarraysWithSum(int[] nums, int goal) {
		int count = 0;
		int sum;
		for (int i = 0; i < nums.length; i++) {
			sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				if (sum == goal) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 0, 1, 0, 1 };
		int goal = 2;
		System.out.println(numSubarraysWithSum(nums, goal));
	}
}
