package com.soumya.question_service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soumya.question_service.model.Question;
import com.soumya.question_service.model.QuestionWrapper;
import com.soumya.question_service.model.Response;
import com.soumya.question_service.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	QuestionService questionService;
	
	@GetMapping("/allQuestions")
	public List<Question> getAllQuestions() {
		List<Question>qList = new ArrayList<>();
		qList =questionService.getAllQuestions();
		return qList;
	}
	@GetMapping("category/{category}")
	public List<Question> getQuestionsByCategory(@PathVariable String category) {
		List<Question>qList = new ArrayList<>();
		qList =questionService.getQuestionsByCategory(category);
		return qList;
	}
	@PostMapping("add")
	public String addQuestion(@RequestBody Question question) {
		 questionService.addQuestion(question);
		 return "success";
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteQuestion(@PathVariable Integer id) {
		 questionService.deleteQuestion(id);
		 return "deleted successfully";
	}
	
	@PutMapping("update")
	public String updateQuestion(@RequestBody Question question) {
		 questionService.updateQuestion(question);
		 return "updated successfully";
	}
	
	@GetMapping("generate")
	public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName , @RequestParam Integer numQuestions){
		return questionService.getQuestionsForQuiz(categoryName,numQuestions);
		
	}
	
	@PostMapping("getQuestions")
	public ResponseEntity<List<QuestionWrapper >> getQuestionsFromId(@RequestBody List<Integer> questionIds){
		return questionService.getQuestionsFromId(questionIds);
	}
	
	@PostMapping("getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
		return questionService.getScore(responses);
		
	}
}
