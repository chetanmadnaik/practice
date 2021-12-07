package dsa.sorting;

import junit.textui.TestRunner;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortkTest extends TestRunner {

    @Test
    public void mergeSortingArrayUnsorted(){
        int [] arr = new int[]{3,6,2,4,8,1,22,18,99};
        MergeSortk mergeSort = new MergeSortk(arr);
        mergeSort.sort(arr);
        assertArrayEquals("Array not equals", arr, new int[]{1,2,3,4,6,8,18,22,99});
    }


    @Test
    public void mergeSortingWhenArrayIsSorted(){
        int [] arr = new int[]{1, 2, 3, 4, 5, 6};
        MergeSortk mergeSort = new MergeSortk(arr);
        mergeSort.sort(arr);
        assertArrayEquals("Array not equals", arr, new int[]{1, 2, 3, 4, 5 ,6});
    }

}