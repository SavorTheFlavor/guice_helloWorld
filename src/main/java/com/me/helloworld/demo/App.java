package com.me.helloworld.demo;

import com.me.helloworld.demo.config.Configuration;

public class App 
{
	/**
	 *  bootstrap
	 *  ......
	 * @param args
	 */
    public static void main( String[] args )
    {
    	//that is exactly what main() should do
        Configuration.getMainApplet().run();
    }
}
