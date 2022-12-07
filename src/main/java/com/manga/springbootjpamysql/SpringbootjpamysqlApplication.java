package com.manga.springbootjpamysql;

import static org.springframework.boot.SpringApplication.run;

import java.util.Optional;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.manga.springbootjpamysql.dao.EmployeeDao;
import com.manga.springbootjpamysql.model.Employee;

@SpringBootApplication
public class SpringbootjpamysqlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = run(SpringbootjpamysqlApplication.class, args);
		EmployeeDao empDao = appContext.getBean(EmployeeDao.class);
		empDao.save(new Employee( "Aarohi",6));
	//	empDao.findAll().forEach(emp -> System.out.println(emp));
		Optional<Employee> emp = empDao.findById(452);
		System.out.println(emp);
		
	}

}
