package org.irods.jargon.rest.commands;

import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.rest.configuration.RestConfiguration;

/**
 * Factory for service functions (business logic behind REST service wrappers)
 *
 * @author Mike Conway - DICE (www.irods.org)
 *
 */
public interface ServiceFunctionFactory {

	/**
	 * @return the restConfiguration
	 */
	public abstract RestConfiguration getRestConfiguration();

	/**
	 * @param restConfiguration
	 *            the restConfiguration to set
	 */
	public abstract void setRestConfiguration(
			RestConfiguration restConfiguration);

	/**
	 * @return the irodsAccessObjectFactory
	 */
	public abstract IRODSAccessObjectFactory getIrodsAccessObjectFactory();

	/**
	 * @param irodsAccessObjectFactory
	 *            the irodsAccessObjectFactory to set
	 */
	public abstract void setIrodsAccessObjectFactory(
			IRODSAccessObjectFactory irodsAccessObjectFactory);

}