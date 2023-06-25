public class FruitStall4 {
    public static void main(String[] args) {
        String[] fruitStands = {"Fruit Stand 1", "Fruit Stand 2", "Fruit Stand 3", "Fruit Stand 4"}; // Names of fruit stands
        int[] cherryRate = {10, -1, 8, 15}; // Prices of cherry baskets at each fruit stand (-1 indicates unavailability)
        int[] peachRate = {8, 10, -1, 14}; // Prices of peach baskets at each fruit stand (-1 indicates unavailability)
        int[] pearRate = {9, 11, 7, 13}; // Prices of pear baskets at each fruit stand

        int minCost = Integer.MAX_VALUE;
        int minCostIndex = -1;
        String boughtFruit = "";
        String otherFruit = "";
        int stallCount = 0;

        for (int i = 0; i < fruitStands.length; i++) {
            int cherryCost = cherryRate[i];
            int peachCost = peachRate[i];
            int pearCost = pearRate[i];

            if (cherryCost != -1 && pearCost != -1) {
                int cherryAndPearCost = cherryCost + pearCost;
                if (cherryAndPearCost < minCost) {
                    minCost = cherryAndPearCost;
                    minCostIndex = i;
                    boughtFruit = "Cherry";
                    otherFruit = "Pear";
                    stallCount = 1;
                }
            }

            if (peachCost != -1 && pearCost != -1) {
                int peachAndPearCost = peachCost + pearCost;
                if (peachAndPearCost < minCost) {
                    minCost = peachAndPearCost;
                    minCostIndex = i;
                    boughtFruit = "Peach";
                    otherFruit = "Pear";
                    stallCount = 1;
                }
            }
        }

        System.out.println("The fruit stand with the lowest total price is: " + fruitStands[minCostIndex]);
        System.out.println("The price of the fruit basket is: " + minCost);
        System.out.println("Fruits bought: " + boughtFruit + " and " + otherFruit);
        System.out.println("Number of stalls involved: " + stallCount);
    }
}

