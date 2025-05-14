public class rightRotateByDPlaces {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d =3;

        rightRotate(arr, d);

        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    //optimal
    public static void rightRotate(int[] arr, int d){
        int n =arr.length;
        d=d%n;

        reverse(arr,0,n-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, d-1);
    }

    public static void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    //brutemethod
    // public static void rightRotate(int[] arr, int d){
    //     int n=arr.length;
    //     d=d%n;
    //     for(int i=0;i<d;i++){
    //         int temp=arr[n-1];
    //         for(int j = n-1; j>0; j--){
    //             arr[j]=arr[j-1];
    //         }
    //         arr[0]=temp;
    //     }
    // }
}
