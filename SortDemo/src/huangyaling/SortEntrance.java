package huangyaling;
import java.util.Scanner;
/**
 * ���������㷨�Ƚ�
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
		System.out.println("��ѡ������ʽ���Կո����:\n 1.ð������ \n 2.��������\n 3.ֱ��ѡ������\n 4.������\n 5.ֱ�Ӳ�������\n 6.ϣ������ \n 7.�ϲ�����");
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
				System.out.println("ð������Ĺ��̣�");
				BubbleSort bubble = new BubbleSort();
				bubble.sortResult(test);
				break;
			case QuickSort:
				System.out.println("��������Ĺ��̣�");
				QuickSort quick = new QuickSort();
				quick.sortResult(test);
				break;
			case DirectSelectSort:
				System.out.println("ֱ��ѡ��Ĺ��̣�");
				DirectSelectSort directSelect = new DirectSelectSort();
				directSelect.sortResult(test);
				break;
			case HeapSort:
				System.out.println("������Ĺ��̣�");
				HeapSort heapSort = new HeapSort();
				heapSort.sortResult(test);
				break;
			case DirectInsertSort:
				System.out.println("ֱ�Ӳ�������Ĺ��̣�");
				DirectInsertSort directInsert = new DirectInsertSort();
				directInsert.sortResult(test);
				break;
			case HillSort:
				System.out.println("ϣ������Ĺ��̣�");
				HillSort hillSort = new HillSort();
				hillSort.sortResult(test);
				break;
			case MergeSort:
				System.out.println("�ϲ�����Ĺ��̣�");
				MergeSort mergeSort = new MergeSort();
				mergeSort.sortResult(test);
				break;
			default:			
				break;
			
			}
		}
		
	}

}
