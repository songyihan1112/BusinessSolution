package myspring.di.annot;

import org.springframework.stereotype.Component;

@Component("stringPrinter")
public class StringPrinter implements Printer{
	private StringBuffer buffer = new StringBuffer();

	public void print(String message) {
		// TODO Auto-generated method stub
		buffer.append(message);
	}
	
	public String toString() {
		return buffer.toString();
	}

}
