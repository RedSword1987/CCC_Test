package test.com.ccc.dreamfile;

import com.ccc.dreamfile.txt.FileTxtNew;

/**
 * @author RedSword
 * @date 2014年3月10日 下午2:54:44
 */

public class Test_FileTxtNew {
	public static void main(String[] args) {
		System.out.println("生成文件，并写入txt内容:");
		String[] arr = { "1", "2" };
		FileTxtNew filetxtnew = new FileTxtNew("d://23.txt", false);
		filetxtnew.writeLine("12");
		filetxtnew.writeLine(arr);
		filetxtnew.close();
	}
}
