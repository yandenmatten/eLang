/*
* generated by Xtext
*/
package ch.vorburger.el.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import ch.vorburger.el.services.ELGrammarAccess;

public class ELParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ELGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected ch.vorburger.el.parser.antlr.internal.InternalELParser createParser(XtextTokenStream stream) {
		return new ch.vorburger.el.parser.antlr.internal.InternalELParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "XExpression";
	}
	
	public ELGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ELGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}