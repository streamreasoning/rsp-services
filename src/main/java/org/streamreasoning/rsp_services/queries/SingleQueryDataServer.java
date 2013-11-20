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
package org.streamreasoning.rsp_services.queries;

import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class SingleQueryDataServer extends ServerResource {

	/* Method to register new query
	 * The implementation of this method needs to call the method registerQuery 
	 * of a class that implements RDF_Stream_Processor_Interface interface
	 */
	@Put
	public void registerQuery(Representation rep){
		this.getResponse().setStatus(Status.SUCCESS_OK,"TODO: implement method to register new query");
		this.getResponse().setEntity("TODO: implement method to register new query", MediaType.TEXT_PLAIN);	
	}

	/* Method to register new stream
	 * The implementation of this method needs to call the method unregisterQuery
	 * of a class that implements RDF_Stream_Processor_Interface interface
	 */
	@Delete
	public void unregisterQuery(){
		this.getResponse().setStatus(Status.SUCCESS_OK,"TODO: implement method to unregister query");
		this.getResponse().setEntity("TODO: implement method to unregister query", MediaType.TEXT_PLAIN);	
	}

	/* Method to register new stream
	 * The implementation of this method needs to call the methods addObserver and changeQueryStatus 
	 * of a class that implements Continuous_Query_Interface interface and mathods startQuery and stopQuery 
	 * of a class that implements RDF_Stream_Processor_Interface interface.
	 * The new Observer must be a class that implements Continuous_Query_Observer_Interface interface
	 */
	@Post
	public void changeQueryStatus(Representation rep){
		this.getResponse().setStatus(Status.SUCCESS_OK,"TODO: implement method to change query status or add new observer");
		this.getResponse().setEntity("TODO: implement method to change query status or add new observer", MediaType.TEXT_PLAIN);
	}

	/* Method to get informations about a specific registered query
	 *
	 */
	@Get
	public void getQueryInformations(){
		this.getResponse().setStatus(Status.SUCCESS_OK,"TODO: implement method to get information about specific query");
		this.getResponse().setEntity("TODO: implement method to get information about specific query", MediaType.TEXT_PLAIN);
	}
}
