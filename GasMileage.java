import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.println("Enter miles driven (-1 to quit): ");
        int miles = scanner.nextInt();

        while (miles != -1) {
            System.out.println("Enter gallons used: ");
            int gallons = scanner.nextInt();

            double milesPerGallon = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);

            totalMiles += miles;
            totalGallons += gallons;

            if (totalGallons != 0) {
                double combinedMilesPerGallon = (double) totalMiles / totalGallons;
                System.out.printf("Combined miles per gallon: %.2f%n", combinedMilesPerGallon);
            } else {
                System.out.println("No gallons used yet. Combined miles per gallon cannot be calculated.");
            }

            System.out.println("\nEnter miles driven (-1 to quit): ");
            miles = scanner.nextInt();
        }

        System.out.println("Program terminated.");
        scanner.close();
    }
}
