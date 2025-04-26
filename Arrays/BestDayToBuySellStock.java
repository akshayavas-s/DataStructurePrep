public class BestDayToBuySellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,4,3,6,5,2};
        int minimum = arr[0];
        int maxProfit = 0;

        for(int i = 1; i<arr.length; i++){
            int cost = arr[i] - minimum;
            maxProfit = Math.max(cost, maxProfit);
            minimum = Math.min(arr[i], minimum);
        }
        System.out.println("The Maximum Profit: "+ maxProfit);
        System.out.println("The Best cost to Buy is: "+ minimum);
    }
}
