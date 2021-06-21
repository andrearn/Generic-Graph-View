/*
 * generated by Xtext
 */
package org.eclipse.xtext.graphview.map.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.graphview.map.services.GraphViewMappingGrammarAccess;

public class GraphViewMappingParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private GraphViewMappingGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.xtext.graphview.map.parser.antlr.internal.InternalGraphViewMappingParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.graphview.map.parser.antlr.internal.InternalGraphViewMappingParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "DiagramMapping";
	}
	
	public GraphViewMappingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GraphViewMappingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
