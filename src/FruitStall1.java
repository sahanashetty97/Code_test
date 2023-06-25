public class FruitStall1 {
    public static void main(String[] args) {
        int[] cherryRate = {10, 12, 9, 15}; // Prices of cherry baskets at each fruit stand
        int[] peachRate = {8, 10, 12, 14}; // Prices of peach baskets at each fruit stand

        int minCost = Integer.MAX_VALUE;
        int minCostIndex = -1;

       for (int i = 0; i < cherryRate.length; i++) {
           int totalCost = cherryRate[i] + peachRate[i];
            if (totalCost < minCost) {
                minCost = totalCost;
                minCostIndex = i + 1; // Adding 1 to convert index to fruit stand number
            }
        }

        System.out.println("The fruit stand with the lowest total rate is: " + minCostIndex);


    }


}
