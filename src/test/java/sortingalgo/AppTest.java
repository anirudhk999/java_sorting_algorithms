package sortingalgo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testBubbleSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expectedAsc = {2, 3, 4, 5, 8};
        int[] expectedDesc = {8, 5, 4, 3, 2};
 
        App.bubbleSort(arr, false);
        assertArrayEquals(expectedAsc, arr);
 
        App.bubbleSort(arr, true);
        assertArrayEquals(expectedDesc, arr);
    }
 
    @Test
    public void testSelectionSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expectedAsc = {2, 3, 4, 5, 8};
        int[] expectedDesc = {8, 5, 4, 3, 2};
 
        App.selectionSort(arr, false);
        assertArrayEquals(expectedAsc, arr);
 
        App.selectionSort(arr, true);
        assertArrayEquals(expectedDesc, arr);
    }
 
    @Test
    public void testInsertionSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expectedAsc = {2, 3, 4, 5, 8};
        int[] expectedDesc = {8, 5, 4, 3, 2};
 
        App.insertionSort(arr, false);
        assertArrayEquals(expectedAsc, arr);
 
        App.insertionSort(arr, true);
        assertArrayEquals(expectedDesc, arr);
    }
 
    @Test
    public void testMergeSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expectedAsc = {2, 3, 4, 5, 8};
        int[] expectedDesc = {8, 5, 4, 3, 2};
 
        App.mergeSort(arr, false);
        assertArrayEquals(expectedAsc, arr);
 
        App.mergeSort(arr, true);
        assertArrayEquals(expectedDesc, arr);
    }

    @Test
    public void testQuickSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expectedAsc = {2, 3, 4, 5, 8};
        int[] expectedDesc = {8, 5, 4, 3, 2};
 
        App.quickSort(arr, false);
        assertArrayEquals(expectedAsc, arr);
 
        App.quickSort(arr, true);
        assertArrayEquals(expectedDesc, arr);
    }

}
