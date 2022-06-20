import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int arr[] = twoSum(new int[] {2,8,7}, 10);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		 HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		 for(int i = 0; i < nums.length; i++) {
			 numbers.put(nums[i], i);
		 }
		 
		 for (int i = 0; i < nums.length; i++) {
			 int rem = target - nums[i];
			 Integer loc = numbers.get(rem);
			 if (loc != null && loc != i) {
				 return new int[] {i, loc};
			 }
		 }
		 
		 return null;
    }
}
