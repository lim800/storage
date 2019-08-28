package lim.spring.test.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCall {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./bean.xml");
		Parameter parameter = (Parameter) applicationContext.getBean("parameter");
		System.out.println(parameter);
	}

}
