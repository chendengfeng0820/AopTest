package test;

import com.easyarch.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: cdf
 * @create: 2020-02-09 23:21
 **/
public class Test {


	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");

		IAccountService as= (IAccountService) applicationContext.getBean("accountservice");

		as.saveAccount();
		as.delete();
		as.update(1);
		as.saveAccount();
	}
}
