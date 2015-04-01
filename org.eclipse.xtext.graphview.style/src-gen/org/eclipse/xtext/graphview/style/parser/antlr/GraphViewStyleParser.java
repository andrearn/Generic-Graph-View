/*
 * generated by Xtext
 */
package org.eclipse.xtext.graphview.style.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.graphview.style.services.GraphViewStyleGrammarAccess;

public class GraphViewStyleParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private GraphViewStyleGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.xtext.graphview.style.parser.antlr.internal.InternalGraphViewStyleParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.graphview.style.parser.antlr.internal.InternalGraphViewStyleParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "StyleSheet";
	}
	
	public GraphViewStyleGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GraphViewStyleGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
