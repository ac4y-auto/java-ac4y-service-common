package ac4y.service.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PathRequest extends Ac4yServiceRequest {

	public PathRequest() {
		getAc4yIdentification().getTemplate().setGUID("PathRequest");
		//setAc4yIdentification(null);
	}

	public PathRequest(String path) {
		this();
		setPath(path);
	}

	protected String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}



}
