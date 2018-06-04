/**
 * 
 */
package com.itheima.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.service.CustomerService;

/**
 * @author linxin
 *
 */
public class Demo1 {

	@Test
	public void testSave(){
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		 CustomerService cs = (CustomerService) applicationContext.getBean("customerService");
		 cs.save();
	}
}
