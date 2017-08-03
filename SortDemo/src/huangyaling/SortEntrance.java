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
				bubble.TimeCount(test);
				break;
			case QuickSort:
				System.out.println("��������Ĺ��̣�");
				break;
			case DirectSelectSort:
				System.out.println("ֱ��ѡ��Ĺ��̣�");
				break;
			case HeapSort:
				System.out.println("������Ĺ��̣�");
				break;
			case DirectInsertSort:
				System.out.println("ֱ�Ӳ�������Ĺ��̣�");
				break;
			case HillSort:
				System.out.println("ϣ������Ĺ��̣�");
				break;
			case MergeSort:
				System.out.println("�ϲ�����Ĺ��̣�");
				break;
			default:			
				break;
			
			}
		}
		
	}

}
