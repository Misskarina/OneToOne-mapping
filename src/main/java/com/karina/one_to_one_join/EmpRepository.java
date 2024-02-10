package com.karina.one_to_one_join;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpRepository extends JpaRepository<Emp,Integer> {

	
	List<Emp> findById(int id);
	//@Query("select new com.karina.one_to_one_join.Emp1(e.id,e.name,e.dept,e.city,e.pincode) from Emp e where e.id=?1")
	
	@Query("select e from Emp e join e.address a")
	List<Emp> getAll();
	
	
	
	@Query("select e from Emp e join e.address a where e.name like %:name%")// parameter based join
	//@Query("select e from Emp e join e.address a where e.name like %?1%") position based join
	List<Emp> getByName(String name);
	@Query("select e from Emp e join e.address a where e.name like %:dept%")
	List<Emp> getByDeptName(String dept);
	
	
}
