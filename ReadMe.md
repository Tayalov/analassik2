# Assignment 2: Heap Sort Algorithm

This project implements the classic **Heap Sort** algorithm using bottom-up heap construction 
and in-place sorting. It also collects performance metrics such as number of comparisons, swaps, 
and runtime. The implementation is written in **Java** and follows a modular Maven structure.

---

## 1. Project Overview

The goal of this assignment is to implement Heap Sort with performance tracking and validate 
its theoretical complexity through experimental benchmarks. The project includes:

- Heap Sort implementation
- Performance tracking (comparisons, swaps)
- CLI benchmarking tool
- CSV export of results
- JUnit 5 test suite

---

## 2. Architecture

The project contains the following classes:

* **HeapSort.java** – core sorting logic using max-heap.
* **PerformanceTracker.java** – tracks comparisons and swaps.
* **BenchmarkRunner.java** – CLI tool to run benchmarks and export CSV.
* **HeapSortTest.java** – unit tests for correctness and edge cases.

This modular structure ensures clarity, reusability, and separation of concerns.

---

## 3. Complexity Analysis

### Heap Sort

Recurrence:
T(n) = T(n/2) + O(log n) for heapify  
Total: O(n log n)

- **Time Complexity**:
    - Best: O(n log n)
    - Average: O(n log n)
    - Worst: O(n log n)

- **Space Complexity**:
    - O(1) auxiliary space (in-place)

Heap Sort guarantees stable performance regardless of input distribution.

---

## 4. Experiments and CSV Results

We collected the following metrics for each input size:

- Runtime (milliseconds)
- Number of comparisons
- Number of swaps

The benchmark was run on randomly generated arrays of increasing size.

**CSV file:**  
📄 `docs/performance-plots/heapsort-results.csv`

![Снимок экрана 2025-10-02 113728.png](../../Pictures/Screenshots/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202025-10-02%20113728.png)

<img width="1831" height="555" alt="Снимок экрана 2025-10-02 113728" src="https://github.com/user-attachments/assets/917886e5-0b25-4cfb-9eca-09dd4937251c" />

