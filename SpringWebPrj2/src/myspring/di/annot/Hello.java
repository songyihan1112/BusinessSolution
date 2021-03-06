package myspring.di.annot;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hello {
	@Value("${myname}")
	private String name;
	//@Autowired
	//@Qualifier("stringPrinter")
	@Resource(name="${printer1}")
	private Printer printer;
	private List<String> names;
	
	
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Hello() {} //추가로 생성자를 만들었기 때문에 default 생성자를 명시적으로 만들어 줘야한다.
	
	public Hello(String name, Printer printer) {
		super();
		this.name = name;
		this.printer = printer;
	}

//	public void setName(String name) {
//		this.name = name;
	//	}
	//
	//public void setPrinter(Printer printer) {
	//	this.printer = printer;
	//	}
	
	public String sayHello()
	{
		return "Hello " + name;
	}
	
	public void print() {
		this.printer.print(sayHello());
	}
}
