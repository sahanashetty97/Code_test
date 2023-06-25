public class FruitStall1 {
    public static void main(String[] args) {
        int[] cherryPrices = {10, 12, 9, 15}; // Prices of cherry baskets at each fruit stand
        int[] peachPrices = {8, 10, 12, 14}; // Prices of peach baskets at each fruit stand

        int minCost = Integer.MAX_VALUE;
        int minCostIndex = -1;

       for (int i = 0; i < cherryPrices.length; i++) {
           int totalCost = cherryPrices[i] + peachPrices[i];
            if (totalCost < minCost) {
                minCost = totalCost;
                minCostIndex = i + 1; // Adding 1 to convert index to fruit stand number
            }
        }

        System.out.println("The fruit stand with the lowest total price is: " + minCostIndex);


    }


}
