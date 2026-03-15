package com.question.QuestionService.services;

import com.question.QuestionService.entities.Question;

import java.util.List;

public interface QuestionServices {

    Question findById(Long id);

    Question createQuestion(Question question);

    Question updateQuestion(Question question);

    List<Question> findAllQuestions();

    List<Question> findByQuizId(Long id);

}
