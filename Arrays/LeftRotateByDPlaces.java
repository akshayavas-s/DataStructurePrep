public class LeftRotateByDPlaces {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d = 3;
        leftRotate(arr, d);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    //optimal solution
    public static void leftRotate(int[] arr, int d){
        int n = arr.length;
        d=d%n;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    //Brute method
    // public static void leftRotate(int[] arr, int d){
    //     int n = arr.length;
    //     d=d%n;

    //     for(int i =0;i<d;i++){
    //         int first = arr[0];

    //         for(int j=0;j<n-1;j++){
    //             arr[j] = arr[j+1];
    //         }
    //         arr[n-1]=first;
    //     }
    // }
}
