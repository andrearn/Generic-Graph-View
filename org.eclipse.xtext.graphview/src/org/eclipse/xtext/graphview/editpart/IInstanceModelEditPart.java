/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;

public interface IInstanceModelEditPart extends GraphicalEditPart {

	IFigure createDefaultFigure();

	AbstractInstance getModel();
	
	void setTransparent(boolean isTransparent);
	
}
