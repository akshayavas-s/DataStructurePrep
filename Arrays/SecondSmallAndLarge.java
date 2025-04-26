public class SecondSmallAndLarge {
    public static void main(String[] args) {
        int[] arr = {1,8,6,3,4,4,5,9,9,8};
        int secSmall = secondSmallest(arr, arr.length);
        int secLarge = secondLargest(arr, arr.length);
        System.out.println("The Second Largest Value is: "+ secLarge);
        System.out.println("The Second Smallest Value is: "+ secSmall);
    }

    static int secondSmallest(int[] a, int n){
        int smallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(a[i]<smallest){
                sSmallest = smallest;
                smallest = a[i];
            }else if (a[i]!=smallest && a[i]<sSmallest) {
                sSmallest = a[i];
            }
        }
        return sSmallest;
    }

    static int secondLargest(int[] a, int n){
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(a[i]>largest){
                slargest = largest;
                largest = a[i];
            }else if(a[i]!=largest && a[i]>slargest){
                slargest = a[i];
            }
        }
        return slargest; 
    }

}
