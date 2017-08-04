package huangyaling;

/**
 * √∞≈›≈≈–Ú
 * 
 * @author huangyaling
 *
 */

public class BubbleSort {

	public void bubble(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}			
		}
		for (int n = 0; n < arr.length; n++) {
			System.out.print(arr[n] + ",");
		}
	}
	
	public void TimeCount(int[] arr){
		long startTime=System.currentTimeMillis();
		bubble(arr);
		long endTime=System.currentTimeMillis();
		float excTime=(float)(endTime-startTime)/1000;
		System.out.println("√∞≈›≈≈–Ú∫ƒ ±£∫"+excTime);		
	}
}
