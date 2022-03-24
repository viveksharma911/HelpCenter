package com.sebone.helpcenter.entityclasses;

/**
 * @interfaceName SubCategoryDetails
 * @objective   This class is for contains list of sub categories details. 
 * @author VivekSharma
 * @date 24march 2022
 */

import java.util.List;

public class SubCategoryDetails {
            
	
	  List<IssueSubCategory> listOSubcategory;

	/**
	 * @param listOSubcategory
	 */
	public SubCategoryDetails(List<IssueSubCategory> listOSubcategory) {
		super();
		this.listOSubcategory = listOSubcategory;
	}

	/**
	 * @return the listOSubcategory
	 */
	public List<IssueSubCategory> getListOSubcategory() {
		return listOSubcategory;
	}

	/**
	 * @param listOSubcategory the listOSubcategory to set
	 */
	public void setListOSubcategory(List<IssueSubCategory> listOSubcategory) {
		this.listOSubcategory = listOSubcategory;
	}

	
	  
}
