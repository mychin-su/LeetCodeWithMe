import java.util.HashMap;
import java.util.Map;

public class Custom_Sort_String_791 {
	public static String customSortString(String order, String s) {
		Map<Character, Integer> countMap = new HashMap<>();
		for (char c : s.toCharArray()) {
			countMap.put(c, countMap.getOrDefault(c, 0) + 1);
		}
		StringBuilder sb = new StringBuilder();
		for (char c : order.toCharArray()) {
			if (countMap.containsKey(c)) {
				int count = countMap.get(c);
				while (count-- != 0) {
					sb.append(c);
				}
			}
			countMap.remove(c);
		}
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			char key = entry.getKey();
			int val = entry.getValue();
			while (val-- > 0) {
				sb.append(key);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String order = "bcafg";
		String s = "abcd";
		System.out.println(customSortString(order, s));
	}
}
