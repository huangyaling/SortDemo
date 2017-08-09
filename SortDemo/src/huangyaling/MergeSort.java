package huangyaling;

import java.util.Arrays;

/**
 * �ϲ�����
 * @author huangyaling
 *
 */

public class MergeSort {
	public void mergeSort(int[] arr,int left,int right){
		if(left>=right){
			return;
		}
		int mid = (left+right)/2;
		//��·�鲢��������������mergeSort,��·�鲢��������д���mergeSort�Ϳ�����
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
		//����鲢
		while(left<=mid && r1<=right){
			if(arr[left]<=arr[r1]){
				temp[tIndex++] = arr[left++];
			}else{
				temp[tIndex++] = arr[r1++];
			}
		}
		//�����ʣ��Ĺ鲢
		while(left <= mid){
			temp[tIndex++] = arr[left++];
		}
		//���ұ�ʣ��Ĺ鲢
		while(r1<=left){
			temp[tIndex++] = arr[r1++];
		}
		//����ʱ���鿽����ԭ����
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
		System.out.println("�ϲ������ʱ��"+excTime);		
	}

}
