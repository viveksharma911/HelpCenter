package com.sebone.helpcenter.entityclasses;

import java.util.Date;

/**
 * @interfaceName IssueCategory
 * @objective  This class contains all the category related details.
 * @author VivekSharma
 * @date 24march 2022
 */

public class IssueCategory {
                 
	    private int     catId;
	    private String  catgName;
	    private String  description;
	    private String  catgStatus;
	    private Boolean isGuest;
	    private Date    createdAt;
	    private Date    lastModified;
	    
	    
	
		/**
		 * @param catId
		 * @param catgName
		 * @param description
		 * @param catgStatus
		 * @param isGuest
		 * @param createdAt
		 * @param lastModified
		 */
		public IssueCategory(int catId, String catgName, String description, String catgStatus, Boolean isGuest,
				Date createdAt, Date lastModified) {
			super();
			this.catId = catId;
			this.catgName = catgName;
			this.description = description;
			this.catgStatus = catgStatus;
			this.isGuest = isGuest;
			this.createdAt = createdAt;
			this.lastModified = lastModified;
		}


		/**
		 * @return the catId
		 */
		public int getCatId() {
			return catId;
		}


		/**
		 * @param catId the catId to set
		 */
		public void setCatId(int catId) {
			this.catId = catId;
		}


		/**
		 * @return the catgName
		 */
		public String getCatgName() {
			return catgName;
		}


		/**
		 * @param catgName the catgName to set
		 */
		public void setCatgName(String catgName) {
			this.catgName = catgName;
		}


		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}


		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}


		/**
		 * @return the catgStatus
		 */
		public String getCatgStatus() {
			return catgStatus;
		}


		/**
		 * @param catgStatus the catgStatus to set
		 */
		public void setCatgStatus(String catgStatus) {
			this.catgStatus = catgStatus;
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
		 * @return the createdAt
		 */
		public Date getCreatedAt() {
			return createdAt;
		}


		/**
		 * @param createdAt the createdAt to set
		 */
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}


		/**
		 * @return the lastModified
		 */
		public Date getLastModified() {
			return lastModified;
		}


		/**
		 * @param lastModified the lastModified to set
		 */
		public void setLastModified(Date lastModified) {
			this.lastModified = lastModified;
		}
		
		
	
	
}
