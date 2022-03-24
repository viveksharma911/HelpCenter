package com.sebone.helpcenter.system;

import java.util.Date;
import java.util.List;

import com.sebone.helpcenter.entityclasses.AnswerRatings;
import com.sebone.helpcenter.entityclasses.ResolvedByDate;
import com.sebone.helpcenter.entityclasses.ResolvedQuestionRating;
import com.sebone.helpcenter.entityclasses.TagRatings;

/**
 * @interfaceName SystemInteractionInterface
 * @objective  This is a system interface class which contains all the method signature not implementation. 
 * @author VivekSharma
 * @date 24march 2022
 */

public interface SystemInteractionInterface {
	
	List<AnswerRatings> getAnswerRatingsListByMostLikes();
	
	List<ResolvedQuestionRating> getQuestionMostResolved();
	
	List<TagRatings> getMostAccessedTags();
	
	List<ResolvedByDate> countOfResolvedQuestion(Date startDate, Date endDate);
	
}
