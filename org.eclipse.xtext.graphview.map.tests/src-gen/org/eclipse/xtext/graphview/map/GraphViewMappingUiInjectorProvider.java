/*
 * generated by Xtext
 */
package org.eclipse.xtext.graphview.map;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class GraphViewMappingUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.eclipse.xtext.graphview.map.ui.internal.GraphViewMappingActivator.getInstance().getInjector("org.eclipse.xtext.graphview.map.GraphViewMapping");
	}
	
}
