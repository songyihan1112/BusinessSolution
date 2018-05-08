package myspring.di.annot;

import org.springframework.stereotype.Component;

@Component("consolePrinter")
public class ConsolePrinter implements Printer{

	public void print(String message) {
		// TODO Auto-generated method stub
		
		System.out.println(message);
		
	}
	
}
