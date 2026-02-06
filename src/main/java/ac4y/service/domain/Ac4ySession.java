package ac4y.service.domain;

import ac4y.service.domain.generated.GAc4ySession;

public class Ac4ySession extends GAc4ySession {

	public Ac4ySession() {
		getAc4yIdentification().getTemplate().setGUID("Ac4ySession");
	}

}
