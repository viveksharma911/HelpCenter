package com.sebone.helpcenter.system;

import java.util.Date;
import java.util.List;

import com.sebone.helpcenter.entityclasses.AnswerRatings;
import com.sebone.helpcenter.entityclasses.ResolvedByDate;
import com.sebone.helpcenter.entityclasses.ResolvedQuestionRating;
import com.sebone.helpcenter.entityclasses.TagRatings;

 
/**
 * @author VivekSharma
 * @interfaceName -  SystemServiceImpl
 * @Objective   -   This implement class contains all the methods which is required.
 *                  And also the implementation of each method. 
 * 
 * @ate -  24 march 2022
 */
public class SystemServiceImpl implements SystemInteractionInterface {

	@Override
	public List<AnswerRatings> getAnswerRatingsListByMostLikes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResolvedQuestionRating> getQuestionMostResolved() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TagRatings> getMostAccessedTags() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResolvedByDate> countOfResolvedQuestion(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}
           
}
