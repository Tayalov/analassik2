package algorithms;

import metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeapSortTest {

    @Test
    public void testSortingElements() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        HeapSort sorter = new HeapSort(new PerformanceTracker());
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 5, 6, 9}, arr);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {42};
        HeapSort sorter = new HeapSort(new PerformanceTracker());
        sorter.sort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        HeapSort sorter = new HeapSort(new PerformanceTracker());
        sorter.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testDuplicates() {
        int[] arr = {5, 3, 5, 3, 5};
        HeapSort sorter = new HeapSort(new PerformanceTracker());
        sorter.sort(arr);
        assertArrayEquals(new int[]{3, 3, 5, 5, 5}, arr);
    }

    @Test
    public void testReverseSortedArray() {
        int[] arr = {9, 8, 7, 6, 5};
        HeapSort sorter = new HeapSort(new PerformanceTracker());
        sorter.sort(arr);
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, arr);
    }
}