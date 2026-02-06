package ac4y.service.domain;

import ac4y.base.domain.Ac4y;

public class Ac4yServiceResponseCommon extends Ac4y { //GAc4yResponseCommon {

	protected  Ac4yServiceResponse ac4yResponse = new Ac4yServiceResponse();

	public Ac4yServiceResponse getAc4yResponse() {
		return ac4yResponse;
	}

	public void setAc4yResponse(Ac4yServiceResponse ac4yResponse) {
		this.ac4yResponse = ac4yResponse;
	}
	
}
