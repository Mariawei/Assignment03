
public class QuickSort implements SortingAlgorithm{

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		sort(a, 0, a.length-1);
	}
	private void sort(int[] a, int top, int bot){
		int mid = patition(a, top, bot);
		if(top < mid-1) {
			sort(a, top, mid-1);
		}
		if(bot > mid){
			sort(a, mid, bot); 
		}
	}
	public int patition(int[] a, int top, int bot){
		int i = top;
		int j = bot;
		int mid = (top + bot)/2;
		while (i <= j){
			while(a[i] < a[mid]){
				i++;
			}
			while(a[j] > a[mid]){
				j--;
			}
			if(i <= j){
				if(i == mid){
					mid = j;
				}else if(j == mid){
					mid = i;
				}
				swap(a,i++,j--);
			
			}
		}
		return i;
	}
	public void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;	
	}
	
	
}
