#include <iostream>
#include <cmath>

using namespace std;

// Function to calculate FSPL
double calculateFSPL(double frequencyMHz, double distanceKm) {
    return 20 * log10(distanceKm) + 20 * log10(frequencyMHz) + 32.44;
}

int main() {
    double frequencyMHz, distanceKm;

    // Get user input
    cout << "Enter frequency (in MHz): ";
    cin >> frequencyMHz;

    cout << "Enter distance (in km): ";
    cin >> distanceKm;

    if (frequencyMHz <= 0 || distanceKm <= 0) {
        cerr << "Frequency and distance must be positive values." << endl;
        return 1;
    }

    // Calculate and display FSPL
    double fspl = calculateFSPL(frequencyMHz, distanceKm);
    cout << "Free Space Path Loss (FSPL) = " << fspl << " dB" << endl;

    return 0;
}
