package metrics;

import java.io.FileWriter;
import java.io.IOException;

public class PerformanceTracker {
    private int comparisons = 0;
    private int swaps = 0;

    public void incrementComparisons() {
        comparisons++;
    }

    public void incrementSwaps() {
        swaps++;
    }

    public int getComparisons() {
        return comparisons;
    }

    public int getSwaps() {
        return swaps;
    }

    public void reset() {
        comparisons = 0;
        swaps = 0;
    }

    public void exportToCSV(String filename, int inputSize, long timeMillis) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.append(inputSize + "," + timeMillis + "," + comparisons + "," + swaps + "\n");
        } catch (IOException e) {
            System.err.println("Ошибка записи CSV: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Comparisons: " + comparisons + ", Swaps: " + swaps;
    }
}