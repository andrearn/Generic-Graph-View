/*
 * generated by Xtext 2.23.0
 */
package org.eclipse.xtext.graphview.style


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GraphViewStyleStandaloneSetup extends GraphViewStyleStandaloneSetupGenerated {

	def static void doSetup() {
		new GraphViewStyleStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
