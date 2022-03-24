package com.sebone.helpcenter.entityclasses;

/**
 * @interfaceName QuestionTag
 * @objective  This class contain question tag related details.
 * @author VivekSharma
 * @date 24march 2022
 */
public class QuestionTag {
            private int questionTagId;
            private int tagId;
            private int questionId;
            
			
     		/**
			 * @param questionTagId
			 * @param tagId
			 * @param questionId
			 */
			public QuestionTag(int questionTagId, int tagId, int questionId) {
				super();
				this.questionTagId = questionTagId;
				this.tagId = tagId;
				this.questionId = questionId;
			}

			/**
			 * @return the questionTagId
			 */
			public int getQuestionTagId() {
				return questionTagId;
			}

			/**
			 * @param questionTagId the questionTagId to set
			 */
			public void setQuestionTagId(int questionTagId) {
				this.questionTagId = questionTagId;
			}

			/**
			 * @return the tagId
			 */
			public int getTagId() {
				return tagId;
			}

			/**
			 * @param tagId the tagId to set
			 */
			public void setTagId(int tagId) {
				this.tagId = tagId;
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
			
			
            
            
}
