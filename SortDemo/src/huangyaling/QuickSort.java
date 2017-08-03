package huangyaling;
/**
 * 快速排序
 * @author huangyaling
 *
 */
public class QuickSort {
	
	public void quicksort(int[] arr,int lowindex,int hightindex){
		int baseDate = arr[lowindex] ;			
	}
	
	public void TimeCount(int[] arr){
		long startTime=System.currentTimeMillis();
		quicksort(arr,0,arr.length-1);
		long endTime=System.currentTimeMillis();
		float excTime=(float)(endTime-startTime)/1000;
		System.out.println("快速排序耗时："+excTime);		
	}

}
