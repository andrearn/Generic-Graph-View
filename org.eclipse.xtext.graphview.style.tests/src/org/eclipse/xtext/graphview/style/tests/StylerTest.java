package org.eclipse.xtext.graphview.style.tests;

import javax.swing.JButton;

import org.eclipse.xtext.graphview.style.GraphViewStyleInjectorProvider;
import org.eclipse.xtext.graphview.style.Styler;
import org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(GraphViewStyleInjectorProvider.class)
public class StylerTest {

	@Inject
	private ParseHelper<StyleSheet> parseHelper;
	
	@Inject
	private Styler styler;
	
	/*
	@Test
	public void testStylerSimple() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("stylesheet s style myStyle as javax.swing.JButton { text = 'hugo' }");
		JButton jButton = new JButton();
		Assert.assertTrue(styler.style(jButton, styleSheet.getStyles().get(0)));
		Assert.assertEquals("hugo", jButton.getText());
	}
	
	@Test
	public void testStylerExpression() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("stylesheet s style myStyle as javax.swing.JButton { text = ('hugo' + 'egon').toFirstUpper }");
		JButton jButton = new JButton();
		Assert.assertTrue(styler.style(jButton, styleSheet.getStyles().get(0)));
		Assert.assertEquals("Hugoegon", jButton.getText());
	}

	@Test
	public void testStylerWrongType() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("stylesheet s style myStyle as java.lang.Object { text = 'hugo' }");
		JButton jButton = new JButton();
		Assert.assertFalse(styler.style(jButton, styleSheet.getStyles().get(0)));
		Assert.assertEquals("", jButton.getText());
	}

	@Test
	public void testStylerImport() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("import javax.swing.JButton stylesheet s style myStyle as JButton { text = 'hugo' }");
		JButton jButton = new JButton();
		Assert.assertTrue(styler.style(jButton, styleSheet.getStyles().get(0)));
		Assert.assertEquals("hugo", jButton.getText());
	}

	@Test
	public void testStylerWildcardImport() throws Exception {
		StyleSheet styleSheet = parseHelper.parse("import javax.swing.* stylesheet s style myStyle as JButton { text = 'hugo' }");
		JButton jButton = new JButton();
		Assert.assertTrue(styler.style(jButton, styleSheet.getStyles().get(0)));
		Assert.assertEquals("hugo", jButton.getText());
	}
    */
}
