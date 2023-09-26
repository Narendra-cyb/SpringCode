package com.naren.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.naren.beans.JustTest;
import com.naren.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		
		
		
		
		
		
		//hold spring bean cfg file name
		FileSystemResource res = new FileSystemResource("src/main/java/com/naru/confgs/applicationContext.xml");
		
		//create IOC container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		//get target spring bean class object
		Object obj = factory.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		
		//object for justTest class
		Object obj2 = factory.getBean("ageOb");
		JustTest jst = (JustTest) obj2;
		
		//call the methods of objects
		System.out.println(generator.getName());
		System.out.println(jst.getAge());
		
		//alternate way
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/naru/confgs/applicationContext.xml");
//		
//		WishMessageGenerator generator =(WishMessageGenerator) context.getBean("wmg");
//		System.out.println(generator.getName());
//		
//		JustTest jst = (JustTest) context.getBean("ageOb");
//		System.out.println(jst.getAge());
		

	}//main

}//class
