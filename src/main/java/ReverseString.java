
public class ReverseString {

	public static void main(String[] args) {
		char[] s = new char[] { 'a', 'b', 'c', 'd', 'e' };
		reverseString(s);
		System.out.println(s);
	}

	public static void reverseString(char[] s) {
			int n = s.length;
			int middle = n/2;
			for (int i = 0; i < middle; i++) {
				char temp = s[i];
				s[i] = s[n - 1 - i];
				s[n - 1 - i] = temp;
			}
	}

}
