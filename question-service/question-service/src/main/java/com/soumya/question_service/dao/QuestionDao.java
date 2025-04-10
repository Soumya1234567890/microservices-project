package com.soumya.question_service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.soumya.question_service.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer>{

	/*
	 * since the category column is a part of question table so JPA is smart enough
	 * to give findByCategory else we have to write HQL query
	 */	
	List<Question> findByCategory(String category);
	
	
    @Query(value = "SELECT q.id FROM question q Where q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(String category, int numQ);
}
