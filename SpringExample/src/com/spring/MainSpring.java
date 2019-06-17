package com.spring;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;

public class MainSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml")); 
	      HelloWorld obj = (HelloWorld) factory.getBean("message");   
		*/ //for spring bean factory container
		
	@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		//HelloWorld obj=(HelloWorld) context.getBean("message");// Spring Application Context Container
		
	//obj.getMessage();
		
		//System.out.println(" "+obj.getSsage());
		
		HelloWorld objA = (HelloWorld) context.getBean("message");
	      //objA.setSsage("I'm object A"); // you pass the value by setter method or you can pass the value by property tag in the beans.xml file
	      objA.getSsage();

	      HelloWorld objB = (HelloWorld) context.getBean("message");
	      objB.getSsage();
			
	}
}
