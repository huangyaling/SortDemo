package huangyaling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ��ʼ������
 * @author huangyaling
 *
 */

public class DataSource {
	
	//public static Int[] list = new ArrayList();
	
	public static int[] initDate(){
		System.out.println("������Ҫ��������У��Կո������");
		List<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int str = scanner.nextInt();
			if(str==-1){
				break;			
			}
			list.add(str);
		}
		
		int[] arr = new int[list.size()];
		for(int i = 0;i<arr.length;i++){
			arr[i] = list.get(i);
		}		
		return arr;		
	}
}
