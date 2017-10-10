package com.me.helloworld.demo.config;

import com.me.helloworld.demo.HelloWorldPrinter;
import com.me.helloworld.demo.MainApplet;

public class Configuration {
	
	public static MainApplet getMainApplet() {
		return new HelloWorldPrinter();
	}
	
}
