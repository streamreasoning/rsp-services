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
	/**
	 * Method to initialize the class that implements RDF_Stream_Processor_Interface Interface
	 */
	public void initialize();
	
	/**
	 * Method to get the RDFStream processor object
	 * @return RDFStream processor object
	 */
	public Object getRDFStreamProcessor();
	
	// RDF streams
	/**
	 * Method to register new stream in the RDFStream processor
	 * @param streamName name of the stream
	 * @return RDFStream object
	 */
	public Object registerStream(String streamName);
	
	/**
	 * Method to register new stream in the RDFStream processor
	 * @param stream RDFStream object
	 * @return RDFStream object
	 */
	public Object registerStream(Object stream);
	
	/**
	 * Method to unregister stream from the RDFStream processor
	 * @param streamName name of the stream
	 * @return RDFStream object
	 */
	public Object unregisterStream(String streamName);
	
	/**
	 * Method to unregister stream from the RDFStream processor
	 * @param stream RDFStream object
	 * @return object that represents the result of the operation
	 */
	public Object unregisterStream(Object stream);
	
	/**
	 * Method to get specific stream informations from the RDFStream processor
	 * @param streamName name of the stream
	 * @return object that represents the result of the operation
	 */
	public Object getStream(String streamName);

	//Continuous queries
	/**
	 * Method to register new query in the RDFStream processor
	 * @param queryBody body of the query 
	 * @return Continuous_Query_Interface object
	 * @throws Exception
	 */
	public Object registerQuery(String queryBody) throws Exception;
	
	/**
	 * Method to unregister a query from the RDFStream processor
	 * @param queryID unique ID of the query
	 * @return object that represents the result of the operation
	 */
	public Object unregisterQuery(String queryID);
	
	/**
	 * Method to get all queries from the RDFStream processor
	 * @return object that represents collection of Continuous_Query_Interface
	 */
	public Object getAllQueries();
	
	/**
	 * Method to stop query execution
	 * @param queryID unique ID of the query
	 * @return object that represents the result of the operation
	 */
	public Object stopQuery(String queryID);
	
	/**
	 * Method to start query execution
	 * @param queryID unique ID of the query
	 * @return object that represents the result of the operation
	 */
	public Object startQuery(String queryID);
	

}
