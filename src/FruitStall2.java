public class FruitStall2 {
    public static void main(String[] args) {
        int[] cherryPrices = {10, 12, 8, 15}; // Prices of cherry baskets at each fruit stand
        int[] peachPrices = {8, 10, 12, 14}; // Prices of peach baskets at each fruit stand
        int[] pearPrices = {9, 11, 7, 13}; // Prices of pear baskets at each fruit stand

        int minCost = Integer.MAX_VALUE;
        int minCostIndex = -1;

        for (int i = 0; i < cherryPrices.length; i++) {
            int cherryCost = cherryPrices[i];
            int peachCost = peachPrices[i];
            int pearCost = pearPrices[i];
            int cherryAndPearCost = cherryCost + pearCost;
            int peachAndPearCost = peachCost + pearCost;

            int minCostWithCherry = Math.min(cherryAndPearCost, peachCost);
            int minCostWithPeach = Math.min(peachAndPearCost, cherryCost);

            int totalCost = Math.min(minCostWithCherry, minCostWithPeach);

            if (totalCost < minCost) {
                minCost = totalCost;
                minCostIndex = i + 1; // Adding 1 to convert index to fruit stand number
            }
        }

        System.out.println("The fruit stand with the lowest total price is: " + minCostIndex);
        System.out.println("The price of the fruit basket is: " + minCost);
    }

}