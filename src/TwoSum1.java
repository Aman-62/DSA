import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
  public static void main(String[] args) {
    int[] nums = {3, 1, 10, 2, 4};
    int target = 6;
    int[] result = twoSum(nums, target);

    // for (int i = 0; i < nums.length; i++) {
    //   for (int j = i+1; j < nums.length; j++) {
    //     if(i == j) continue;

    //     int sum = nums[i] + nums[j];
    //     if(sum == target) {
    //       result[0]=i;
    //       result[1]=j;
    //       break;
    //     }
    //   }
    // }



    System.out.println(result[0]);
    System.out.println(result[1]);
  }

  public static int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map=new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int comp = target-nums[i];

      if(map.containsKey(comp)) return new int[]{map.get(comp), i};
      
      map.put(nums[i],i);
    }
    throw new IllegalArgumentException("No sum solution");  
  }
}

/*
 * Given an array of integers (nums) and an integer (target), return indices of the two numbers such that they add up to target
 * 
 * Test case #1
 * nums = [2, 7, 11, 15]; target = 9
 * 
 * Test case #2
 * nums = [3, 2, 4]; target = 6
 * 
 * Test case #3
 * nums = [3, 3]; target = 6
 */