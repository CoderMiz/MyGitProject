package com.boston.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boston.task.entities.Drug;

@Repository
public interface DrugRepository extends JpaRepository<Drug, Integer>{

}
