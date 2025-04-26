public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {5,6,9,2,8,6};
        int[] ar = {2,6,8,9};
        boolean a = sort(arr);
        boolean b = sort(ar);
        System.out.println(a);
        System.out.println(b);
    }

    static boolean sort(int[] a){
        for(int i = 1; i<a.length; i++){
            if(a[i]>=a[i-1]){

            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
