import java.util.*;

public class FirstAndLast {

    public static int[] firstAndLast(int[] nums, int target){

        int firstOccurrence = findRange(nums, target, true);

        if(firstOccurrence == -1){
            return new int[]{-1,-1};
        }

        int secondOccurrence = findRange(nums, target, false);

        return new int[]{firstOccurrence,secondOccurrence};

    }

    private static int findRange(int[] nums, int target, boolean isFirst){

        int len = nums.length;
        int start = 0, end = len - 1;

        while(start <= end){

            int mid = (start + end)/2;

            if(nums[mid] == target){

                if(isFirst){

                    if(mid == start || nums[mid - 1] !=target){

                        return mid;
                    }
                    end = mid - 1;
                }
                else{

                    if(mid == end || nums[mid + 1] != target){

                        return mid;
                    }
                    start = mid + 1;
                }
            }
            else if(nums[mid] < target){

                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        int nums[] = {5, 7, 7, 8, 8, 10};

        int result[] = firstAndLast(nums, 7);
        System.out.println("Range of target: [" + result[0] + ", " + result[1] + "]");
    }
}
