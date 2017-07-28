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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSource.initDate();
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
