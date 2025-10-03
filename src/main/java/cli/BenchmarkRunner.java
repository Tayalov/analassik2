package cli;

import algorithms.HeapSort;
import metrics.PerformanceTracker;

import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000};
        String outputFile = "docs/performance-plots/heapsort-results.csv";

        for (int size : sizes) {
            int[] input = generateRandomArray(size);
            PerformanceTracker tracker = new PerformanceTracker();
            HeapSort sorter = new HeapSort(tracker);

            long start = System.nanoTime();
            sorter.sort(input);
            long end = System.nanoTime();
            long timeMillis = (end - start) / 1_000_000;

            System.out.printf("Size: %d | Time: %.2f ms | %s%n", size, (double) timeMillis, tracker);
            tracker.exportToCSV(outputFile, size, timeMillis);
        }
    }

    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        return rand.ints(size, 0, size * 10).toArray();
    }
}