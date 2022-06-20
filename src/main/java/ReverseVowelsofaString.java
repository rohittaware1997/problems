import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsofaString {

	public static void main(String[] args) {
		char[] s = new char[] { 'l', 'e', 'e', 't', 'c', 'o', 'd', 'e' };
		reverseVowelsofaString("leetcode");
		System.out.println(reverseVowelsofaString("leetcode"));
	}

	public static String reverseVowelsofaString(String s) {
		String vowels = "aeiouAEIOU";
		char []s1 = s.toCharArray();
		int i = 0; int j = s1.length - 1;
		
		while (i < j) {
			while (i < j && !vowels.contains(s1[i] + "")) i++;
			while (i < j && !vowels.contains(s1[j] + "")) j--;
			if (i < j) {
				char t = s1[i];
				s1[i] = s1[j];
				s1[j] = t;
				i++; j--;
			}
		}
        return new String(s1);
    }
}
