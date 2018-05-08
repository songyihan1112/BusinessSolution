package myspring.di.xml.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import junit.framework.Assert;
import myspring.di.xml.Hello;
import myspring.di.xml.Printer;

import static org.junit.Assert.*;

	public class HelloBeanJunitTest {
		
	ApplicationContext context;
	
	@Before
	public void init() {
		//1.IoC 컨테이너 생성
		//1.ApplicationContext 객체 생성
		context= new GenericXmlApplicationContext("config/beans.xml");
	}
	
	@Test
	public void test1() {
		// TODO Auto-generated method stub
	
		//2. Hello Bean 가져오기
		Hello hello = (Hello)context.getBean("hello");
		assertEquals("Hello Spring", hello.sayHello());
		hello.print();
		//3. StringPrinter Bean 가져오기
		Printer printer = context.getBean("printer",Printer.class);
		assertEquals("Hello Spring", printer.toString());
		
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
