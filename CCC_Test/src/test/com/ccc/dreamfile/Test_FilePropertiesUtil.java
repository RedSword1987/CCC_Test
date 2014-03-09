package test.com.ccc.dreamfile;

import java.io.File;
import java.util.HashMap;
import java.util.Map.Entry;

import com.ccc.dreamfile.properties.FilePropertiesUtil;

/**
 * @author RedSword
 * @date 2014年3月8日 下午11:05:55
 */

public class Test_FilePropertiesUtil {
	public static void main(String[] args) {
		// 读取properties
		HashMap<String, String> map = FilePropertiesUtil.readProperties(new File("E:/1.properties"));
		for (Entry<String, String> en : map.entrySet()) {
			System.out.println(en.getKey() + "-" + en.getValue());
		}
		// 创建properties文件
		FilePropertiesUtil.createProperties(map, new File("E:/2.properties"), false);
	}
}
