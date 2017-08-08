package huangyaling;
/**
 * 直接选择排序
 * @author huangyaling
 *
 */

public class DirectSelectSort {
	
	public void directSelect(int[] arr){
		int small;
		int temp;
		for(int i = 0;i<arr.length;i++){
			small = i;
			for(int j = i+1;j<arr.length;j++){
				if(arr[small]>arr[j]){
					small=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[small];
			arr[small]=temp;			
		}
		
		for (int n = 0; n < arr.length; n++) {
			System.out.print(arr[n] + ",");
		}	
	}
	
	public void TimeCount(int[] arr){
		long startTime=System.currentTimeMillis();
		directSelect(arr);
		long endTime=System.currentTimeMillis();
		float excTime=(float)(endTime-startTime)/1000;
		System.out.println("直接选择排序耗时："+excTime);		
	}

}
