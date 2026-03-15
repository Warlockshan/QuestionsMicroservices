package com.question.QuestionService.services;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.repositories.QuestionRepositories;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionServiceImpl implements QuestionServices{

    QuestionRepositories questionRepositories;

    QuestionServiceImpl(QuestionRepositories questionRepositories) {

        this.questionRepositories = questionRepositories;
    }


    @Override
    public Question findById(Long id) {
        return questionRepositories.findById(id).orElseThrow(()-> new RuntimeException("Question Not Found"));
    }

    @Override
    public Question createQuestion(Question question) {
        return questionRepositories.save(question);
    }

    @Override
    public Question updateQuestion(Question question) {
        return questionRepositories.save(question);
    }

    @Override
    public List<Question> findAllQuestions() {
        return questionRepositories.findAll();
    }

    @Override
    public List<Question> findByQuizId(Long id) {
        return questionRepositories.findByQuizId(id);
    }
}
