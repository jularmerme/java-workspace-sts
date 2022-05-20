package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Candy;

@Repository
@Transactional
public interface CandyRepository extends JpaRepository<Candy, Integer> {
	
	@Query(value="UPDATE candies SET c_name=?1, c_price=?2 WHERE c_id=?3", nativeQuery=true)
	public boolean update(String name, double price, int id);
}
