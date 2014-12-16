/*
 * generated by Xtext
 */
package org.kermeta.language.sample.cellularautomata.rules.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.kermeta.language.sample.cellularautomata.rules.ui.internal.InitActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class InitExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return InitActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return InitActivator.getInstance().getInjector(InitActivator.ORG_KERMETA_LANGUAGE_SAMPLE_CELLULARAUTOMATA_RULES_INIT);
	}
	
}
