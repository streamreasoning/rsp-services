/*******************************************************************************
 * Copyright 2013 Marco Balduini, Emanuele Della Valle
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
		
	public Object addObserver(Object observer);
	public Object removeObserver(Object observerID);
	public void setQueryID(String queryID);
	public String getQueryID();
	public void setQueryBody(String queryBody);
	public String getQueryBody();
	public void changeQueryStatus(Rsp_services_Component_Status newStatus);
	public Rsp_services_Component_Status getQueryStatus();

}
