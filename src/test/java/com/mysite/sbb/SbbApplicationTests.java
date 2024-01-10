package com.mysite.sbb;

import com.mysite.sbb.Model.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SbbApplicationTests {
	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		Question question1 = new Question();
		question1.setSubject("sbb가 무엇인가요?");
		question1.setContent("sbb에 대해서 알고 싶습니다.");
		question1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(question1);	//첫 번째 질문 저장

		Question question2 = new Question();
		question2.setSubject("스프링부트 모델 질문입니다");
		question2.setContent("id는 자동으로 생성되나요?");
		question2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(question2);	//두 번째 질문 저장
	}

}
