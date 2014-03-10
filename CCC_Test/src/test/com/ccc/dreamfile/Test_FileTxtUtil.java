package test.com.ccc.dreamfile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.ccc.dreamfile.txt.FileTxtUtil;

/**
 * @author RedSword
 * @date 2014年3月8日 下午11:02:44
 */

public class Test_FileTxtUtil {
	public static void main(String[] args) {
		List<String> listS = new ArrayList<String>() {
			{
				add("1,2,3");
				add("2,3,1");
			}
		};

		int count = FileTxtUtil.writeTxtFile(listS, new File("D:\\11.txt"), false);
		System.out.println("写入txt文档:" + count);
		System.out.println("将txt格式文本转换为List<String >格式 ");
		List<String> li_s = FileTxtUtil.convertListString(new File("D:\\11.txt"));
		for (String string : li_s) {
			System.out.println(string);
		}
		System.out.println("将txt格式文本转换为List<String[]>格式（每行以后面的字符分隔）");
		List<String[]> li = FileTxtUtil.convertListListString(new File("D:\\11.txt"), ",");
		for (String[] string : li) {
			for (String string2 : string) {
				System.out.println(string2);
			}
			System.out.println();
		}
	}
}
