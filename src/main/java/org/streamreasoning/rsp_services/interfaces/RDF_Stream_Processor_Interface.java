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
