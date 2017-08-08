package huangyaling;

import java.util.Arrays;

/**
 * 堆排序
 * @author huangyaling
 *
 */

public class HeapSort {	
	protected int heapsize;
	//父节点
	protected int parent(int i) {
		return (i-1)/2;
	}
	//左孩子
	protected int left(int i) {
		return 2*i+1;
	}
	//右孩子
	protected int right(int i) {
		return 2*i+2;
	}
	
	public void heapSort(int[] arr){
		buildMaxHeap(arr);
		int step = 1;
		for(int i = arr.length-1;i>0;i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapsize--;
			System.out.println("Step:"+(step++)+Arrays.toString(arr));
			maxHeapify(arr,0);
		}
		
	}
	/**
	 * 构建大顶堆
	 */
	public void buildMaxHeap(int[] arr) {
		this.heapsize = arr.length;
		for(int i = parent(arr.length-1);i>=0;i--) {
			maxHeapify(arr,i);
		}
	}
	/**
	 * 保持最大堆特性
	 * @param arr
	 */
	protected void maxHeapify(int[] arr,int i) {
		int l = left(i);
		int r = right(i);
		int largest = i;
		if(l<=arr.length-1 && arr[l]>arr[i]) {
			largest = l;
		}
		if(r<=arr.length-1 && arr[r]>arr[largest]) {
			largest = r;
		}
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			this.maxHeapify(arr, largest);
		}
	}
	
	public void TimeCount(int[] arr){
		long startTime=System.currentTimeMillis();
		heapSort(arr);
		long endTime=System.currentTimeMillis();
		float excTime=(float)(endTime-startTime)/1000;
		System.out.println("堆排序耗时："+excTime);		
	}
	
	
}
