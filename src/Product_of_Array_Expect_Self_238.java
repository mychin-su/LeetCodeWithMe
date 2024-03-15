import java.util.Arrays;

public class Product_of_Array_Expect_Self_238 {
	public static int[] productExceptSelf(int[] nums) {
		// C1: Brute Force
		int n = nums.length;
		int ans[] = new int[n];
//		for (int i = 0; i < n; i++) {
//			int pro = 1;
//			for (int j = 0; j < n; j++) {
//				if (i != j) {
//					pro *= nums[j];
//				}
//			}
//			ans[i] = pro;
//		}
//		return ans;

		// Divide all the product of array with the number

//		int pro = 1;
//		for (int i : nums) {
//			pro *= i;
//		}
//
//		for (int i = 0; i < n; i++) {
//			ans[i] = pro / nums[i];
//		}
//		return ans;

		// C3
//		int pre[] = new int[n];
//		int suff[] = new int[n];
//		pre[0] = 1;
//		suff[n - 1] = 1;
//		for (int i = 1; i < n; i++) {
//			pre[i] = pre[i - 1] * nums[i - 1];
//		}
//
//		for (int i = n - 2; i >= 0; i--) {
//			suff[i] = suff[i + 1] * nums[i + 1];
//		}
//		for (int i = 0; i < n; i++) {
//			ans[i] = pre[i] * suff[i];
//		}
//		return ans;

		// C4

		Arrays.fill(ans, 1); // điền toàn bộ giá trị trong bảng toàn là 1
		int curr = 1;
		for (int i = 0; i < n; i++) {
			ans[i] *= curr;
			curr *= nums[i];
		}

		curr = 1;
		for (int i = n - 1; i >= 0; i--) {
			ans[i] *= curr;
			curr *= nums[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}
}
