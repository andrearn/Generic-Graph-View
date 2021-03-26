/*
 * generated by Xtext 2.13.0
 */
package org.eclipse.xtext.graphview.map.ide

import com.google.inject.Guice
import org.eclipse.xtext.graphview.map.GraphViewMappingRuntimeModule
import org.eclipse.xtext.graphview.map.GraphViewMappingStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class GraphViewMappingIdeSetup extends GraphViewMappingStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new GraphViewMappingRuntimeModule, new GraphViewMappingIdeModule))
	}
	
}
