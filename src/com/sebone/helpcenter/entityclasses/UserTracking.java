package com.sebone.helpcenter.entityclasses;

import java.util.Date;

 
/**
 * @interfaceName UserTracking
 * @objective     This class is for track user activity.
 * @author VivekSharma
 * @date 24march 2022
 */
public class UserTracking {
            private int trackingId;
            private int questionId;
            private int categoryId;
            private int subcategoryId;
            private int roomId;
            private Boolean isResolved;
            private  Date startTime;
            private Date lastUpdate;
            private int userId;
			/**
			 * @param trackingId
			 * @param questionId
			 * @param categoryId
			 * @param subcategoryId
			 * @param roomId
			 * @param isResolved
			 * @param startTime
			 * @param lastUpdate
			 * @param userId
			 */
			public UserTracking(int trackingId, int questionId, int categoryId, int subcategoryId, int roomId,
					Boolean isResolved, Date startTime, Date lastUpdate, int userId) {
				super();
				this.trackingId = trackingId;
				this.questionId = questionId;
				this.categoryId = categoryId;
				this.subcategoryId = subcategoryId;
				this.roomId = roomId;
				this.isResolved = isResolved;
				this.startTime = startTime;
				this.lastUpdate = lastUpdate;
				this.userId = userId;
			}
			/**
			 * @return the trackingId
			 */
			public int getTrackingId() {
				return trackingId;
			}
			/**
			 * @param trackingId the trackingId to set
			 */
			public void setTrackingId(int trackingId) {
				this.trackingId = trackingId;
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
			 * @return the categoryId
			 */
			public int getCategoryId() {
				return categoryId;
			}
			/**
			 * @param categoryId the categoryId to set
			 */
			public void setCategoryId(int categoryId) {
				this.categoryId = categoryId;
			}
			/**
			 * @return the subcategoryId
			 */
			public int getSubcategoryId() {
				return subcategoryId;
			}
			/**
			 * @param subcategoryId the subcategoryId to set
			 */
			public void setSubcategoryId(int subcategoryId) {
				this.subcategoryId = subcategoryId;
			}
			/**
			 * @return the roomId
			 */
			public int getRoomId() {
				return roomId;
			}
			/**
			 * @param roomId the roomId to set
			 */
			public void setRoomId(int roomId) {
				this.roomId = roomId;
			}
			/**
			 * @return the isResolved
			 */
			public Boolean getIsResolved() {
				return isResolved;
			}
			/**
			 * @param isResolved the isResolved to set
			 */
			public void setIsResolved(Boolean isResolved) {
				this.isResolved = isResolved;
			}
			/**
			 * @return the startTime
			 */
			public Date getStartTime() {
				return startTime;
			}
			/**
			 * @param startTime the startTime to set
			 */
			public void setStartTime(Date startTime) {
				this.startTime = startTime;
			}
			/**
			 * @return the lastUpdate
			 */
			public Date getLastUpdate() {
				return lastUpdate;
			}
			/**
			 * @param lastUpdate the lastUpdate to set
			 */
			public void setLastUpdate(Date lastUpdate) {
				this.lastUpdate = lastUpdate;
			}
			/**
			 * @return the userId
			 */
			public int getUserId() {
				return userId;
			}
			/**
			 * @param userId the userId to set
			 */
			public void setUserId(int userId) {
				this.userId = userId;
			}
            
			
}
