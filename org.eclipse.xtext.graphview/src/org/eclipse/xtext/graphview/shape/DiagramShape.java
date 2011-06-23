package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.swt.SWT;
import org.eclipse.xtext.graphview.layout.IAutoLayout;
import org.eclipse.xtext.graphview.layout.SpringAutoLayout;

public class DiagramShape extends FreeformLayer {

	private IAutoLayout autoLayoutManager;
	
	public DiagramShape() {
		setLayoutManager(new XYLayout());
		setFont(FontLiterals.font("Helvetica", 11, SWT.None));
		setAutoLayoutManager(new SpringAutoLayout());
	}

	public IAutoLayout getAutoLayoutManager() {
		return autoLayoutManager;
	}

	public void setAutoLayoutManager(IAutoLayout autoLayoutManager) {
		this.autoLayoutManager = autoLayoutManager;
	}
}
