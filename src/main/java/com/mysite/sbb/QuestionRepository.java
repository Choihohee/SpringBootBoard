package com.mysite.sbb;

import com.mysite.sbb.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {  //Question 엔티티의 기본키가 Integer임

}
