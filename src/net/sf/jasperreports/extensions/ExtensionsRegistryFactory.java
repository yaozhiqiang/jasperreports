/*
 * ============================================================================
 * GNU Lesser General Public License
 * ============================================================================
 *
 * JasperReports - Free Java report-generating library.
 * Copyright (C) 2001-2006 JasperSoft Corporation http://www.jaspersoft.com
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
 * 
 * JasperSoft Corporation
 * 303 Second Street, Suite 450 North
 * San Francisco, CA 94107
 * http://www.jaspersoft.com
 */
package net.sf.jasperreports.extensions;

import net.sf.jasperreports.engine.JRPropertiesMap;

/**
 * A factory of {@link ExtensionsRegistry} instance.
 * 
 * <p>
 * Such factories are used by
 * {@link DefaultExtensionsRegistry the default components registry} to
 * instantiate sub extensions registries.
 * 
 * @author Lucian Chirita (lucianc@users.sourceforge.net)
 * @version $Id$
 * @see DefaultExtensionsRegistry#PROPERTY_REGISTRY_FACTORY_PREFIX
 */
public interface ExtensionsRegistryFactory
{

	/**
	 * Instantiates an extensions registry.
	 * 
	 * @param registryId the ID of the registry to instantiate.
	 * The ID can be used to identify a set of properties to be used
	 * when instantiating the registry.
	 * @param properties the map of properties that can be used to configure
	 * the registry instantiation process
	 * @return an extensions registry
	 * @see DefaultExtensionsRegistry#PROPERTY_REGISTRY_PREFIX
	 */
	ExtensionsRegistry createRegistry(String registryId, 
			JRPropertiesMap properties);

}
