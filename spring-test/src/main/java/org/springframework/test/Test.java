package org.springframework.test;

import org.springframework.web.context.support.XmlWebApplicationContext;

public class Test {
	public static void main(String[] args) {
		XmlWebApplicationContext xmlWebApplicationContext = new XmlWebApplicationContext();
		xmlWebApplicationContext.getBean("");
	}
}
