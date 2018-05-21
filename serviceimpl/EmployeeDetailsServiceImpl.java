package com.cts.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.cts.bean.EmployeeDetails;
import com.cts.service.EmployeeDetailsService;

public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {
	private List<EmployeeDetails> emplist; // constructor

	public EmployeeDetailsServiceImpl() {
		emplist = new ArrayList<EmployeeDetails>();

	}

	@Override
	public boolean add(EmployeeDetails emp) {
		if(get(emp.getId())!=null)
		return false;
		emplist.add(emp);
		return true;
	}

	@Override
	public boolean update(EmployeeDetails emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeDetails get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDetails> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDetails> display() {
		// TODO Auto-generated method stub
		return null;
	}

}
