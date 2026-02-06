package ac4y.service.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ByPersistentIDRequest extends Ac4yServiceRequest {
	
	public ByPersistentIDRequest() {
		getAc4yIdentification().getTemplate().setGUID("ByPersistentIDRequest");
		//setAc4yIdentification(null);
	}

	public ByPersistentIDRequest(int aPersistentID) {
		this(); 
		setPersistentID(aPersistentID);
	}

	public int getPersistentID() {
		return persistentID;
	}

	public void setPersistentID(int persistentID) {
		this.persistentID = persistentID;
	}

	protected int persistentID;

}
