/**
 *
 */
package org.irods.jargon.rest.commands;

import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.rest.configuration.RestConfiguration;

/**
 * Factory that produces service functions (business logic behind REST service
 * wrappers)
 *
 * @author Mike Conway - DICE (www.irods.org)
 *
 */
public abstract class AbstractServiceFunctionFactoryImpl implements
		ServiceFunctionFactory {

	/**
	 * Required dependency on configuration
	 */
	private RestConfiguration restConfiguration;

	/**
	 * Required dependency
	 */
	private IRODSAccessObjectFactory irodsAccessObjectFactory;

	/**
	 *
	 */
	public AbstractServiceFunctionFactoryImpl() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.irods.jargon.rest.commands.ServiceFunctionFactory#getRestConfiguration
	 * ()
	 */
	@Override
	public RestConfiguration getRestConfiguration() {
		return restConfiguration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.irods.jargon.rest.commands.ServiceFunctionFactory#setRestConfiguration
	 * (org.irods.jargon.rest.configuration.RestConfiguration)
	 */
	@Override
	public void setRestConfiguration(final RestConfiguration restConfiguration) {
		this.restConfiguration = restConfiguration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon.rest.commands.ServiceFunctionFactory#
	 * getIrodsAccessObjectFactory()
	 */
	@Override
	public IRODSAccessObjectFactory getIrodsAccessObjectFactory() {
		return irodsAccessObjectFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon.rest.commands.ServiceFunctionFactory#
	 * setIrodsAccessObjectFactory
	 * (org.irods.jargon.core.pub.IRODSAccessObjectFactory)
	 */
	@Override
	public void setIrodsAccessObjectFactory(
			final IRODSAccessObjectFactory irodsAccessObjectFactory) {
		this.irodsAccessObjectFactory = irodsAccessObjectFactory;
	}

}
