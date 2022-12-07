package com.manga.springbootjpamysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manga.springbootjpamysql.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	

}
