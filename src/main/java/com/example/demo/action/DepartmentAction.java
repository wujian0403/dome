package com.example.demo.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.demo.biz.DepartmentsBiz;
import com.example.demo.pojo.Departments;

@RestController
@RequestMapping("/AIP")
public class DepartmentAction {
	@Autowired
	private DepartmentsBiz biz;

 
	@GetMapping("querAll")
	public List<Departments> getTest() {
		return biz.querAll();
	}
	
	@GetMapping("delect/{id}")
	public String delete(@PathVariable Integer id) {
		Integer i = biz.remove(id);
		if(i!=0) {
			return "200";
		}else {
			return "400";
		}
	}

}
