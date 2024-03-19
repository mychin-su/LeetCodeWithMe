import java.util.Arrays;

public class Minimum_Number_of_Arrows_to_Burst_Balloons_452 {
	public static int findMinArrowShots(int[][] points) {
		// Sort the ballons based on their end coordinates
		Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1])); // sắp xếp mảng 2 chiều theo thứ tự tăng dần theo
																	// cột thứ 2
		// [ [1, 6], [2, 8], [7, 12], [10, 16] ]
		int arrows = 1;
		int prevEnd = points[0][1];
		for (int i = 1; i < points.length; i++) {
			if (points[i][0] > prevEnd) {
				arrows++;
				prevEnd = points[i][1];
			}
		}
		return arrows;

	}

	public static void main(String[] args) {
		int[][] points = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
		System.out.println(findMinArrowShots(points));
	}
}
