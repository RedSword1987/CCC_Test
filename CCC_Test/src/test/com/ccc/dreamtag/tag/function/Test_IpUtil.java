package test.com.ccc.dreamtag.tag.function;

import com.ccc.dreamtag.tag.function.IpUtil;

/**
 * @author RedSword
 * @date 2014年3月7日 下午4:44:30
 */

public class Test_IpUtil {
	public static void main(String[] args) {
		System.out.println("String转换为long:" + IpUtil.convertIpaddr2Long("10.1.1.1"));
		System.out.println("Long转换为String:" + IpUtil.convertLong2Ipaddr(Long.valueOf(167837953)));
		System.out.println("Long转换为String(long的表现格式为String):" + IpUtil.convertLong2Ipaddr("167837953"));

	}
}
