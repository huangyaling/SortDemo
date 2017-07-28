package huangyaling;
import java.util.Scanner;
/**
 * 常用排序算法比较
 * @author huangyaling
 *
 */

public class SortEntrance {
	
	private final int BubbleSort = 1;
	private final int QuickSort = 2;
	private final int DirectSelectSort = 3;
	private final int HeapSort = 4;
	private final int DirectInsertSort = 5;
	private final int HillSort = 6;
	private final int MergeSort = 7;
	
	private String input;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSource.initDate();
		SortEntrance sortEntrance = new SortEntrance();
		sortEntrance.userInput();
	}
	
	private void userInput(){
		System.out.println("请选择排序方式，以空格隔开:\n 1.冒泡排序 \n 2.快速排序\n 3.直接选择排序\n 4.堆排序\n 5.直接插入排序\n 6.希尔排序 \n 7.合并排序");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();
		String[] strs = input.split(" ");
		for(String str:strs){
			int userSelect = -1;
			try{
				userSelect = Integer.valueOf(str);
			}catch(Exception e){
				System.out.println("Error Input!");
				System.exit(0);
				e.printStackTrace();
			}
			
			switch(userSelect){
			case BubbleSort:
				break;
			case QuickSort:
				break;
			case DirectSelectSort:
				break;
			case HeapSort:
				break;
			case DirectInsertSort:
				break;
			case HillSort:
				break;
			case MergeSort:
				break;
			default:			
				break;
			
			}
		}
		
	}

}
