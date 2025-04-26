public class LargestArray {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4};

        // Find the largest element in the array
        int large = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i]> large){
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}
