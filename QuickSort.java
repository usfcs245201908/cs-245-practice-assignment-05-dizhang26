public class QuickSort implements SortingAlgorithm {
	
	public void sort(int[] a) {
		
		sort(a, 0, a.length - 1);
	}
	
	public void swap(int[] a, int i, int j) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public void sort(int a[], int first, int last) {
		
		 if (first <= last - 1) {
			 int j = partition(a, first, last);
			 sort(a, first, j - 1);
			 sort(a, j + 1, last);
		 } else {
			 return;
		 }
	}
	 
	public int partition(int [] a, int first, int last) {
		
		int i = first;                         
        int j = last;
        
        int pivot = a[first];       

        while (i < j) {
            while (a[i] <= pivot && j > i && i <= last) {
            		i++;
            }  
                                                     
            while (a[j] > pivot && j >= first && j >= i) {
            		j--;
            } 
                                                     
            if (i < j){
            		swap(a, i, j);
            }                                 
        }
        swap(a, first, j);                         

        return j;
	}
}