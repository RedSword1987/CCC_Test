package test.com.ccc.dreamfile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.ccc.dreamfile.FileUtil;

/**
 * @author RedSword
 * @date 2014年3月8日 下午11:05:07
 */

public class Test_FileUtil {
	public static void main(String[] args) {
		System.out.println("拷贝一个文件到一个文件夹:" + FileUtil.copyFileToFold("E:\\source\\asd.txt", "E:\\target"));
		System.out.println("拷贝一个文件夹到另一个文件夹:" + FileUtil.copyFoleToFold("E:\\source", "E:\\target"));
		System.out.println("拷贝一个文件夹到另一个文件夹:" + FileUtil.deleteFile(new File("E:\\target\\1.txt")));

		List<String> list = FileUtil.getAllFileNames("E:\\target");
		System.out.println("获取一个文件夹下的所有的文件名(只取文件（忽略文件夹）):");
		for (String string : list) {
			System.out.println(string);
		}
		List<String> list2 = new ArrayList<String>();
		FileUtil.getAllFileNames("E:\\target", list2);
		System.out.println("获取一个文件夹下的所有的文件名(只取文件（忽略文件夹）)（拼接到list下面）:");
		for (String string : list2) {
			System.out.println(string);
		}

		List<String> list3 = new ArrayList<String>();
		FileUtil.getAllFileNamesDept("E:\\target", list3);
		System.out.println("获取一个文件夹下的所有的文件名（递归）(只取文件（忽略文件夹）):");
		for (String string : list3) {
			System.out.println(string);
		}

		List<String> list5 = FileUtil.getAllFilePathsDept("E:\\target");
		System.out.println("获取一个文件夹下的所有的文件夹路径（递归）:");
		for (String string : list5) {
			System.out.println(string);
		}

		List<String> list7 = new ArrayList<String>();
		FileUtil.getAllFilePathsDept("E:\\target", list7);
		System.out.println("获取一个文件夹下的所有的文件夹路径（递归）:");
		for (String string : list7) {
			System.out.println(string);
		}

		File file = FileUtil.getFileFromClass("DataBase.xml");
		System.out.println("获取classpath寻找文件:" + file.getAbsolutePath());
		File file1 = FileUtil.getFileFromPath("E:\\target\\1.txt");
		System.out.println("通过路径寻找文件:" + file1.getAbsolutePath());
		// 此处的例子没有跑在 server下
		File file2 = FileUtil.getFileFromWebRoot("struts.xml");
		System.out.println("通过server下的路径获取文件:" + file2.getAbsolutePath());

	}
}
