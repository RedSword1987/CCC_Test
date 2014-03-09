package test.com.ccc.dreamfile;

import com.ccc.dreamfile.compress.FileRarUtil;

/**
 * @author RedSword
 * @date 2014年3月8日 下午11:11:06
 */

public class Test_FileRarUtil {
	public static void main(String[] args) {
		System.out.println("解压一个rar文件（不删除原文件）");
		FileRarUtil.unRar("D:\\Program Files\\WinRAR\\WinRAR.exe", "E:\\测试压缩\\1.rar", "E:\\测试压缩\\压缩到\\rar");
		System.out.println("解压一个rar文件（删除原文件）");
		FileRarUtil.unRarDept("D:\\Program Files\\WinRAR\\WinRAR.exe", "E:\\测试压缩\\1.rar", "E:\\测试压缩\\压缩到\\rar");
		System.out.println("解压一个目录下的所有的rar文件(并删除原始文件)");
		FileRarUtil.unRarPathDept("D:\\Program Files\\WinRAR\\WinRAR.exe", "E:\\测试压缩");
	}
}
