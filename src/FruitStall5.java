public class FruitStall5 {
    public static void main(String[] args) {
        String[] fruitStands = {"Fruit Stand 1", "Fruit Stand 2", "Fruit Stand 3", "Fruit Stand 4"}; // Names of fruit stands
        int[] cherryRate = {10, -1, 8, 15}; // Prices of cherry baskets at each fruit stand (-1 indicates unavailability)
        int[] peachRate = {8, 10, -1, 14}; // Prices of peach baskets at each fruit stand (-1 indicates unavailability)
        int[] pearRate = {9, 11, 7, 13}; // Prices of pear baskets at each fruit stand

        // Mark the fruits bought by Pelle and Kajsa as unavailable
        cherryRate[2] = -1;
        pearRate[2] = -1;

        //peachRate[1] = -1;
        //pearRate[1] = -1;

        int minCost = Integer.MAX_VALUE;
        int minCostIndex = -1;
        String boughtFruit = "";
        String otherFruit = "";
        int stallCount = 0;

        for (int i = 0; i < fruitStands.length; i++) {
            int cherryPrice = cherryRate[i];
            int peachPrice = peachRate[i];
            int pearPrice = pearRate[i];

            if (cherryPrice != -1 && pearPrice != -1) {
                int cherryAndPearCost = cherryPrice + pearPrice;
                if (cherryAndPearCost < minCost) {
                    minCost = cherryAndPearCost;
                    minCostIndex = i;
                    boughtFruit = "Cherry";
                    otherFruit = "Pear";
                    stallCount = 1;
                }
            }

            if (peachPrice != -1 && pearPrice != -1) {
                int peachAndPearCost = peachPrice + pearPrice;
                if (peachAndPearCost < minCost) {
                    minCost = peachAndPearCost;
                    minCostIndex = i;
                    boughtFruit = "Peach";
                    otherFruit = "Pear";
                    stallCount = 1;
                }
            }
        }

        System.out.println("The fruit stand for your friend to buy from is: " + fruitStands[minCostIndex]);
        System.out.println("The price of the fruit basket is: " + minCost);
        System.out.println("Fruits bought: " + boughtFruit + " and " + otherFruit);
        System.out.println("Number of stalls involved: " + stallCount);
    }
}

