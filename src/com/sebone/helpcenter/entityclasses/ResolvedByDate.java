package com.sebone.helpcenter.entityclasses;

import java.util.Date;


/**
 * @interfaceName ResolvedByDate
 * @objective  This class is for view the number of resolved question at a time. 
 * @author VivekSharma
 * @date 24march 2022
 */

public class ResolvedByDate {
	
              private Date dateFrom;
              private Date dateTo;
              private int listOfNumberOfResolve;
              
			

			/**
			 * @param dateFrom
			 * @param dateTo
			 * @param listOfNumberOfResolve
			 */
			public ResolvedByDate(Date dateFrom, Date dateTo, int listOfNumberOfResolve) {
				super();
				this.dateFrom = dateFrom;
				this.dateTo = dateTo;
				this.listOfNumberOfResolve = listOfNumberOfResolve;
			}

			/**
			 * @return the dateFrom
			 */
			public Date getDateFrom() {
				return dateFrom;
			}

			/**
			 * @param dateFrom the dateFrom to set
			 */
			public void setDateFrom(Date dateFrom) {
				this.dateFrom = dateFrom;
			}

			/**
			 * @return the dateTo
			 */
			public Date getDateTo() {
				return dateTo;
			}

			/**
			 * @param dateTo the dateTo to set
			 */
			public void setDateTo(Date dateTo) {
				this.dateTo = dateTo;
			}

			/**
			 * @return the listOfNumberOfResolve
			 */
			public int getListOfNumberOfResolve() {
				return listOfNumberOfResolve;
			}

			/**
			 * @param listOfNumberOfResolve the listOfNumberOfResolve to set
			 */
			public void setListOfNumberOfResolve(int listOfNumberOfResolve) {
				this.listOfNumberOfResolve = listOfNumberOfResolve;
			}
			
			
              
}
