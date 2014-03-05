package test.com.ccc.thread;

import java.util.HashMap;
import java.util.Map;

import com.ccc.thread.DreamRunner;

/**
 * DreamRunner 只是定义接口的一个规范<br/>
 * 应用场景一般
 * 
 * @author RedSword
 * @date 2014年3月5日 下午10:00:12
 */

public class Test_DreamRunner {
	public static void main(String[] args) {
		Map<String, Object> paramMap = new HashMap<String, Object>() {
			{
				put("key", "运行的参数");
			}
		};
		DreamRunnerImpl dreamrunnerimpl = new DreamRunnerImpl(paramMap);
		Thread th = new Thread(dreamrunnerimpl);
		th.start();

	}
}

class DreamRunnerImpl extends DreamRunner {

	public DreamRunnerImpl(Map<String, Object> arg0) {
		super(arg0);
	}

	@Override
	public void run() {
		System.out.println(this.paramMap.get("key"));
	}
}
