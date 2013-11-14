package org.streamreasoning.rsp_services.interfaces;

import org.streamreasoning.rsp_services.commons.Rsp_services_Component_Status;

public interface Continuous_Query_Interface {
		
	public Object addObserver(Object observer);
	public Object removeObserver(Object observerID);
	public void setQueryID(String queryID);
	public String getQueryID();
	public void setQueryBody(String queryBody);
	public String getQueryBody();
	public void changeQueryStatus(Rsp_services_Component_Status newStatus);
	public Rsp_services_Component_Status getQueryStatus();

}
