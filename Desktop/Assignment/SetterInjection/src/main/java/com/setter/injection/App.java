package com.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {



		@SuppressWarnings("resource")
		public static void main(String[] args) {

			ApplicationContext contextObj = new ClassPathXmlApplicationContext("spring-beans.xml");
			Employee empObj = (Employee) contextObj.getBean("employee");
			empObj.showResult();
		}
	}

