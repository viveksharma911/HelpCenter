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
 *  @interface name  -  UserServiceImpl
 *  @Objective   -     This implements class contains all method with implementation.
 *  @author VivekSharma
 *  @Date -  24 march 2022
 * 
 */

public class UserServiceImpl implements UserInteractionInterface{

	@Override
	public CategoryDetails getCategoryByUser(Boolean isGuest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubCategoryDetails getSubCategoryByCategoryId(Category CategoryId, UserTracking trackingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Questions> getQuestionBySubCategoryId(IssueSubCategory SubCategoryId, UserTracking trackingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionAnswerDetails getAnswerByQuestionId(Questions QuestionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer SetLikeOrDislikeOnAnswer(Questions QuestionId, Boolean isLike, User userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *
	 */
	/**
	 *
	 */
	@Override
	public List<Questions> getQusetionByTag(Tag tagTittleName) {
		// TODO Auto-generated method stub
		return null;
	}

}
