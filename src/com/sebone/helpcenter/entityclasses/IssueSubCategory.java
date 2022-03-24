package com.sebone.helpcenter.entityclasses;

import java.util.Date;

/**
 * @interfaceName IssueSubCategory
 * @objective  This class contains all the sub category related details.
 * @author VivekSharma
 * @date 24march 2022
 */

public class IssueSubCategory {
        
	         private int catgeoryId;
	         private String subCatgoryName;
	         private String subCatgoryDescription;
	         private Boolean subCatgoryStatus;
	         private Date createdAt;
	         
	        


			/**
			 * @param catgeoryId
			 * @param subCatgoryName
			 * @param subCatgoryDescription
			 * @param subCatgoryStatus
			 * @param createdAt
			 */
			public IssueSubCategory(int catgeoryId, String subCatgoryName, String subCatgoryDescription,
					Boolean subCatgoryStatus, Date createdAt) {
				super();
				this.catgeoryId = catgeoryId;
				this.subCatgoryName = subCatgoryName;
				this.subCatgoryDescription = subCatgoryDescription;
				this.subCatgoryStatus = subCatgoryStatus;
				this.createdAt = createdAt;
			}


			/**
			 * @return the catgeoryId
			 */
			public int getCatgeoryId() {
				return catgeoryId;
			}


			/**
			 * @param catgeoryId the catgeoryId to set
			 */
			public void setCatgeoryId(int catgeoryId) {
				this.catgeoryId = catgeoryId;
			}


			/**
			 * @return the subCatgoryName
			 */
			public String getSubCatgoryName() {
				return subCatgoryName;
			}


			/**
			 * @param subCatgoryName the subCatgoryName to set
			 */
			public void setSubCatgoryName(String subCatgoryName) {
				this.subCatgoryName = subCatgoryName;
			}


			/**
			 * @return the subCatgoryDescription
			 */
			public String getSubCatgoryDescription() {
				return subCatgoryDescription;
			}


			/**
			 * @param subCatgoryDescription the subCatgoryDescription to set
			 */
			public void setSubCatgoryDescription(String subCatgoryDescription) {
				this.subCatgoryDescription = subCatgoryDescription;
			}


			/**
			 * @return the subCatgoryStatus
			 */
			public Boolean getSubCatgoryStatus() {
				return subCatgoryStatus;
			}


			/**
			 * @param subCatgoryStatus the subCatgoryStatus to set
			 */
			public void setSubCatgoryStatus(Boolean subCatgoryStatus) {
				this.subCatgoryStatus = subCatgoryStatus;
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
			
			
			
	
	         
	
}
