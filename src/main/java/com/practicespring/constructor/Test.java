package com.practicespring.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {  
	public static void main(String[] args) {  

		ApplicationContext AC=new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee s=(Employee)AC.getBean("e");  
		s.show();  

	}  
}  