public class SquaringaSortedArrat {

    public static int[] makeSquares(int [] arr){

        int len = arr.length;
        int left = 0;
        int right = len - 1;
        int leftSq = 0;
        int rightSq = 0;
        int [] squaredArray = new int[len];
        int lastIndex = len - 1;

        while(left < right){
            leftSq = arr[left] * arr[left];
            rightSq = arr[right] * arr[right];

            if(leftSq > rightSq){
                squaredArray[lastIndex--] = arr[left];
                left++;
            }else{
                squaredArray[lastIndex--] = arr[right];
                right--;
            }
        }
        return  squaredArray;
    }

    public static void main(String [] args){
        int[] result = SquaringaSortedArrat.makeSquares(new int[] { -2, -1, 0, 2, 3 });
        for (int num : result)
            System.out.print(num + " ");
    }
}
