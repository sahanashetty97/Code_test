public class FruitStandMinCost {
    public static void main(String[] args) {
        int[] cherryPrices = {5, 6, 4};    // Prices of cherries at each fruit stand
        int[] peachPrices = {8, 7, 9};     // Prices of peaches at each fruit stand
        int[] pearPrices = {3, 4, 5};      // Prices of pears at each fruit stand

        int minCostIndex = getMinCostFruitStand(cherryPrices, peachPrices, pearPrices);

        System.out.println("The first fruit stand with the lowest total cost is: " + (minCostIndex + 1));
        System.out.println("The price at this fruit stand was: " + getPrice(cherryPrices, peachPrices, pearPrices, minCostIndex));
    }

    public static int getMinCostFruitStand(int[] cherryPrices, int[] peachPrices, int[] pearPrices) {
        int minCostIndex = 0;   // Index of the fruit stand with the lowest total cost
        int minCost = cherryPrices[0] + pearPrices[0];   // Initialize the minimum cost

        for (int i = 1; i < cherryPrices.length; i++) {
            int cherryCost = cherryPrices[i] + pearPrices[i];
            int peachCost = peachPrices[i] + pearPrices[i];
            int totalCost = Math.min(cherryCost, peachCost);

            if (totalCost < minCost) {
                minCost = totalCost;
                minCostIndex = i;
            }
        }

        return minCostIndex;
    }

    public static String getPrice(int[] cherryPrices, int[] peachPrices, int[] pearPrices, int index) {
        int cherryCost = cherryPrices[index] + pearPrices[index];
        int peachCost = peachPrices[index] + pearPrices[index];
        int minCost = Math.min(cherryCost, peachCost);

        if (minCost == cherryCost) {
            return "Cherries: " + cherryPrices[index] + ", Pears: " + pearPrices[index];
        } else {
            return "Peaches: " + peachPrices[index] + ", Pears: " + pearPrices[index];
        }
    }
}

