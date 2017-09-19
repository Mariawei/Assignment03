import java.util.Arrays;

public class MergeSort implements SortingAlgorithm{

	@Override

	public void sort(int[] a){
		int mid = a.length/2;

		if(a.length >1){
			int[] top = Arrays.copyOfRange(a, 0, mid);
			
			int[] bot = Arrays.copyOfRange(a, mid, a.length);
			sort(top);
			sort(bot);
			merge(a,top,bot);
		}
	}
	public void merge(int[]a, int[] top, int[] bot){
		int top_index = 0;
		int bot_index = 0;
		int a_index = 0;
		while (top_index < top.length && bot_index < bot.length){
			if(top[top_index] <= bot[bot_index]){
				a[a_index] = top[top_index];
				a_index++;
				top_index++;
			}else{
				a[a_index++] = bot[bot_index++];
			}
		}
		while (top_index <top.length){
			a[a_index] = top[top_index];
			a_index++;
			top_index++;
		}
		while (bot_index <bot.length){
			a[a_index] = bot[bot_index];
			a_index++;
			bot_index++;
		}

	}
	
}
