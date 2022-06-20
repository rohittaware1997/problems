import java.util.Set;
import java.util.HashSet;

public class JewelsAndStones {

	public static void main(String[] args) {

	}

	public int numJewelsInStones(String jewels, String stones) {
		Set<Character> j = new HashSet<Character>();
		for(char je: jewels.toCharArray()) {
			j.add(je);
		}
		
		int count = 0;
		for(char s: stones.toCharArray()) {
			if (j.contains(s)) {
				count++;
			}
		}
		return count;
	}

}
