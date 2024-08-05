import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Random;
 
class SortingAlgorithmsTest {
    private final Random random = new Random();
 
    @Test
    void testBubbleSort() {
        testSortingAlgorithm(SortingAlgorithms::bubbleSort, "Bubble Sort");
    }
 
    @Test
    void testSelectionSort() {
        testSortingAlgorithm(SortingAlgorithms::selectionSort, "Selection Sort");
    }
 
    @Test
    void testInsertionSort() {
        testSortingAlgorithm(SortingAlgorithms::insertionSort, "Insertion Sort");
    }
 
    @Test
    void testMergeSort() {
        testSortingAlgorithm(SortingAlgorithms::mergeSort, "Merge Sort");
    }
 
    @Test
    void testQuickSort() {
        testSortingAlgorithm(SortingAlgorithms::quickSort, "Quick Sort");
    }
 
    private void testSortingAlgorithm(SortMethod sortMethod, String algorithmName) {
        // Test with ascending order
        int[] arr1 = generateRandomArray(100);
        int[] expected1 = arr1.clone();
        Arrays.sort(expected1);
        sortMethod.sort(arr1, false);
        assertArrayEquals(expected1, arr1, algorithmName + " failed for ascending order");
 
        // Test with descending order
        int[] arr2 = generateRandomArray(100);
        int[] expected2 = Arrays.stream(arr2).boxed()
                .sorted((a, b) -> b.compareTo(a))
                .mapToInt(Integer::intValue)
                .toArray();
        sortMethod.sort(arr2, true);
        assertArrayEquals(expected2, arr2, algorithmName + " failed for descending order");
 
        // Test with empty array
        int[] emptyArr = new int[0];
        sortMethod.sort(emptyArr, false);
        assertEquals(0, emptyArr.length, algorithmName + " failed for empty array");
 
        // Test with single element array
        int[] singleElementArr = {42};
        sortMethod.sort(singleElementArr, false);
        assertArrayEquals(new int[]{42}, singleElementArr, algorithmName + " failed for single element array");
 
        // Test with already sorted array
        int[] sortedArr = {1, 2, 3, 4, 5};
        sortMethod.sort(sortedArr, false);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArr, algorithmName + " failed for already sorted array");
 
        // Test with reverse sorted array
        int[] reverseSortedArr = {5, 4, 3, 2, 1};
        sortMethod.sort(reverseSortedArr, false);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, reverseSortedArr, algorithmName + " failed for reverse sorted array");
    }
 
    private int[] generateRandomArray(int size) {
        return random.ints(size, 1, 1000).toArray();
    }
 
    @FunctionalInterface
    interface SortMethod {
        void sort(int[] arr, boolean reverse);
    }
}

