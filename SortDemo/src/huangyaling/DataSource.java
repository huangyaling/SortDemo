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
	
	public static List list = new ArrayList();
	
	public static List<ArrayList> initDate(){
		System.out.println("������Ҫ��������У��Կո������");
		Scanner scanner = new Scanner(System.in);
		String[] datas = scanner.nextLine().split(" ");
		for(String data:datas){
			try{
				int i = Integer.valueOf(data);
			}catch(Exception e){
				System.out.println("Error Input!!!");
			}			
			list.add(data);	
		}
		System.out.println(list);
		return list;		
	}
}
