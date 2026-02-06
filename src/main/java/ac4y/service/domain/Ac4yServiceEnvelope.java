package ac4y.service.domain;

import ac4y.service.domain.generated.GAc4yServiceEnvelope;

public class Ac4yServiceEnvelope extends GAc4yServiceEnvelope {

	public Ac4yServiceEnvelope(String aThreadID, String aService) {
		threadID = aThreadID;
		service = aService;
	}

}
