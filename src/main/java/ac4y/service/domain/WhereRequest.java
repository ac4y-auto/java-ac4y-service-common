package ac4y.service.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WhereRequest extends Ac4yServiceRequest {
	
	public WhereRequest() {
		getAc4yIdentification().getTemplate().setGUID("WhereRequest");
		//setAc4yIdentification(null);
	}

	public WhereRequest(String aWhere) {
		this(); 
		setWhere(aWhere);
	}

	protected String where;

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	} 
	
}
