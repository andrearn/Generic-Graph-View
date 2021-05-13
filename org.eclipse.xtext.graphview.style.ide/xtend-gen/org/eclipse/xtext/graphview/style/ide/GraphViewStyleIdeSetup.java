/**
 * generated by Xtext 2.23.0
 */
package org.eclipse.xtext.graphview.style.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.graphview.style.GraphViewStyleRuntimeModule;
import org.eclipse.xtext.graphview.style.GraphViewStyleStandaloneSetup;
import org.eclipse.xtext.graphview.style.ide.GraphViewStyleIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class GraphViewStyleIdeSetup extends GraphViewStyleStandaloneSetup {
  @Override
  public Injector createInjector() {
    GraphViewStyleRuntimeModule _graphViewStyleRuntimeModule = new GraphViewStyleRuntimeModule();
    GraphViewStyleIdeModule _graphViewStyleIdeModule = new GraphViewStyleIdeModule();
    return Guice.createInjector(Modules2.mixin(_graphViewStyleRuntimeModule, _graphViewStyleIdeModule));
  }
}
