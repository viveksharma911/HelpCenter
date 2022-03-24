package com.sebone.helpcenter.entityclasses;

import java.util.List;

/**
 * @interfaceName CategoryDetails
 * @objective   This class contains all categories details. 
 * @author VivekSharma
 * @date 24march 2022
 */


public class CategoryDetails {
              
	
	        private List<IssueCategory> listOfCategory;
	        private int trackingId;
	        
	        
	        public CategoryDetails(List<IssueCategory> listOfCategory, int trackingId) {
				super();
				this.listOfCategory = listOfCategory;
				this.trackingId = trackingId;
			}


			/**
			 * @return the listOfCategory
			 */
			public List<IssueCategory> getListOfCategory() {
				return listOfCategory;
			}


			/**
			 * @param listOfCategory the listOfCategory to set
			 */
			public void setListOfCategory(List<IssueCategory> listOfCategory) {
				this.listOfCategory = listOfCategory;
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
	           
	           
			


			
	
	  
}
