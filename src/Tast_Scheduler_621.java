import java.util.Arrays;

public class Tast_Scheduler_621 {
	public static int leastInterval(char[] tasks, int n) {
		// n có nghĩa là nếu 2 nhiệm vụ giống nhau
		// vd: đầu tiên thực hiện nhiệm vụ A
		// sau đó muốn thực hiện nhiệm A đó lại thì cách ít nhất là bằng n
		int[] freq = new int[26];
		for (char task : tasks) {
			freq[task - 'A']++;
		}

		/*
		 * 'A': 3, 'B': 3 => A -> B -> idle -> idle -> A -> B -> idle -> idle -> A -> B
		 * => có tối đa là 4 điểm nghỉ khi không có tiến trình nào được chạy => idel = 4
		 * => Thêm các tiến trình tiến trình thế chỗ idel để giảm thiểu thời gian nghỉ
		 * và thay thế vào đó là tiến trình
		 */

		Arrays.sort(freq);
		int chunk = freq[25] - 1; // lấy tấn số lớn nhất và nhân với n để ra số điểm nghỉ tối đa, (-1 vì dụ như là
									// A _ _ _ A _ _ _ A => thì nó có số điểm nghỉ là (freq - 1) * n)
		int idle = chunk * n; // tính thời gian idle dài nhất có thể có
		for (int i = 24; i >= 0; i--) {
			idle -= Math.min(chunk, freq[i]); // nếu có các process khác với các
		}
		return idle < 0 ? tasks.length : tasks.length + idle;
	}

	public static void main(String[] args) {
		char[] tasks = { 'A', 'A', 'A', 'A', 'A', 'B', 'B', 'B', 'B', 'C', 'C', 'C' };
		int n = 3;
		System.out.println(leastInterval(tasks, n));
	}
}
