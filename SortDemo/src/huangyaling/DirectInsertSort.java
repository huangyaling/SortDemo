package huangyaling;

import java.util.Arrays;

/**
 * ֱ�Ӳ�������
 * ƽ��O(n^2),���O(n),�O(n^2);�ռ临�Ӷ�O(1);�ȶ�;��
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
		System.out.println("ֱ�Ӳ��������ʱ��"+excTime);		
	}	
}
