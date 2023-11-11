public class BonusMilesCalculator {
    public static void main(String[] args) {

        int ticketPrice = 40_765;
        int milesPrice = 20;
        int resultMiles;

        resultMiles = ticketPrice / milesPrice;

        System.out.println(resultMiles);
    }
}