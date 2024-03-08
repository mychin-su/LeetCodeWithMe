import java.util.Arrays;

public class Equal_Row_and_Column_Pairs_2352 {
	public static int equalPairs(int[][] grid) {
		int count = 0;
		for (int i = 0; i < grid[0].length; i++) {
			int[] n = new int[grid[0].length];
			int s = 0;

			for (int[] row : grid) {
				n[s] = row[i];
				s++;
			}

			for (int[] row : grid) {
				if (Arrays.equals(n, row)) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int grid[][] = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };
		System.out.println(equalPairs(grid));
	}
}
