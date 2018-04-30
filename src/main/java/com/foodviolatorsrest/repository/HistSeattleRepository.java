package com.foodviolatorsrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.foodviolatorsrest.model.HistSeattle;

@Repository
public interface HistSeattleRepository extends JpaRepository<HistSeattle, Long> {

	@Query("select h from HistSeattle h")
	List<HistSeattle> getHistSeattleItems();

}
