package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import java.time.LocalDateTime;

import com.mysite.sbb.Model.Answer;
import com.mysite.sbb.Model.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;
	@Test
	void testJpa() {
		// AnswerRepository를 사용하여 id가 1인 Answer 엔티티를 조회
		Optional<Answer> oa = this.answerRepository.findById(1);

		// 조회 결과가 존재하는지 확인
		assertTrue(oa.isPresent());

		// Optional에서 Answer 엔티티를 가져옴
		Answer a = oa.get();

		// 가져온 Answer 엔티티의 Question의 id가 2인지 확인
		assertEquals(2, a.getQuestion().getId());
	}
}
