package ac4y.service.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CountResponse extends Ac4yServiceResponse {

	public CountResponse() {
		getAc4yIdentification().getTemplate().setGUID("CountResponse");
		//setAc4yIdentification(null);
	}

	protected int count = -2;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
