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
 * 
 * Acknowledgements:
 * 
 * This work was partially supported by the European project LarKC (FP7-215535) 
 * and by the European project MODAClouds (FP7-318484)
 ******************************************************************************/
package polimi.deib.rsp_services.queries;

import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class SingleQueryDataServer extends ServerResource {

	@Put
	public void registerQuery(Representation rep){
		this.getResponse().setStatus(Status.SUCCESS_OK,"TODO: implement method to register new query");
		this.getResponse().setEntity("TODO: implement method to register new query", MediaType.TEXT_PLAIN);	
	}

	@Delete
	public void unregisterQuery(){
		this.getResponse().setStatus(Status.SUCCESS_OK,"TODO: implement method to unregister query");
		this.getResponse().setEntity("TODO: implement method to unregister query", MediaType.TEXT_PLAIN);	
	}

	@Post
	public void changeQueryStatus(Representation rep){
		this.getResponse().setStatus(Status.SUCCESS_OK,"TODO: implement method to change query status or add new observer");
		this.getResponse().setEntity("TODO: implement method to change query status or add new observer", MediaType.TEXT_PLAIN);
	}

	@Get
	public void getQueryInformations(){
		this.getResponse().setStatus(Status.SUCCESS_OK,"TODO: implement method to get information about specific query");
		this.getResponse().setEntity("TODO: implement method to get information about specific query", MediaType.TEXT_PLAIN);
	}
}
