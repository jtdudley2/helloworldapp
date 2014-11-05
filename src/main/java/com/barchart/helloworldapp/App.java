package com.barchart.helloworldapp;

import java.util.Set;

import com.barchart.util.guice.GuiceApp;
import com.google.inject.Inject;

public class App implements GuiceApp {

	@Inject
	private Set<MyComponent> components;

	public void run(String[] args) throws Exception {
		System.out.println("Hello world");
		for (MyComponent c : components) {
			c.saySomething();
		}

	}

}
