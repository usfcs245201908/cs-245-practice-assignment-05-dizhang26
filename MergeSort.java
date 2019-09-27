public class MergeSort implements SortingAlgorithm {

    private int[] temp;

    public void sort(int[] a) {
        int index = a.length;
        temp = new int[index];
        sort(a, 0, index - 1);
    }

    public void sort(int[] a, int first, int last) {
        
        if (first < last) {
           
            int mid = (first + last) / 2;
           
            sort(a, first, mid);

            sort(a, mid + 1, last);

            sort(a, first, mid, last);
        }
    }

    public void sort(int[] a, int first, int mid, int last) {

        for (int i = first; i <= last; i++) {
            temp[i] = a[i];
        }

        int firstIndex = first;
        int midIndex = mid + 1;
        int lastIndex = first;
        
        while (firstIndex <= mid && midIndex <= last) {
            if (temp[firstIndex] <= temp[midIndex]) {
                a[lastIndex] = temp[firstIndex];
                firstIndex++;
            } else {
                a[lastIndex] = temp[midIndex];
                midIndex++;
            }
            lastIndex++;
        }
        
        while (firstIndex <= mid) {
            a[lastIndex] = temp[firstIndex];
            lastIndex++;
            firstIndex++;
        }
    }

}