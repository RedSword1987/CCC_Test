package test.com.ccc.dreamfile;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;

import com.ccc.dreamfile.xml.FileXmlUtil;

/**
 * @author RedSword
 * @date 2014年3月8日 下午11:05:35
 */

public class Test_FileXmlUtil {
	public static void main(String[] args) {

		Document doc = FileXmlUtil.getDocument(new File("E:\\test\\DataBase.xml"));
		System.out.println("通过文件获取Document文档:" + doc.getStringValue());

		boolean issuccess = FileXmlUtil.createXml(doc, "E:\\test\\DataBase1.xml");
		System.out.println("创建Document文件:" + issuccess);

		String string = FileXmlUtil.getNodeValue(doc, "database-sources/database-source/constantMap");
		System.out.println("获取Document文档节点的值(路径为classpath的路径):" + string);
		string = FileXmlUtil.getNodeValue("DataBase.xml", "database-sources/database-source/constantMap");
		System.out.println("获取Document文档节点的值:" + string);
		List<Map<String, String>> li = FileXmlUtil.getXmlNodeList(doc, "database-sources/database-source/driverUrl");
		for (Map<String, String> map : li) {
			System.out.println(map.get("NODENAME"));
		}
	}
}
