public class RemoveDuplicates {

    public static int remove(int [] arr){

        int unique = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] != arr[i]){
                arr[unique] = arr[i];
                unique++;
            }
        }
        return unique;
    }

    public static void main(String [] args){
        int [] arr = new int [] {2, 3, 3, 3, 6, 9, 9};
        int result = RemoveDuplicates.remove(arr);
        System.out.println("The length of the subarray with no duplicates is : " + result);
    }
}
