package com.sebone.helpcenter.entityclasses;

/**
 * @interfaceName Tag
 * @objective   This class contains tag related details. 
 * @author VivekSharma
 * @date 24march 2022
 */
public class Tag {
	
             private int tagId;
             private String tagTitle;
			/**
			 * @param tagId
			 * @param tagTitle
			 */
			public Tag(int tagId, String tagTitle) {
				super();
				this.tagId = tagId;
				this.tagTitle = tagTitle;
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
			 * @return the tagTitle
			 */
			public String getTagTitle() {
				return tagTitle;
			}
			/**
			 * @param tagTitle the tagTitle to set
			 */
			public void setTagTitle(String tagTitle) {
				this.tagTitle = tagTitle;
			}
             		
             
}
