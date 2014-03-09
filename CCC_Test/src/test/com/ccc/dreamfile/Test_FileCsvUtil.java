package test.com.ccc.dreamfile;

import com.ccc.dreamfile.csv.FileCsvUtil;

/**
 * @author RedSword
 * @date 2014年3月8日 下午11:07:46
 */

public class Test_FileCsvUtil {
	public static void main(String[] args) {
		// 将csv文件转换为 List<List<String>> 格式
		FileCsvUtil.convertListListString("");
		// 增加处理函数接口，边杜读取文件，边处理行
		FileCsvUtil.convertListListString("", null);
	}
}
