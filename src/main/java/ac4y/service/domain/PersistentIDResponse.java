package ac4y.service.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersistentIDResponse extends Ac4yServiceResponse {

	public PersistentIDResponse() {
		getAc4yIdentification().getTemplate().setGUID("PersistentIDResponse");
		//setAc4yIdentification(null);
	}

	protected int persistentID;

	public int getPersistentID() {
		return persistentID;
	}

	public void setPersistentID(int persistentID) {
		this.persistentID = persistentID;
	}

}
