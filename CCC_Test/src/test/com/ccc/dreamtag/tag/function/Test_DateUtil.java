package test.com.ccc.dreamtag.tag.function;

import java.util.Date;
import java.util.List;

import com.ccc.dreamtag.tag.function.DateUtil;

/**
 * @author RedSword
 * @date 2014年3月7日 下午4:43:53
 */

public class Test_DateUtil {

	public static void main(String[] args) {
		System.out.println("当前时间的字符串（默认格式）：" + DateUtil.getTimeString_Now());
		System.out.println("当前时间的字符串（传参格式）：" + DateUtil.getTimeString_Now("yyyy-MM-dd HH:mm:ss"));
		System.out.println("当前时间的long类型：" + DateUtil.getTimeLong_Now());
		System.out.println("今天最早时间的long类型：" + DateUtil.getTimeLong_TodayBegin());
		System.out.println("今天最早时间的long类型：" + DateUtil.getTimeLong_TodayEnd());

		System.out.println("转换函数（Date对象转换为long）：" + DateUtil.convertDateToLong(new Date()));
		System.out.println("转换函数（long转String）：" + DateUtil.convertLongToString(DateUtil.getTimeLong_Now(), "yyyy-MM-dd HH:mm:ss"));
		System.out.println("转换函数（String转long）:" + DateUtil.convertStringToLong(DateUtil.getTimeString_Now(), "yyyy-MM-dd HH:mm:ss"));
		System.out.println("获取今天是周几(1,2,3,4,5,6,7):" + DateUtil.getDayOfWeek(DateUtil.getTimeLong_Now()));
		System.out.println("获取某时间偏移n秒后的时间:" + DateUtil.getTimeOffSet(DateUtil.getTimeLong_Now(), -24 * 60 * 60, "yyyy-MM-dd HH:mm:ss"));

		List<String> list_day = DateUtil.getDayFormetBetween(DateUtil.getTimeLong_Now() - 10 * 24 * 60 * 60, DateUtil.getTimeLong_Now(), "yyyy-MM-dd HH:mm:ss");
		System.out.println("获取两个时间段内的间隔");
		for (String string : list_day) {
			System.out.println(string);
		}
	}
}
