package cn.hassan.provider.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with idea
 * Author: hss
 * Date: 10/30/2018 10:23 AM
 * Description:
 */
public class Provider {
	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
		context.start();
		System.in.read(); // press any key to exit
	}
}
