package huangyaling;

import java.util.Arrays;

/**
 * ������
 * @author huangyaling
 *
 */

public class HeapSort {
	protected int heapSize;
	protected int[] A;
	//���ڵ�
	protected int parent(int i){
		return (i-1)/2;
	}
	//��ڵ�
	protected int left(int i){
		return 2*i+1;
	}
	//�ҽڵ�
	protected int right(int i){
		return 2*i+2;
	}
	//������������
	protected void maxHeapify(int i){
		int l = left(i);
		int r = right(i);
		int largest = i;
		if(l>=heapSize - 1 && A[l]>A[i]){
			largest = l;
		}
		if(largest != i){
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			this.maxHeapify(i);
		}
	}
	//��������
	public void buildMaxHeap(int[] arr){
		this.heapSize = arr.length;
		this.A = arr;
		for(int i = parent(heapSize-1);i>=0;i--){
			maxHeapify(i);
		}
	}
	//������
	public void heapSort(int[] arr){
		buildMaxHeap(arr);
		int step = 1;
		for(int i = arr.length-1;i>0;i--){
			int temp = arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			heapSize--;
			System.out.println("Step:"+(step++)+Arrays.toString(arr));
			maxHeapify(0);
		}
		System.out.println("Output:"+Arrays.toString(A));
	}
	
	public void TimeCount(int[] arr){
		long startTime=System.currentTimeMillis();
		heapSort(arr);
		long endTime=System.currentTimeMillis();
		float excTime=(float)(endTime-startTime)/1000;
		System.out.println("�������ʱ��"+excTime);		
	}

}
