import java.util.*;

public class TripletSumToZero {

    public static List<List<Integer>> searchTriplets(int [] arr){

        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();

        int len = arr.length;

        for(int i = 0; i < len - 2; i++){
            if(i > 0 && arr[i] == arr[i-1])
                continue;
            searchPair(arr, -arr[i], i + 1, triplets);
        }
        return triplets;
    }

    public static void searchPair(int [] arr, int targetSum, int left, List<List<Integer>> triplets){

        int len = arr.length;
        int right = len - 1;

        while(left < right){
            int currentSum = arr[left] + arr[right];

            if(currentSum == targetSum){
                triplets.add(Arrays.asList(-targetSum, arr[left], arr[right]));
                left++;
                right--;
                while(left < right && arr[left] == arr[left - 1])
                    left++;
                while(left < right && arr[left] == arr[right + 1])
                    right--;
            }else if(currentSum < targetSum){
                left++;
            }else{
                right--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(TripletSumToZero.searchTriplets(new int[] { -3, 0, 1, 2, -1, 1, -2 }));
        System.out.println(TripletSumToZero.searchTriplets(new int[] { -5, 2, -1, -2, 3 }));
    }
}
