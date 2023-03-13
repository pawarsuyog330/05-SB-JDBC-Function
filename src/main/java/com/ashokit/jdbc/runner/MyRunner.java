package com.ashokit.jdbc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ashokit.jdbc.dao.BonusDAO;

@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
	BonusDAO dao;
	
	@Value("${employee.number}")
	private Integer empno;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Bonus : " + dao.fetchBonusById(empno));

	}

}
