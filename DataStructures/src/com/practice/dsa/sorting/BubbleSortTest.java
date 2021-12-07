package dsa.sorting;

import junit.textui.TestRunner;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;


class BubbleSortTest extends TestRunner {

    private final BubbleSort bubbleSorter =  new BubbleSort();

    @Test
    public void bubbleSortingArrayUnsorted(){
        int [] arr = new int[]{3,6,2,4,8,1,22,18,99};
        bubbleSorter.sort(arr);
        assertArrayEquals("Array not equals", arr, new int[]{1,2,3,4,6,8,18,22,99});
    }


    @Test
    public void bubbleSortingWhenArrayIsSorted(){
        int [] arr = new int[]{1, 2, 3, 4, 5, 6};
        bubbleSorter.sort(arr);
        assertArrayEquals("Array not equals", arr, new int[]{1, 2, 3, 4,5 ,6});
    }

}