package com.karina.one_to_one_join;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmpController {
	@Autowired
	EmpRepository erepo;
	
	@RequestMapping("/testing")
	public String test()
		{
		return "data saved";
		}
	
	@RequestMapping("/save")
	public String save()
	{
		Emp e=new Emp();
		e.setName("jay");
		e.setDept("CE");
		e.setSalary(120000);
		Address a=new Address();
		a.setCity("Ranchi");
		a.setPincode(834001);
		
		a.setEmp(e);
		e.setAddress(a);
		erepo.save(e);
		
		return "data extend";
	}
	
	@RequestMapping("/saveall")
	public String saveAll()
	{
		Emp e1=new Emp();
		e1.setName("Raj");
		e1.setDept("CE");
		e1.setSalary(130000);
		Address a1=new Address();
		a1.setCity("Tata");
		a1.setPincode(845008);
		
		a1.setEmp(e1);
		e1.setAddress(a1);
		erepo.save(e1);
		
		Emp e2=new Emp();
		e2.setName("Sujal");
		e2.setDept("CE");
		e2.setSalary(220000);
		Address a2=new Address();
		a2.setCity("Hazaribag");
		a2.setPincode(878990);
		
		a2.setEmp(e2);
		e2.setAddress(a2);
		erepo.save(e2);
		
		Emp e3=new Emp();
		e3.setName("Jagrit");
		e3.setDept("CE");
		e3.setSalary(110000);
		Address a3=new Address();
		a3.setCity("bokaro");
		a3.setPincode(834001);
		
		a3.setEmp(e3);
		e3.setAddress(a3);
		erepo.save(e3);
		
		List<Emp>list=Arrays.asList(e1,e2,e3);
		
		erepo.saveAll(list);
		return " data is saved...!";
		
	}
	@RequestMapping("/{id}") 
	public List<Emp> byid(@PathVariable int id)	
	{	
		return erepo.findById(id);
		
	}
	
	@RequestMapping("/all")
	public List<Emp> alldata()
	{
		return erepo.findAll();
	}
	
	@RequestMapping("/some/join")
	public List<Emp> someby()
	{
		return erepo.getAll();
	}
	
	@RequestMapping("/some/join/{name}")
	public List<Emp> newby(@PathVariable String name)
	{
		return erepo.getByName(name);
	}
	@RequestMapping("/new/{dept}")
	public List<Emp> getby(@PathVariable String dept)
	{
		return erepo.getByDeptName(dept);
	}
	
	
}

