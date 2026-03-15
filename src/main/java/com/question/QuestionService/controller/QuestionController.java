package com.question.QuestionService.controller;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.services.QuestionServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    QuestionServices questionServices;


    private QuestionController(QuestionServices questionServices) {

        this.questionServices = questionServices;

    }

    @PostMapping
    public Question createQuestion(@RequestBody Question question) {

        return questionServices.createQuestion(question);

    }

    @PutMapping
    public Question updateQuestion(@RequestBody Question question) {

        return questionServices.updateQuestion(question);
    }

    @GetMapping
    public List<Question> findAllQuestions() {
        return questionServices.findAllQuestions();
    }

    @GetMapping("/{id}")
    public Question findQuestionById(@RequestParam long id) {
        return questionServices.findById(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> findQuestionsByQuizId(@PathVariable Long quizId) {
        return questionServices.findByQuizId(quizId);
    }

}
