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
package org.streamreasoning.rsp_services.observers;

import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class MultipleObserversDataServer  extends ServerResource {

	/**
	 *  Method to get informations about all the observers
	 */
	@Get
	public void getObserversInfo(){
		this.getResponse().setStatus(Status.SUCCESS_OK,"TODO: implement method to get information about all observers");
		this.getResponse().setEntity("TODO: implement method to get information about all observers", MediaType.TEXT_PLAIN);
	}
}
