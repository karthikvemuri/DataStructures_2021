import java.util.*;

public class TwoSum {
        public static int[] twoSum(int[] nums, int target) {

            Map<Integer, Integer> intMap = new HashMap<>();

            for(int i = 0; i < nums.length ; i++){

                int diff = target - nums[i];

                if (intMap.containsKey(diff)){
                    return new int[] {intMap.get(diff), i};
                }

                intMap.put(nums[i], i);
            }

            return null;
        }

        public static void main(String [] args){
            int[] result = TwoSum.twoSum(new int[] { 1, 2, 3, 4, 6 }, 6);
            System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        }
}

