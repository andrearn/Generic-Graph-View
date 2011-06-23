package org.eclipse.xtext.graphview.view.config;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class SelectDiagramConfigurationAction extends Action {

	@Inject
	private Provider<SelectDiagramConfigurationDialog> configurationDialogProvider;


	public SelectDiagramConfigurationAction() {
		setText("Config");
		setToolTipText("Select diagram configuration");
	}

	@Inject
	protected void setImages(PluginImageHelper pluginImageHelper) {
		setImageDescriptor(ImageDescriptor.createFromImage(pluginImageHelper
				.getImage("elcl16/configure.gif")));
	}

	@Override
	public void run() {
		SelectDiagramConfigurationDialog configurationDialog = configurationDialogProvider
				.get();
		configurationDialog.open();
	}
}
