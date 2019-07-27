package com.example.demo.biz;

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DepartmentsDao;
import com.example.demo.dao.UserDao;
import com.example.demo.pojo.Departments;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class DepartmentsBiz {
	@Autowired
	private DepartmentsDao depar;
	@Autowired
	private UserDao users;
	
	public List<Departments>  querAll(){
		return depar.querAll();
	}
   
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer remove(Integer id) {
		return users.reovme(id);
	}
}
