package com.sebone.helpcenter.entityclasses;

/**
 * @interfaceName TagRatings
 * @objective    This class contains data related tag rating.
 * @author VivekSharma
 * @date 24march 2022
 */
public class TagRatings {
	
                 private String tag;
                 private int countTag;
                 
                 
				

				/**
				 * @param tag
				 * @param countTag
				 */
				public TagRatings(String tag, int countTag) {
					super();
					this.tag = tag;
					this.countTag = countTag;
				}




				/**
				 * @return the tag
				 */
				public String getTag() {
					return tag;
				}




				/**
				 * @param tag the tag to set
				 */
				public void setTag(String tag) {
					this.tag = tag;
				}




				/**
				 * @return the countTag
				 */
				public int getCountTag() {
					return countTag;
				}




				/**
				 * @param countTag the countTag to set
				 */
				public void setCountTag(int countTag) {
					this.countTag = countTag;
				}

           
                 
}
