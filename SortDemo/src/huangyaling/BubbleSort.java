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
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				for (int n = 0; n < arr.length; n++) {
					System.out.print(arr[n] + ",");
				}
				System.out.println();
			}		
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
