/** 
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.graphview.map

import org.eclipse.xtext.graphview.map.imports.GVMImportsConfiguration
import org.eclipse.xtext.graphview.map.names.GVMIdentifiableSimpleNameProvider
import org.eclipse.xtext.graphview.map.names.GVMQualifiedNameProvider
import org.eclipse.xtext.graphview.map.types.GVMDefaultTypeResolver
import org.eclipse.xtext.graphview.map.types.GVMImplicitlyImportedFeatures
import org.eclipse.xtext.graphview.map.types.GVMTypeResolver
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider
import org.eclipse.xtext.xbase.imports.IImportsConfiguration
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures
import org.eclipse.xtext.xbase.typesystem.internal.DefaultBatchTypeResolver
import org.eclipse.xtext.xbase.typesystem.internal.DefaultReentrantTypeResolver

/** 
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
class GraphViewMappingRuntimeModule extends org.eclipse.xtext.graphview.map.AbstractGraphViewMappingRuntimeModule {
	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return GVMQualifiedNameProvider
	}

	override Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
		return GVMIdentifiableSimpleNameProvider
	}

	def Class<? extends DefaultReentrantTypeResolver> bindDefaultReentrantTypeResolver() {
		return GVMTypeResolver
	}

	def Class<? extends ImplicitlyImportedFeatures> bindImplicitlyImportedFeatures() {
		return GVMImplicitlyImportedFeatures
	}

	def Class<? extends IImportsConfiguration> bindIImportsConfiguration() {
		return GVMImportsConfiguration
	}

	def Class<? extends DefaultBatchTypeResolver> bindDefaultBatchTypeResolver() {
		return GVMDefaultTypeResolver
	}
}
