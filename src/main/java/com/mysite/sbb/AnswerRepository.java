package com.mysite.sbb;

import com.mysite.sbb.Model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository <Answer, Integer> {
}
