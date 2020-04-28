package com.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {



		@SuppressWarnings("resource")
		public static void main(String[] args) {

			ApplicationContext contextObj = new ClassPathXmlApplicationContext("spring-beans.xml");
			Employee empObj = (Employee) contextObj.getBean("employee");
			SBU s1 = (SBU) contextObj.getBean("sbu");
			empObj.showResult();
			s1.getSbuDetails();
			
		}
	}

