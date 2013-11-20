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
package org.streamreasoning.rsp_services.observers;

import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class SingleObserverDataServer extends ServerResource {

	/* Method to delete an observer
	 * The implementation of this method needs to call the method removeObserver
	 * of a class that implements RDF_Stream_Processor_Interface interface
	 */
	@Delete
	public void unregisterObserver(){
		this.getResponse().setStatus(Status.SUCCESS_OK,"TODO: implement method to delete observer from query");
		this.getResponse().setEntity("TODO: implement method to delete observer from query", MediaType.TEXT_PLAIN);
	}

	/* Method to get informations about a specific observer
	 *
	 */
	@Get
	public void getObserverInfo(){
		this.getResponse().setStatus(Status.SUCCESS_OK,"TODO: implement method to get informations about specified observer");
		this.getResponse().setEntity("TODO: implement method to get informations about specified observer", MediaType.TEXT_PLAIN);
	}
}
