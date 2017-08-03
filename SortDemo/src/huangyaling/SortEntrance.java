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
	private static int[] test;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test = DataSource.initDate();
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
				System.out.println("冒泡排序的过程：");
				BubbleSort bubble = new BubbleSort();
				bubble.TimeCount(test);
				break;
			case QuickSort:
				System.out.println("快速排序的过程：");
				break;
			case DirectSelectSort:
				System.out.println("直接选择的过程：");
				break;
			case HeapSort:
				System.out.println("堆排序的过程：");
				break;
			case DirectInsertSort:
				System.out.println("直接插入排序的过程：");
				break;
			case HillSort:
				System.out.println("希尔排序的过程：");
				break;
			case MergeSort:
				System.out.println("合并排序的过程：");
				break;
			default:			
				break;
			
			}
		}
		
	}

}
