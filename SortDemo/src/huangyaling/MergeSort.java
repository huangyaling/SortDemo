package huangyaling;

import java.util.Arrays;

/**
 * 合并排序
 * @author huangyaling
 *
 */

public class MergeSort {
	public void mergeSort(int[] arr,int left,int right){
		if(left>=right){
			return;
		}
		int mid = (left+right)/2;
		//二路归并排序理由有两个mergeSort,多路归并排序里面写多个mergeSort就可以了
		mergeSort(arr,left,mid);
		mergeSort(arr,mid+1,right);
		merge(arr,left,mid,right);
		System.out.println("Output"+Arrays.toString(arr));	
	}
	
	private static void merge(int[] arr,int left,int mid,int right){
		int[] temp = new int[arr.length];
		int r1 = mid+1;
		int tIndex = left;
		int cIndex = left;
		int step = 1;
		//逐个归并
		while(left<=mid && r1<=right){
			if(arr[left]<=arr[r1]){
				temp[tIndex++] = arr[left++];
			}else{
				temp[tIndex++] = arr[r1++];
			}
		}
		//将左边剩余的归并
		while(left <= mid){
			temp[tIndex++] = arr[left++];
		}
		//将右边剩余的归并
		while(r1<=left){
			temp[tIndex++] = arr[r1++];
		}
		//从临时数组拷贝到原数组
		/*System.out.print("Step:"+(step++));	
		while(cIndex<=right){
			arr[cIndex]=temp[cIndex];
			System.out.print(arr[cIndex]+",");
			cIndex++;
		}
		System.out.println();*/
		//System.out.println("Output"+Arrays.toString(arr));	
	}
	
	public void sortResult(int[] arr){
		long startTime=System.currentTimeMillis();
		mergeSort(arr,0,arr.length-1);
		long endTime=System.currentTimeMillis();
		float excTime=(float)(endTime-startTime)/1000;
		System.out.println("合并排序耗时："+excTime);		
	}

}
