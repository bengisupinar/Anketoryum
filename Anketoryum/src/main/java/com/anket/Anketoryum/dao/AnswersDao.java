package com.anket.Anketoryum.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anket.Anketoryum.entity.AnswerGet;
import com.anket.Anketoryum.repository.AnswerGetRepository;

@Component
public class AnswersDao {

	@Autowired
	private AnswerGetRepository getRepository;
	
	public AnswerGet[] getAnswers(int questionID) {
		return getRepository.getAnswers(questionID);
	}
	
	public long getVoteCount(int choiceID) {
		return getRepository.getVoteCount(choiceID);
	}
	
	public void addAnswer(int userid, int questionid, int choicesid, String date) {
		getRepository.addAnswer(userid, questionid, choicesid, date);
	}
}
