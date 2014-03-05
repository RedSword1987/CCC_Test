package test.com.ccc.dreammail;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ccc.dreammail.MailBean;
import com.ccc.dreammail.MailDream;

/**
 * 注意点： <br/>
 * 1.lib下面有个mail.jar，如果程序跑在servlet容器中（tomcat）之类的，可以不加上那个包，如果是jar方式运行，就得得上。<br/>
 * 2. 有些邮箱默认没有打开程序发送邮件的接口，还得自己去开一下，各种邮箱怎么开，自己百度就可以找到 <br/>
 * 
 * @author RedSword
 * @date 2014年3月5日 下午8:58:12
 */

public class Test_MailDream {
	// 设置邮件附件
	static Map<String, File> mapFile = new HashMap<String, File>() {
		{
			put("文件1", new File("D:\\测试文件.txt"));
		}
	};
	// 设置收件人
	static List<String> receiveList = new ArrayList<String>() {
		{
			add("×××@qq.com");
		}
	};

	public static void main(String[] args) {
		MailBean mailbean = new MailBean();
		// 设置邮件参数
		{
			// 设置邮件主题
			mailbean.setSubject("测试");
			// 设置邮件内容
			mailbean.setContent("邮件正文");
			// 设置邮件附件
			mailbean.setFiles(mapFile);

			// 发送方 账户 ，邮箱账户 这边假设是163的
			mailbean.setSendMailUserName("***@163.com");
			// 发送方密码
			mailbean.setSendMailPassword("***");
			// 发送方邮件服务器 ,如果不知道对应邮箱的 host，百度下就行了。
			mailbean.setMailHost("smtp.163.com");

			// 接收方 邮箱列表
			mailbean.setToMailUserName(receiveList);
		}

		//
		boolean issuccess = MailDream.sendMail(mailbean);
		System.out.println("发送成功：" + issuccess);

	}
}
