package com.barchart.helloworldapp;

import javax.inject.Named;

import com.barchart.util.guice.Component;
import com.google.inject.Inject;

@Component("component1")
public class Component1 implements MyComponent {

	@Inject
	@Named("#name")
	private String name;

	public void saySomething() {
		System.out.println("My name is " + name);
	}

}
