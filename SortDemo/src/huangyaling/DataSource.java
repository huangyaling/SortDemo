package huangyaling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 初始化数据
 * @author huangyaling
 *
 */

public class DataSource {
	
	public static List list = new ArrayList();
	
	public static List<ArrayList> initDate(){
		System.out.println("输入需要排序的序列，以空格隔开：");
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
