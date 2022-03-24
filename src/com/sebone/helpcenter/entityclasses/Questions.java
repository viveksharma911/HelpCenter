package com.sebone.helpcenter.entityclasses;

import java.util.Date;

/**
 * @interfaceName Questions
 * @objective   This class contains all the questions related details.
 * @author VivekSharma
 * @date 24march 2022
 */

public class Questions {  
	       
	
	       private int questionId;
	       private int subCategoryId;
	       private String fullquestion;
	       private String fullanswer;
	       private Boolean isGuest;
	       private Boolean questionStatus;
	       private Date questionCreatedAt;
	       
	       
		/**
		 * @param questionId
		 * @param subCategoryId
		 * @param fullquestion
		 * @param fullanswer
		 * @param isGuest
		 * @param questionStatus
		 * @param questionCreatedAt
		 */
		public Questions(int questionId, int subCategoryId, String fullquestion, String fullanswer, Boolean isGuest,
				Boolean questionStatus, Date questionCreatedAt) {
			super();
			this.questionId = questionId;
			this.subCategoryId = subCategoryId;
			this.fullquestion = fullquestion;
			this.fullanswer = fullanswer;
			this.isGuest = isGuest;
			this.questionStatus = questionStatus;
			this.questionCreatedAt = questionCreatedAt;
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
		 * @return the subCategoryId
		 */
		public int getSubCategoryId() {
			return subCategoryId;
		}


		/**
		 * @param subCategoryId the subCategoryId to set
		 */
		public void setSubCategoryId(int subCategoryId) {
			this.subCategoryId = subCategoryId;
		}


		/**
		 * @return the fullquestion
		 */
		public String getFullquestion() {
			return fullquestion;
		}


		/**
		 * @param fullquestion the fullquestion to set
		 */
		public void setFullquestion(String fullquestion) {
			this.fullquestion = fullquestion;
		}


		/**
		 * @return the fullanswer
		 */
		public String getFullanswer() {
			return fullanswer;
		}


		/**
		 * @param fullanswer the fullanswer to set
		 */
		public void setFullanswer(String fullanswer) {
			this.fullanswer = fullanswer;
		}


		/**
		 * @return the isGuest
		 */
		public Boolean getIsGuest() {
			return isGuest;
		}


		/**
		 * @param isGuest the isGuest to set
		 */
		public void setIsGuest(Boolean isGuest) {
			this.isGuest = isGuest;
		}


		/**
		 * @return the questionStatus
		 */
		public Boolean getQuestionStatus() {
			return questionStatus;
		}


		/**
		 * @param questionStatus the questionStatus to set
		 */
		public void setQuestionStatus(Boolean questionStatus) {
			this.questionStatus = questionStatus;
		}


		/**
		 * @return the questionCreatedAt
		 */
		public Date getQuestionCreatedAt() {
			return questionCreatedAt;
		}


		/**
		 * @param questionCreatedAt the questionCreatedAt to set
		 */
		public void setQuestionCreatedAt(Date questionCreatedAt) {
			this.questionCreatedAt = questionCreatedAt;
		}


		
	       
	       

}
