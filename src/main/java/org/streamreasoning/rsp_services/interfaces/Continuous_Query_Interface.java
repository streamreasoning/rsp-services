/*******************************************************************************
 * Copyright 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.streamreasoning.rsp_services.interfaces;

import org.streamreasoning.rsp_services.commons.Rsp_services_Component_Status;

public interface Continuous_Query_Interface {
		
	/**
	 * Method to add observer to a specific query
	 * @param observer Continuous_Query_Observer_Interface object
	 * @return object that represents collection of Continuous_Query_Interface
	 */
	public Object addObserver(Object observer);
	
	/**
	 * Method to remove observer from a specific query
	 * @param observerID unique ID of Continuous_Query_Observer_Interface object
	 * @return object that represents collection of Continuous_Query_Interface
	 */
	public Object removeObserver(Object observerID);
	
	/**
	 * Method to set query ID
	 * @param queryID unique ID of Continuous_Query_Interface object
	 */
	public void setQueryID(String queryID);
	
	/**
	 * Method to get query ID
	 * @return String that represents Continuous_Query_Interface object ID
	 */
	public String getQueryID();
	
	/**
	 * Method to set query body
	 * @param queryBody body of Continuous_Query_Interface object
	 */
	public void setQueryBody(String queryBody);
	
	/**
	 * Method to set query body
	 * @return String that represents Continuous_Query_Interface object body
	 */
	public String getQueryBody();
	
	/**
	 * Method to set the new status of the query
	 * @param newStatus object that represents the new status of the query
	 */
	public void changeQueryStatus(Rsp_services_Component_Status newStatus);
	
	/**
	 * Method to get the new status of the query
	 * @return Status of the query
	 */
	public Rsp_services_Component_Status getQueryStatus();

}
