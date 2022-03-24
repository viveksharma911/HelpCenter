package com.sebone.helpcenter.entityclasses;


/**
 * @interfaceName QuestionAnswerDetails
 * @objective   This class contains question and answer details.
 * @author VivekSharma
 * @date 24march 2022
 */

public class QuestionAnswerDetails {
                  
	private int questionId;
	private String answer;
	
	

	/**
	 * @param questionId
	 * @param answer
	 */
	public QuestionAnswerDetails(int questionId, String answer) {
		super();
		this.questionId = questionId;
		this.answer = answer;
	}

	/**
	 * @return the questionId
	 */
	public int getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
