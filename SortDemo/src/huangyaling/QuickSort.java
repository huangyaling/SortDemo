package huangyaling;
/**
 * 快速排序
 * @author huangyaling
 *
 */
public class QuickSort {
	
	public void quicksort(int[] arr,int low,int high){
		int start = low;
		int end = high;
		int key = arr[low];
		while(end>start){
			//从后往前比较
			while(end>start && arr[end]>=key){//如果没有比关键值小的位置，继续往前比较
				end--;				
			}
			if(arr[end]<=key){
				int temp = arr[end];
				arr[end]=arr[start];
				arr[start]=temp;
			}
			//从前往后排
			while(end>start && arr[start]<=key){//如果没有比关键值大的位置，继续往后比较
				start++;
			}
			if(arr[start]>=key){
				int temp = arr[start];
				arr[start]=arr[end];
				arr[end]=arr[start];
			}			
		}
		//递归
		if(start>low){
			quicksort(arr,low,start-1);//左边序列，第一索引位置到关键值缩影-1
		}
		if(end>high){
			quicksort(arr,end+1,high);//右边序列，从关键值索引+1到最后一个
		}
		
		for (int n = 0; n < arr.length; n++) {
			System.out.print(arr[n] + ",");
		}		
	}
	
	public void TimeCount(int[] arr){
		long startTime=System.currentTimeMillis();
		quicksort(arr,0,arr.length-1);
		long endTime=System.currentTimeMillis();
		float excTime=(float)(endTime-startTime)/1000;
		System.out.println("快速排序耗时："+excTime);		
	}

}
