package ac4y.service.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FilenameRequest extends Ac4yServiceRequest {

	public FilenameRequest() {
		getAc4yIdentification().getTemplate().setGUID("FilenameRequest");
		//setAc4yIdentification(null);
	}

	public FilenameRequest(String filename) {
		this();
		setFilename(filename);
	}

	protected String filename;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}


}
