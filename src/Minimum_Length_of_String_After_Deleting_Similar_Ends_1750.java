
public class Minimum_Length_of_String_After_Deleting_Similar_Ends_1750 {
	public static int minimumLength(String s) {
		int n = s.length();
		int i = 0;
		int j = n - 1;
		while (i <= j && s.charAt(i) == s.charAt(j)) {
			char ch = s.charAt(i);
			while (i <= j && s.charAt(i) == ch)
				i++;
			while (i <= j && s.charAt(j) == ch)
				j--;

		}
		return (i > j) ? 0 : i - j + 1;
	}

	public static void main(String[] args) {
		String s = "cabaabac";
		System.out.println(minimumLength(s));
	}
}
