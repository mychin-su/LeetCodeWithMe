
public class Find_the_Pivot_Integer_2485 {
	public static int pivotInteger(int n) {
		int sum = (n * (n + 1)) / 2;
		int leftSum = 1;
		int rightSum = n;
		for (int i = 1; i <= n; i++) {
			int midNum = leftSum + (rightSum - leftSum) / 2;
			int firstSum = (midNum * (midNum + 1)) / 2;
			int secondSum = sum - firstSum + midNum;
			if (firstSum == secondSum) {
				return midNum;
			} else if (firstSum < secondSum) {
				leftSum = midNum + 1;
			} else
				rightSum = midNum - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int n = 8;
		System.out.println(pivotInteger(n));
	}
}
