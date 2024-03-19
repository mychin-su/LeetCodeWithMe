import java.util.ArrayList;
import java.util.List;

public class Insert_Interval_57 {
	public static int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> ans = new ArrayList<>();
		int start = newInterval[0];
		int end = newInterval[1];
		boolean inserted = false;
		for (int[] inv : intervals) {
			int cstart = inv[0];
			int cend = inv[1];
			if (cend < start || inserted == true) {
				ans.add(new int[] { cstart, cend });
				continue;
			}
			start = Math.min(start, cstart);
			if (end < cstart) {
				ans.add(new int[] { start, end });
				ans.add(new int[] { cstart, cend });
				inserted = true;
				continue;
			}
			if (end < cend) {
				ans.add(new int[] { start, cend });
				inserted = true;
			}
		}
		if (!inserted) {
			ans.add(new int[] { start, end });
		}
		return ans.toArray(new int[ans.size()][]);
	}

	public static void main(String[] args) {
		int intervals[][] = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
		int newInterval[] = { 4, 8 };
		System.out.println(insert(intervals, newInterval));
	}
}
