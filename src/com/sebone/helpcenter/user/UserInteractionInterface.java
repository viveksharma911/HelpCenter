package com.sebone.helpcenter.user;

import java.util.List;
import java.util.Locale.Category;

import com.sebone.helpcenter.entityclasses.CategoryDetails;
import com.sebone.helpcenter.entityclasses.IssueSubCategory;
import com.sebone.helpcenter.entityclasses.QuestionAnswerDetails;
import com.sebone.helpcenter.entityclasses.Questions;
import com.sebone.helpcenter.entityclasses.SubCategoryDetails;
import com.sebone.helpcenter.entityclasses.Tag;
import com.sebone.helpcenter.entityclasses.User;
import com.sebone.helpcenter.entityclasses.UserTracking;

/**
 *  @interface name  -  UserInteractionInterface
 *  @Objective   -     This interface class contains all method signature not implementation which interacts with user.
 *  @author VivekSharma
 *  @Date -  24 march 2022
 * 
 */
 
public interface UserInteractionInterface {
             
	 CategoryDetails getCategoryByUser(Boolean isGuest);
	 
	 SubCategoryDetails  getSubCategoryByCategoryId (Category CategoryId , UserTracking trackingId);
	 
	 List<Questions> getQuestionBySubCategoryId  (IssueSubCategory SubCategoryId, UserTracking  trackingId);
	 
	 QuestionAnswerDetails  getAnswerByQuestionId(Questions QuestionId);
	 
	 Integer  SetLikeOrDislikeOnAnswer (Questions QuestionId ,Boolean isLike ,User userId);
	 
	 List<Questions>  getQusetionByTag(Tag tagTittleName);

}
