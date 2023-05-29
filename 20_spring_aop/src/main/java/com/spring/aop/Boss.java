package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Boss {

	public void work() {
		System.out.println("사장의 일을 한다.");
	}
	
	public void getWorkingTime() {
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void getInfo(String title, int salary) {
		
	}
	
}
