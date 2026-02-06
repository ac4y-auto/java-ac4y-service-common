package ac4y.service.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FloatResultResponse extends Ac4yServiceResponse {

	public FloatResultResponse() {
		getAc4yIdentification().getTemplate().setGUID("FloatResultResponse");
		//setAc4yIdentification(null);
	}
	
	protected float result;

	public float getValue() {
		return result;
	}

	public void setValue(float result) {
		this.result = result;
	}

	
}
