package huangyaling;

import java.util.Arrays;

/**
 * Ï£¶ûÅÅÐò
 * @author huangyaling
 *
 */

public class HillSort {
	public void hillSort(int[] arr){
		int j = 0;
		int temp = 0;
		int step = 1;
		for(int increment = arr.length/2;increment > 0;increment/=2){
			for(int i = increment;i< arr.length;i++){
				temp = arr[i];
				for(j = i-increment;j>=0;j-=increment){
					if(temp<arr[j]){
						arr[j+increment]=arr[j];
					}else{
						break;
					}
				}
				arr[j+increment]=temp;
			}
			System.out.println("Step:"+(step++)+Arrays.toString(arr));	
		}
		System.out.println("OutPut:"+Arrays.toString(arr));	
	}
	
	public void TimeCount(int[] arr){
		long startTime=System.currentTimeMillis();
		hillSort(arr);
		long endTime=System.currentTimeMillis();
		float excTime=(float)(endTime-startTime)/1000;
		System.out.println("Ï£¶ûÅÅÐòºÄÊ±£º"+excTime);		
	}

}
