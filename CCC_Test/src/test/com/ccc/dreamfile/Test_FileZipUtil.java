package test.com.ccc.dreamfile;

import java.io.File;

import com.ccc.dreamfile.compress.FileZipUtil;

/**
 * @author RedSword
 * @date 2014年3月8日 下午11:11:23
 */

public class Test_FileZipUtil {
	public static void main(String[] args) {

		boolean issuccess = FileZipUtil.zip(new File("E:\\测试压缩\\1.txt"), new File("E:\\测试压缩\\1.zip"));
		System.out.println("压缩一个文件到另外一个压缩文件:" + issuccess);
		System.out.println("解压一个zip包到某个文件夹:");
		FileZipUtil.unZip("E:\\测试压缩\\1.zip", "E:\\测试压缩\\压缩到");
		System.out.println("解压一个zip包到某个文件夹(递归解压):");
		FileZipUtil.unZipDept("E:\\测试压缩\\1.zip", "E:\\测试压缩\\压缩到");
		System.out.println("解压一个文件夹内部的所有的压缩文件");
		FileZipUtil.unZipPathDept("E:\\测试压缩");

	}
}
