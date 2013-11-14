package polimi.deib.rsp_services.interfaces;

public interface RDF_Stream_Processor_Interface {
	
	//RDF-stream-processor 
	public abstract void initialize();
	public abstract Object getRDFStreamProcessor();
	
	// RDF streams
	public abstract Object registerStream(String streamName);
	public abstract Object registerStream(Object stream);
	public abstract Object unregisterStream(String streamName);
	public abstract Object getStream(String streamName);

	//Continuous queries
	public abstract Object registerQuery(String queryBody) throws Exception;
	public abstract Object unregisterQuery(String queryID);
	public abstract Object getAllQueries();
	public abstract Object stopQuery(String queryID);
	public abstract Object startQuery(String queryID);
	

}
