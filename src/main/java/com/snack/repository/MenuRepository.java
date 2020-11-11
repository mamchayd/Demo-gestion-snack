package com.snack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.snack.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long>{
	
	@Query(value = "select * from Menu m where m.name=:name ",nativeQuery = true)
	public Menu findByName(@Param("name") String name);
	

}
