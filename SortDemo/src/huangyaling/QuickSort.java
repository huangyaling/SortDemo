package huangyaling;
/**
 * ��������
 * @author huangyaling
 *
 */
public class QuickSort {
	
	public void quicksort(int[] arr,int low,int high){
		int start = low;
		int end = high;
		int key = arr[low];
		while(end>start){
			//�Ӻ���ǰ�Ƚ�
			while(end>start && arr[end]>=key){//���û�бȹؼ�ֵС��λ�ã�������ǰ�Ƚ�
				end--;				
			}
			if(arr[end]<=key){
				int temp = arr[end];
				arr[end]=arr[start];
				arr[start]=temp;
			}
			//��ǰ������
			while(end>start && arr[start]<=key){//���û�бȹؼ�ֵ���λ�ã���������Ƚ�
				start++;
			}
			if(arr[start]>=key){
				int temp = arr[start];
				arr[start]=arr[end];
				arr[end]=arr[start];
			}			
		}
		//�ݹ�
		if(start>low){
			quicksort(arr,low,start-1);//������У���һ����λ�õ��ؼ�ֵ��Ӱ-1
		}
		if(end>high){
			quicksort(arr,end+1,high);//�ұ����У��ӹؼ�ֵ����+1�����һ��
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
		System.out.println("���������ʱ��"+excTime);		
	}

}
