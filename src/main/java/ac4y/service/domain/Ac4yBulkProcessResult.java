package ac4y.service.domain;

import ac4y.base.domain.Ac4yNoId;

public class Ac4yBulkProcessResult extends Ac4yNoId {

	public Ac4yBulkProcessResult(){
		
	}
	
	public Ac4yBulkProcessResult(
			int total
			,int success
			,int failed
			,int nothingHappend
			) {

		setTotal(total);
		setSuccess(success);
		setFailed(failed);
		setNothingHappend(nothingHappend);

	}
	
	public int getSuccess() {
		return success;
	}
	
	public void setSuccess(int success) {
		this.success = success;
	}
	
	public int getFailed() {
		return failed;
	}
	
	public void setFailed(int failed) {
		this.failed = failed;
	}
	

	public int getNothingHappend() {
		return nothingHappend;
	}

	public void setNothingHappend(int nothingHappend) {
		this.nothingHappend = nothingHappend;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	protected int total = 0;
	protected int success = 0;
	protected int failed = 0;
	protected int nothingHappend = 0;

	public void cummulate(Ac4yServiceResponse aAc4yResponse) {
		
		setTotal(getTotal()+1);
		
		if (aAc4yResponse.itWasSuccessful())
			setSuccess(getSuccess()+1);
		else
			if (aAc4yResponse.itWasFailed())
			setFailed(getFailed()+1);
		else
			if (aAc4yResponse.itWasNothingToDo())
			setNothingHappend(getNothingHappend()+1);
		
	} // cummulate

	public void cummulate(Ac4yBulkProcessResult aAc4yBulkProcessResult) {
		
		setTotal(getTotal()+aAc4yBulkProcessResult.getTotal());
		setSuccess(getSuccess()+aAc4yBulkProcessResult.getSuccess());
		setFailed(getFailed()+aAc4yBulkProcessResult.getFailed());
		setNothingHappend(getNothingHappend()+aAc4yBulkProcessResult.getNothingHappend());
		
	} // cummulate
	
}