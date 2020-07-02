package com.nt.ioc2;

import java.lang.management.GarbageCollectorMXBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class DriverClass {
	
	public static void main(String[] arg) {
		
		//1. using beanfactory Spring container
		Resource resource = new FileSystemResource("src/main/resources/appContext1.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		Users usrObj = (Users) factory.getBean("u");
		usrObj.display();
		
		//2. using Application context Spring container
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/appContext1.xml");
		Users uObjs = (Users) ctx.getBean("u");
		uObjs.display();
		

		Resource resource2 = new FileSystemResource("src/main/resources/appContext2.xml");
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource2);
		Car carObj = (Car) xmlBeanFactory.getBean("c3");
		carObj.display();
		
		Car carObj2 = (Car) xmlBeanFactory.getBean("c4"); //using shortform/ p-namespace in xml file
		carObj2.display();

		Car obj3 = (Car) xmlBeanFactory.getBean("c4"); //scope is: prototype, so multiple constructor will create
		obj3.display();
		
		System.out.println(carObj2.hashCode());
		System.out.println(obj3.hashCode());

	}

}
