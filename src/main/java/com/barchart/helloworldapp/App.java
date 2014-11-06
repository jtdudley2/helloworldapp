package com.barchart.helloworldapp;

import java.util.Set;

import com.barchart.util.guice.GuiceLauncher;
import com.google.inject.Inject;

public final class App {

	@Inject
	private Set<MyComponent> components;

	private void start() {
		System.out.println("Hello world");
		for (MyComponent c : components) {
			c.saySomething();
		}
	}

	public static void main(String[] args) throws Exception {
		App app = GuiceLauncher.configure(App.class);
		app.start();
	}

}
