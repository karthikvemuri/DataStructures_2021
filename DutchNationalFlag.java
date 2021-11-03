public class DutchNationalFlag {

    public static void sort(int [] arr) {
        int len = arr.length;

        if (len == 0 || len == 1)
            return;

        int start = 0;
        int end = len - 1;

        int index = 0;

        while (index <= end && start < end) {

            if(arr[index] == 0){
                swap(arr, index, start);
                index++;
                start++;
            }else if(arr[index] == 2){
                swap(arr, index, end);
                end--;
            }else{
                index++;
            }
        }
    }

    private static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String [] args){
        int[] arr = new int[] { 1, 0, 2, 1, 0 };
        DutchNationalFlag.sort(arr);

        for(int i : arr){
            System.out.println(i + " ");
        }
    }
}
