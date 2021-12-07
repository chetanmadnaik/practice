package dsa.Searching;

import static java.lang.System.out;

public class BinarySearch {


    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        int[] arr = new int[]{1, 3, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55};

        int index = binarySearch.binarySearchRecursion(arr, 100);
        //int index = binarySearch.binarySearch(arr, 100);
        out.print("position = " + index);

    }

    private int binarySearchRecursion(int[] arr, int ele) {
        int start = 0;
        int end = arr.length - 1;
        return binarySearchRec(arr, start, end, ele);
    }


    private int binarySearchRec(int[] arr, int start, int end, int ele) {
        int mid = start + ((end - start) / 2);

        if (start == end && arr[start] != ele) {
            return -1;
        }

        if (arr[mid] == ele) {
            return mid;
        }

        if (arr[mid] > ele) {
            return binarySearchRec(arr, start, mid - 1, ele);
        } else {
            return binarySearchRec(arr, mid + 1, end, ele);
        }
    }


    private int binarySearch(int[] arr, int ele) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == ele) {
                return mid;
            }

            if (arr[mid] > ele) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


}
