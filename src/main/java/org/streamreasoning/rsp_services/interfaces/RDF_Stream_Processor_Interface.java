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

public interface RDF_Stream_Processor_Interface {
	
	//RDF-stream-processor 
	public void initialize();
	public Object getRDFStreamProcessor();
	
	// RDF streams
	public Object registerStream(String streamName);
	public Object registerStream(Object stream);
	public Object unregisterStream(String streamName);
	public Object unregisterStream(Object stream);
	public Object getStream(String streamName);

	//Continuous queries
	public Object registerQuery(String queryBody) throws Exception;
	public Object unregisterQuery(String queryID);
	public Object getAllQueries();
	public Object stopQuery(String queryID);
	public Object startQuery(String queryID);
	

}
