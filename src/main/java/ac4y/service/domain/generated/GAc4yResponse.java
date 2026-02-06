package ac4y.service.domain.generated;

import ac4y.base.domain.Ac4y;
import ac4y.base.domain.Ac4yNoId;

public class GAc4yResponse extends Ac4yNoId {

	/** 
	 * 
	 */
	protected String message;
	/**
	 * 
	 */
	protected String description;
	/**
	 * 
	 */
	protected String code;
	/**
	 *  
	 */
	protected String threadID;
	/**
	 * Getter of message
	 */
	public String getMessage() {
	 	 return message; 
	}
	/**
	 * Setter of message
	 */
	public void setMessage(String message) { 
		 this.message = message; 
	}
	/**
	 * Getter of description
	 */
	public String getDescription() {
	 	 return description; 
	}
	/**
	 * Setter of description
	 */
	public void setDescription(String description) { 
		 this.description = description; 
	}
	/**
	 * Getter of code
	 */
	public String getCode() {
	 	 return code; 
	}
	/**
	 * Setter of code
	 */
	public void setCode(String code) { 
		 this.code = code; 
	}
	/**
	 * Getter of threadID
	 */
	public String getThreadID() {
	 	 return threadID; 
	}
	/**
	 * Setter of threadID
	 */
	public void setThreadID(String threadID) { 
		 this.threadID = threadID; 
	} 

}
