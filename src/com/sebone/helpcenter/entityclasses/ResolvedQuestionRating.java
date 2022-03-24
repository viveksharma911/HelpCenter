package com.sebone.helpcenter.entityclasses;

/**
 * @interfaceName ResolvedQuestionRating
 * @objective   This class contains data related to resolved question rating. 
 * @author VivekSharma
 * @date 24march 2022
 */


public class ResolvedQuestionRating {
	
          private int questionId;
          private String questionName;
          private int countResolved;
          private int countPending;
          
          
		/**
		 * @param questionId
		 * @param questionName
		 * @param countResolved
		 * @param countPending
		 */
		public ResolvedQuestionRating(int questionId, String questionName, int countResolved, int countPending) {
			super();
			this.questionId = questionId;
			this.questionName = questionName;
			this.countResolved = countResolved;
			this.countPending = countPending;
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
		 * @return the questionName
		 */
		public String getQuestionName() {
			return questionName;
		}


		/**
		 * @param questionName the questionName to set
		 */
		public void setQuestionName(String questionName) {
			this.questionName = questionName;
		}


		/**
		 * @return the countResolved
		 */
		public int getCountResolved() {
			return countResolved;
		}


		/**
		 * @param countResolved the countResolved to set
		 */
		public void setCountResolved(int countResolved) {
			this.countResolved = countResolved;
		}


		/**
		 * @return the countPending
		 */
		public int getCountPending() {
			return countPending;
		}


		/**
		 * @param countPending the countPending to set
		 */
		public void setCountPending(int countPending) {
			this.countPending = countPending;
		}   
          
		
		
}
