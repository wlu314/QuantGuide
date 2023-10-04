public class Main {
    public static void main(String args[]) {
        // Create an instance of probandstat

        // Call the probabilityOfUnfairCoins2 method on the instance
        double x = probabilityOfUnfairCoins2(98, 1, 1);

        System.out.println(x);
    }
    //Flip 98 fair coins, one double-headed coin, 
    //and 1 double-tailed coin and observe the first coin tossed. 
    //A coin is selected uniformly at random and you see it shows heads. 
    //What is the probability that this coin is the double-headed coin?


    //solution by using bayes theorem
    // P(D|H) is the probability of getting a double-headed coin
    // P(D|H) = P(H|D) * P(D) / P(H) = (1/100) * 1 / (1/100) + (98/100 * 1/2)
    // P(H|D) = 1, is the probability of landing on head given you have a double sided head
    // P(H), the probabilty of getting heads include
    //      -chance from doubled heads
    //         (1/100) * (1), 100% chance from 1 double sided heads 
    //      -chance from fair coin
    //          (98/100) * (1/2), 50-50 chance for fair coins
    //      -chance from doubled tail
    //          (1/100) * (0), 0% chance for double sided tail
    // P(D) = 1/100, is the probability of getting a doubled-headed coin
    
    public static double probabilityOfUnfairCoins2(double fairCoins, double doubleHeadCoins, double doubleTailCoins) {
        double totalCoins = fairCoins + doubleHeadCoins + doubleTailCoins;
        // Probability of getting a double-headed coin
        double pDHC = doubleHeadCoins / totalCoins;
        // Probability of getting a double-tail coin
        double pDTC = doubleTailCoins / totalCoins;
        // Probability of drawing a heads from a double-headed coin
        double probOfHeadsFromDHC = 1;
        // Probability of drawing a heads
        double probOfHead = (pDHC * probOfHeadsFromDHC) + (fairCoins /totalCoins * 0.5);

        // Probability of drawing a double-sided head given it's heads
        // P(D|H) = P(H|D) * P(D) / P(H)
        double finalProb = (probOfHeadsFromDHC * pDHC) / probOfHead;
        return finalProb;
        
    }
}