package test.com.ccc.dreamfile;

import com.ccc.dreamfile.txt.FileTxtTimerNew;

/**
 * @author RedSword
 * @date 2014年3月10日 下午2:55:07
 */

public class Test_FileTxtTimerNew {
	public static void main(String[] args) {
		System.out.println("生成文件，并写入txt内容(达到多少行，或者达到多少秒就重新生成文件):");
		String[] arr = { "1", "2" };
		FileTxtTimerNew filetxttimernew = new FileTxtTimerNew("d://23.txt", false, 60, 5);
		filetxttimernew.writeLine("12");
		filetxttimernew.writeLine("12");
		filetxttimernew.writeLine("12");
		filetxttimernew.writeLine("12");
		filetxttimernew.writeLine(arr);
		filetxttimernew.close();
	}
}
