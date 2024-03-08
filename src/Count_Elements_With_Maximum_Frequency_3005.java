
public class Count_Elements_With_Maximum_Frequency_3005 {
	public static int maxFrequencyElements(int[] nums) {
		int[] count = new int[100];
		for(int i = 0 ; i < nums.length; i ++) {
			count[nums[i]]++;
		}
		int max = 0;
		int sum = 0;
		for(int i = 0; i < count.length; i ++) {
			if(count[i] > max) {
				max = count[i];
				sum = count[i];
			} else if(count[i] == max){
				sum += count[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 2, 3, 1, 4};
		System.out.println(maxFrequencyElements(nums));
	}
}
