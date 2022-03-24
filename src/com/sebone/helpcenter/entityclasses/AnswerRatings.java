package com.sebone.helpcenter.entityclasses;

/**
 * @interfaceName AnswerRatings
 * @objective  This class contains all likes & dislike of answer.
 * @author VivekSharma
 * @date 24march 2022
 */
public class AnswerRatings {
              
	
       	private String answer ;
       	private int count;
       	private int disLikeCount;
		/**
		 * @param answer
		 * @param count
		 * @param disLikeCount
		 */
		public AnswerRatings(String answer, int count, int disLikeCount) {
			super();
			this.answer = answer;
			this.count = count;
			this.disLikeCount = disLikeCount;
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
		/**
		 * @return the count
		 */
		public int getCount() {
			return count;
		}
		/**
		 * @param count the count to set
		 */
		public void setCount(int count) {
			this.count = count;
		}
		/**
		 * @return the disLikeCount
		 */
		public int getDisLikeCount() {
			return disLikeCount;
		}
		/**
		 * @param disLikeCount the disLikeCount to set
		 */
		public void setDisLikeCount(int disLikeCount) {
			this.disLikeCount = disLikeCount;
		}
       	
       	
		
       	
}
