package com.ashokit.jdbc.dao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.ashokit.jdbc.dao.BonusDAO;

@Repository
public class BonusDAOImpl implements BonusDAO {

	@Autowired
	SimpleJdbcCall simpleJdbcCall;

	@Override
	public Double fetchBonusById(Integer empno) {
		simpleJdbcCall.withFunctionName("bonus_function");
		Map<String, Object> output = simpleJdbcCall.execute(empno);
		return (Double) output.get("return");
	}

}
