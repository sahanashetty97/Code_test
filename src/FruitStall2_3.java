public class FruitStall2_3 {
    public static void main(String[] args) {
        int[] cherryRate = {5, 6, 4};    // Prices of cherries at each fruit stand
        int[] peachRate = {8, 7, 9};     // Prices of peaches at each fruit stand
        int[] pearRate = {3, 4, 5};      // Prices of pears at each fruit stand

        int minCostIndex = getMinCostFruitStand(cherryRate, peachRate, pearRate);

        System.out.println("The first fruit stand with the lowest total cost is: " + (minCostIndex + 1));
        System.out.println("The price at this fruit stand was: " + getPrice(cherryRate, peachRate, pearRate, minCostIndex));
    }

    public static int getMinCostFruitStand(int[] cherryRate, int[] peachRate, int[] pearRate) {
        int minCostIndex = 0;   // Index of the fruit stand with the lowest total cost
        int minCost = cherryRate[0] + pearRate[0];   // Initialize the minimum cost

        for (int i = 1; i < cherryRate.length; i++) {
            int cherryCost = cherryRate[i] + pearRate[i];
            int peachCost = peachRate[i] + pearRate[i];
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

