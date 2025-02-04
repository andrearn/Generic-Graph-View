/*
 * generated by Xtext 2.23.0
 */
package org.eclipse.xtext.graphview.map.tests

import com.google.inject.Inject
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(GraphViewMappingInjectorProvider)
class GraphViewMappingParsingTest {
	@Inject
	ParseHelper<DiagramMapping> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
}
