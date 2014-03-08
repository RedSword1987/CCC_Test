package test.com.ccc.dreamcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.ccc.dreamcollection.CollectionUtil;

/**
 * @author RedSword
 * @date 2014年3月4日 下午11:55:48
 */

public class Test_CollectionUtil {

	public static void main(String[] args) {
		List<String> sourceList = new ArrayList<String>() {
			{
				add("1");
				add("2");
				add("3");
				add("4");
				add("5");
				add("6");
				add("7");
			}
		};
		System.out.println("对某个List以size大小进行分组");
		List<List> result = CollectionUtil.cutOffList(sourceList, 2);
		for (List listChild : result) {
			StringBuilder sb = new StringBuilder();
			for (Object object : listChild) {
				sb.append(String.valueOf(object)).append(",");
			}
			System.out.println(sb);
		}

		Map<String, List> sourceMap = new HashMap<String, List>() {
			{
				put("field3", new ArrayList<String>() {
					{
						add("1");
						add("1");
						add("1");
					}
				});
				put("field1", new ArrayList<String>() {
					{
						add("1");
					}
				});
				put("field2", new ArrayList<String>() {
					{
						add("1");
						add("1");
					}
				});
				put("field5", new ArrayList<String>() {
					{
						add("1");
						add("1");
						add("1");
						add("1");
						add("1");
					}
				});
			}
		};
		System.out.println("对Map<String,List> 按照list大小重新排序 ");
		Map<String, List> targetMap = CollectionUtil.sortMapByValueSize(sourceMap, "asc");
		for (Entry<String, List> en : targetMap.entrySet()) {
			System.out.println("key：" + en.getKey());
		}
	}
}
