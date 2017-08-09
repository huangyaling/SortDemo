package huangyaling;

import java.util.Arrays;

/**
 * 直接插入排序
 * 平均O(n^2),最好O(n),最坏O(n^2);空间复杂度O(1);稳定;简单
 * @author huangyaling
 *
 */

public class DirectInsertSort {
	public void directInsertSort(int[] arr){
		for(int i = 0;i<arr.length;i++){
			for(int j = i;j>0;j--){
				if(arr[j]<arr[j-1]){
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;					
				}
			}
		}
		System.out.println("OutPut:"+Arrays.toString(arr));
	}
	
	public void TimeCount(int[] arr){
		long startTime=System.currentTimeMillis();
		directInsertSort(arr);
		long endTime=System.currentTimeMillis();
		float excTime=(float)(endTime-startTime)/1000;
		System.out.println("直接插入排序耗时："+excTime);		
	}	
}
