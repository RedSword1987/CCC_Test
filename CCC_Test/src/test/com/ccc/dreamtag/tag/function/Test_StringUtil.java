package test.com.ccc.dreamtag.tag.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ccc.dreamtag.tag.function.StringUtil;

/**
 * @author RedSword
 * @date 2014年3月7日 下午4:44:50
 */

public class Test_StringUtil {
	public static void main(String[] args) {
		System.out.println("判断某个字符串是否包含其他的字符串:" + StringUtil.contains("1234567890A", "A"));
		System.out.println("判断某个字符串是否包含其他的字符串(忽略大小写):" + StringUtil.containsIgnoreCase("1234567890A", "a"));
		System.out.println("字符串转小写:" + StringUtil.toLowerCase("abcdE"));
		System.out.println("字符串转大写:" + StringUtil.toUpperCase("abcdE"));
		System.out.println("去除前后的空格:" + StringUtil.trim(" abc "));
		System.out.println("判断字符串是否以后面的字符串结尾:" + StringUtil.endsWith("121234", "1234"));
		System.out.println("判断字符串是否以后面的字符串结尾:" + StringUtil.startsWith("123412", "1234"));
		System.out.println("判断后一字符串在前一字符转出现的位置:" + StringUtil.indexOf("121234", "1234"));
		System.out.println("判断某个字符串是否为空（null支付也是空）:" + StringUtil.isEmpty("null "));
		System.out.println("取某个字符串长度:" + StringUtil.length("abc"));
		System.out.println("将某个字符串中的某部分字符转换为其他字符:" + StringUtil.replace("ABC", "C", "c"));
		Object[][] obj = { { "1", "2" }, { "3", "4", "5" } };
		System.out.println("将2维数组转为为String:" + StringUtil.convertObjectArrayTostring(obj));
		Object[] obj_1 = { "1", "2" };
		System.out.println("将数组转为为String（或多参数）:" + StringUtil.convertObjectsTostring(obj_1));
		String[] obj_2 = { "1", "2" };
		System.out.println("将数组转为为String（增加分隔符号）:" + StringUtil.join(obj_2, ","));
		List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("field", "A");
					}
				});
				add(new HashMap<String, Object>() {
					{
						put("field", "B");
					}
				});
				add(new HashMap<String, Object>() {
					{
						put("field", "C");
					}
				});
			}
		};
		System.out.println("合并List<Map<String, Object>> 某个字段 为String:" + StringUtil.joinListMap(listMap, "field", ","));

		List<String> listString = new ArrayList<String>() {
			{
				add("A");
				add("B");
				add("C");
			}
		};
		System.out.println("合并List<String> 为String:" + StringUtil.joinListString(listString, ","));

		System.out.println("从总的字符串中截取一段（开始字符到结束字符）:" + StringUtil.substring("ABC", 0, 1));
		System.out.println("获取字符串中某个字符串后面的字符串:" + StringUtil.substringAfter("AB", "A"));
		System.out.println("获取字符串中某个字符串前面的字符串:" + StringUtil.substringBefore("AB", "B"));
		System.out.println("分隔字符串为数组");
		String[] arr = StringUtil.split("A,B,C", ",");
		for (String string : arr) {
			System.out.println(string);
		}
		System.out.println("将字符串按照size大小，切割为list数组");
		List<String> list = StringUtil.cutOff("ABCD", 2);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
