package dsa.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class MergeSortTest  {

    @Test
    public void mergeSortingArrayUnsorted(){
        int [] arr = new int[]{3,6,2,4,8,1,22,18,99};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals("Array not equals", arr, new int[]{1,2,3,4,6,8,18,22,99});
    }


    @Test
    public void mergeSortingWhenArrayIsSorted(){
        int [] arr = new int[]{1, 2, 3, 4, 5, 6};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals("Array not equals", arr, new int[]{1, 2, 3, 4, 5 ,6});
    }

}