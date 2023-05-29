package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Manager {

	public void work() {
		System.out.println("관리자의 일을 한다.");
	}
	
	public void getWorkingTime() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void getInfo(String title, int salary) {
		
	}
	
}
