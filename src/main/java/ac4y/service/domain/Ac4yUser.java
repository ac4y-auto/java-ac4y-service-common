package ac4y.service.domain;

import ac4y.service.domain.generated.GAc4yUser;

public class Ac4yUser extends GAc4yUser {

	public Ac4yUser() {
		getAc4yIdentification().getTemplate().setGUID("Ac4yUser");
	}

}
