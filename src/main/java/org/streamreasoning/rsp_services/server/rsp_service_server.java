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
package org.streamreasoning.rsp_services.server;

import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Restlet;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;
import org.restlet.routing.Template;
import org.streamreasoning.rsp_services.configuration.Config;
import org.streamreasoning.rsp_services.observers.MultipleObserversDataServer;
import org.streamreasoning.rsp_services.observers.SingleObserverDataServer;
import org.streamreasoning.rsp_services.queries.MultipleQueriesDataServer;
import org.streamreasoning.rsp_services.queries.SingleQueryDataServer;
import org.streamreasoning.rsp_services.streams.MultipleStreamsDataServer;
import org.streamreasoning.rsp_services.streams.SingleStreamDataServer;

public class rsp_service_server extends Application{

	private static Component component;

	/*
	 * The implementation of this main method needs to call the method initialize  
	 * of a class that implements RDF_Stream_Processor_Interface interface
	 */
	public static void main(String[] args) throws Exception{
		
		component = new Component();
		component.getServers().add(Protocol.HTTP, Config.getInstance().getServerPort());
		component.getClients().add(Protocol.FILE);  

		rsp_service_server csparqlServer = new rsp_service_server();
		component.getDefaultHost().attach("", csparqlServer);
		
		component.start();

	}

	public Restlet createInboundRoot(){

		Router router = new Router(getContext());
		router.setDefaultMatchingMode(Template.MODE_EQUALS);

		router.attach("/streams", MultipleStreamsDataServer.class);
		router.attach("/streams/{streamname}", SingleStreamDataServer.class);
		router.attach("/queries", MultipleQueriesDataServer.class);
		router.attach("/queries/{queryname}", SingleQueryDataServer.class);
		router.attach("/queries/{queryname}/observers", MultipleObserversDataServer.class);
		router.attach("/queries/{queryname}/observers/{id}", SingleObserverDataServer.class);

		return router;
	}

}
