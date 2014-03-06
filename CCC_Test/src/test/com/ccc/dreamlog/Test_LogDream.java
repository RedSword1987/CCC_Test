package test.com.ccc.dreamlog;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.ccc.dreamlog.CreateLog4jFile;
import com.ccc.dreamlog.LogDream;

/**
 * @author RedSword
 * @date 2014年3月5日 下午10:40:59
 */

public class Test_LogDream {
	static final String logName = "module";

	public static void logName() {
		List<String> logNames = new ArrayList<String>() {
			{
				add(logName);
			}
		};
		// 创建log4j文件
		CreateLog4jFile.createLog4jFile(new File("D:\\git\\ccc_source\\CCC_Test\\CCC_Test\\CCC_Test\\src\\log4j.properties"), new File("D:\\logs"), logNames);

	}

	public static void main(String[] args) {
		// 创建log4j文件
		// logName();

		// 默认 CCC为logname
		LogDream.info("info信息");
		LogDream.debug("debug信息");
		LogDream.error("error信息");
		LogDream.error("error信息-带Exception", new Throwable());

		// 有具体的logname的接口
		LogDream.info("info信息", logName);
		LogDream.debug("debug信息", logName);
		LogDream.error("error信息", logName);
		LogDream.error("error信息-带Exception", logName, new Throwable());

	}
}
