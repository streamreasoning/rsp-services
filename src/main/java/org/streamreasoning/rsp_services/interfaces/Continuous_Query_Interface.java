package polimi.deib.rsp_services.interfaces;

import polimi.deib.rsp_services.commons.Rsp_services_Component_Status;

public interface Continuous_Query_Interface {
		
	public abstract Object addObserver(Object observer);
	public abstract Object removeObserver(Object observerID);
	public abstract void setQueryID(String queryID);
	public abstract String getQueryID();
	public abstract void setQueryBody(String queryBody);
	public abstract String getQueryBody();
	public abstract void changeQueryStatus(Rsp_services_Component_Status newStatus);
	public abstract Rsp_services_Component_Status getQueryStatus();

}
