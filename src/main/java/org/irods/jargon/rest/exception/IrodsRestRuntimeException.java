/**
 * 
 */
package org.irods.jargon.rest.exception;

import org.irods.jargon.core.exception.JargonRuntimeException;

/**
 * General REST runtime exception
 * 
 * @author Mike Conway - DICE
 *
 */
public class IrodsRestRuntimeException extends JargonRuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1507966468925924341L;

	public IrodsRestRuntimeException() {
		super();
	}

	public IrodsRestRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public IrodsRestRuntimeException(String message) {
		super(message);
	}

	public IrodsRestRuntimeException(Throwable cause) {
		super(cause);
	}

}
