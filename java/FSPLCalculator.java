import java.util.Scanner;

public class FSPLCalculator {

    // Method to calculate FSPL
    public static double calculateFSPL(double frequencyMHz, double distanceKm) {
        return 20 * Math.log10(distanceKm) + 20 * Math.log10(frequencyMHz) + 32.44;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter frequency (in MHz): ");
        double frequencyMHz = scanner.nextDouble();

        System.out.print("Enter distance (in km): ");
        double distanceKm = scanner.nextDouble();

        if (frequencyMHz <= 0 || distanceKm <= 0) {
            System.err.println("Frequency and distance must be positive values.");
            return;
        }

        // Calculate and display FSPL
        double fspl = calculateFSPL(frequencyMHz, distanceKm);
        System.out.printf("Free Space Path Loss (FSPL) = %.2f dB%n", fspl);
    }
}