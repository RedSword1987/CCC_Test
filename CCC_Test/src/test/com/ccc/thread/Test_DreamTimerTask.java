package test.com.ccc.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

import com.ccc.thread.DreamTimerTask;

/**
 * DreamTimerTask 只是定义定时器的一个规范<br/>
 * 应用场景一般
 * 
 * @author RedSword
 * @date 2014年3月5日 下午10:01:33
 */

public class Test_DreamTimerTask {
	public static void main(String[] args) {
		Map<String, Object> paramMap = new HashMap<String, Object>() {
			{
				put("key", "运行的参数");
			}
		};

		DreamTimerTaskImpl dreamtimertaskimpl = new DreamTimerTaskImpl(paramMap);
		Timer timer = new Timer();
		timer.schedule(dreamtimertaskimpl, 1000, 10000);
	}
}

class DreamTimerTaskImpl extends DreamTimerTask {

	public DreamTimerTaskImpl(Map<String, Object> arg0) {
		super(arg0);
	}

	@Override
	public void run() {
		System.out.println(this.paramMap.get("key"));
	}
}
