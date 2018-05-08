package myspring.di.xml.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;
import myspring.di.xml.Hello;
import myspring.di.xml.Printer;

import static org.junit.Assert.*;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/beans.xml")
	public class HelloBeanJunitStringTest {
	
	@Autowired
	ApplicationContext context;
	
	@Test 
	public void test1() {
		// TODO Auto-generated method stub
	
		//2. Hello Bean 가져오기
		Hello hello = (Hello)context.getBean("hello2");
		assertEquals("Hello Spring", hello.sayHello());
		hello.print();
		//3. StringPrinter Bean 가져오기
		Printer printer = context.getBean("printer",Printer.class);
		assertEquals("Hello Spring", printer.toString());
		
		assertEquals(3, hello.getNames().size());
		List<String>list = hello.getNames();
		for (String value : list) {
			System.out.println(value);
		}
		
		//Hello hello2 = context.getBean("hello",Hello.class);
		//System.out.println(hello == hello2); // IoC 컨테이너가 Spring Bean을 싱글톤 형태로 관리한다.
	}
	
	@Test @Ignore
	public void test2() {
		Hello hello = (Hello)context.getBean("hello");
		
		Hello hello2 = (Hello)context.getBean("hello");
		
		assertSame(hello, hello2);// 해당 객체를 싱글톤으로 관리하고 있다.
	}
}
