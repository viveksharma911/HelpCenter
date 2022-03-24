package com.sebone.helpcenter.entityclasses;


/**
 * @interfaceName QualityTracking
 * @objective  This class contains tracking related details.
 * @author VivekSharma
 * @date 24march 2022
 */

public class QualityTracking {
              private int qualityTrackingIdl;
              private int questionId;
              private Boolean isLike;
              private User userIdQuality;
              
			

			/**
			 * @param qualityTrackingIdl
			 * @param questionId
			 * @param isLike
			 * @param userIdQuality
			 */
			public QualityTracking(int qualityTrackingIdl, int questionId, Boolean isLike, User userIdQuality) {
				super();
				this.qualityTrackingIdl = qualityTrackingIdl;
				this.questionId = questionId;
				this.isLike = isLike;
				this.userIdQuality = userIdQuality;
			}

			/**
			 * @return the qualityTrackingIdl
			 */
			public int getQualityTrackingIdl() {
				return qualityTrackingIdl;
			}

			/**
			 * @param qualityTrackingIdl the qualityTrackingIdl to set
			 */
			public void setQualityTrackingIdl(int qualityTrackingIdl) {
				this.qualityTrackingIdl = qualityTrackingIdl;
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
			 * @return the isLike
			 */
			public Boolean getIsLike() {
				return isLike;
			}

			/**
			 * @param isLike the isLike to set
			 */
			public void setIsLike(Boolean isLike) {
				this.isLike = isLike;
			}

			/**
			 * @return the userIdQuality
			 */
			public User getUserIdQuality() {
				return userIdQuality;
			}

			/**
			 * @param userIdQuality the userIdQuality to set
			 */
			public void setUserIdQuality(User userIdQuality) {
				this.userIdQuality = userIdQuality;
			}
			
			
			
			
			
			
              
}
