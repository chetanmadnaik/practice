package dsa.sorting;

public class MergeSortk {
    private int [] arr;

    public MergeSortk(int[] arr) {
        this.arr = arr;
    }

    public  void sort(int[] arr) {
        int end = arr.length-1;
        int start =0 ;
        int mid =  (end- start)/2;
        mergeSort(start, mid);
        mergeSort(mid+1, end);
    }

    private  void mergeSort(int start, int end) {
        if(start<end) {
            int mid = start + (end - start) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            mergeArrays(start, mid, end);
        }
    }

    private void mergeArrays(int start, int mid, int end) {

        int n1 = mid-start+1;
        int n2 = end-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        //copy data into left right
        for (int i = 0; i < n1; ++i) {
            left[i]=arr[start+i];
        }
        for (int i = 0; i < n2; ++i) {
            right[i]=arr[mid+1+i];
        }

        int i=0, j=0;
        int k= start;

        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }

        while(i<n1){
            arr[k++]=left[i++];
        }

        while(j<n2){
            arr[k++]=right[j++];
        }

    }

}
