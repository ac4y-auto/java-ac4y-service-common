package ac4y.service.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BulkProcessResponse extends Ac4yServiceResponseCommon {

	public BulkProcessResponse() {
		getAc4yIdentification().getTemplate().setGUID("BulkProcessResponse");
		//setAc4yIdentification(null);
	}

	protected Ac4yBulkProcessResult ac4yBulkProcessResult = new Ac4yBulkProcessResult();

	public Ac4yBulkProcessResult getAc4yBulkProcessResult() {
		return ac4yBulkProcessResult;
	}

	public void setAc4yBulkProcessResult(Ac4yBulkProcessResult ac4yBulkProcessResult) {
		this.ac4yBulkProcessResult = ac4yBulkProcessResult;
	} 
	
}