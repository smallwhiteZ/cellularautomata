/*
* generated by Xtext
*/
package org.kermeta.language.sample.cellularautomata.rules.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.kermeta.language.sample.cellularautomata.rules.services.CoreGrammarAccess;

@Singleton
public class InitGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class CellularAutomataInitializationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CellularAutomataInitialization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCellularAutomataInitializationAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cGeometryAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cGeometryRegularGeometryParserRuleCall_1_0 = (RuleCall)cGeometryAssignment_1.eContents().get(0);
		private final Assignment cSeedRulesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSeedRulesRuleParserRuleCall_2_0 = (RuleCall)cSeedRulesAssignment_2.eContents().get(0);
		private final Assignment cSeedRulesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSeedRulesRuleParserRuleCall_3_0 = (RuleCall)cSeedRulesAssignment_3.eContents().get(0);
		
		/// **
		// * Root for Init
		// * / CellularAutomataInitialization:
		//	{CellularAutomataInitialization} geometry=RegularGeometry? seedRules+=Rule seedRules+=Rule*;
		public ParserRule getRule() { return rule; }

		//{CellularAutomataInitialization} geometry=RegularGeometry? seedRules+=Rule seedRules+=Rule*
		public Group getGroup() { return cGroup; }

		//{CellularAutomataInitialization}
		public Action getCellularAutomataInitializationAction_0() { return cCellularAutomataInitializationAction_0; }

		//geometry=RegularGeometry?
		public Assignment getGeometryAssignment_1() { return cGeometryAssignment_1; }

		//RegularGeometry
		public RuleCall getGeometryRegularGeometryParserRuleCall_1_0() { return cGeometryRegularGeometryParserRuleCall_1_0; }

		//seedRules+=Rule
		public Assignment getSeedRulesAssignment_2() { return cSeedRulesAssignment_2; }

		//Rule
		public RuleCall getSeedRulesRuleParserRuleCall_2_0() { return cSeedRulesRuleParserRuleCall_2_0; }

		//seedRules+=Rule*
		public Assignment getSeedRulesAssignment_3() { return cSeedRulesAssignment_3; }

		//Rule
		public RuleCall getSeedRulesRuleParserRuleCall_3_0() { return cSeedRulesRuleParserRuleCall_3_0; }
	}

	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInitKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFilterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFilterCoordinateRangesParserRuleCall_1_0 = (RuleCall)cFilterAssignment_1.eContents().get(0);
		private final Keyword cByKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEvaluatedValAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEvaluatedValConditionalParserRuleCall_4_0 = (RuleCall)cEvaluatedValAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		/// **
		// * From Init
		// * / Rule returns core::Rule:
		//	"init" filter=CoordinateRanges? "by" "{" evaluatedVal=Conditional "}";
		public ParserRule getRule() { return rule; }

		//"init" filter=CoordinateRanges? "by" "{" evaluatedVal=Conditional "}"
		public Group getGroup() { return cGroup; }

		//"init"
		public Keyword getInitKeyword_0() { return cInitKeyword_0; }

		//filter=CoordinateRanges?
		public Assignment getFilterAssignment_1() { return cFilterAssignment_1; }

		//CoordinateRanges
		public RuleCall getFilterCoordinateRangesParserRuleCall_1_0() { return cFilterCoordinateRangesParserRuleCall_1_0; }

		//"by"
		public Keyword getByKeyword_2() { return cByKeyword_2; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//evaluatedVal=Conditional
		public Assignment getEvaluatedValAssignment_4() { return cEvaluatedValAssignment_4; }

		//Conditional
		public RuleCall getEvaluatedValConditionalParserRuleCall_4_0() { return cEvaluatedValConditionalParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class CoordinateRangesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CoordinateRanges");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCoordinateRangesAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cCoordinateRangesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCoordinateRangesCoordinateRangeParserRuleCall_1_0 = (RuleCall)cCoordinateRangesAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cCoordinateRangesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cCoordinateRangesCoordinateRangeParserRuleCall_2_1_0 = (RuleCall)cCoordinateRangesAssignment_2_1.eContents().get(0);
		
		//CoordinateRanges:
		//	{CoordinateRanges} coordinateRanges+=CoordinateRange ("," coordinateRanges+=CoordinateRange)*;
		public ParserRule getRule() { return rule; }

		//{CoordinateRanges} coordinateRanges+=CoordinateRange ("," coordinateRanges+=CoordinateRange)*
		public Group getGroup() { return cGroup; }

		//{CoordinateRanges}
		public Action getCoordinateRangesAction_0() { return cCoordinateRangesAction_0; }

		//coordinateRanges+=CoordinateRange
		public Assignment getCoordinateRangesAssignment_1() { return cCoordinateRangesAssignment_1; }

		//CoordinateRange
		public RuleCall getCoordinateRangesCoordinateRangeParserRuleCall_1_0() { return cCoordinateRangesCoordinateRangeParserRuleCall_1_0; }

		//("," coordinateRanges+=CoordinateRange)*
		public Group getGroup_2() { return cGroup_2; }

		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }

		//coordinateRanges+=CoordinateRange
		public Assignment getCoordinateRangesAssignment_2_1() { return cCoordinateRangesAssignment_2_1; }

		//CoordinateRange
		public RuleCall getCoordinateRangesCoordinateRangeParserRuleCall_2_1_0() { return cCoordinateRangesCoordinateRangeParserRuleCall_2_1_0; }
	}

	public class CoordinateRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CoordinateRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDimensionRangesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDimensionRangesDimensionRangeParserRuleCall_1_0 = (RuleCall)cDimensionRangesAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDimensionRangesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDimensionRangesDimensionRangeParserRuleCall_3_0 = (RuleCall)cDimensionRangesAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CoordinateRange:
		//	"(" dimensionRanges+=DimensionRange "," dimensionRanges+=DimensionRange ")";
		public ParserRule getRule() { return rule; }

		//"(" dimensionRanges+=DimensionRange "," dimensionRanges+=DimensionRange ")"
		public Group getGroup() { return cGroup; }

		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }

		//dimensionRanges+=DimensionRange
		public Assignment getDimensionRangesAssignment_1() { return cDimensionRangesAssignment_1; }

		//DimensionRange
		public RuleCall getDimensionRangesDimensionRangeParserRuleCall_1_0() { return cDimensionRangesDimensionRangeParserRuleCall_1_0; }

		//","
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }

		//dimensionRanges+=DimensionRange
		public Assignment getDimensionRangesAssignment_3() { return cDimensionRangesAssignment_3; }

		//DimensionRange
		public RuleCall getDimensionRangesDimensionRangeParserRuleCall_3_0() { return cDimensionRangesDimensionRangeParserRuleCall_3_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class DimensionRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DimensionRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLowerAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLowerEIntParserRuleCall_0_0 = (RuleCall)cLowerAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cUpperAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cUpperEIntParserRuleCall_1_1_0 = (RuleCall)cUpperAssignment_1_1.eContents().get(0);
		
		//DimensionRange:
		//	lower=EInt (".." upper=EInt)?;
		public ParserRule getRule() { return rule; }

		//lower=EInt (".." upper=EInt)?
		public Group getGroup() { return cGroup; }

		//lower=EInt
		public Assignment getLowerAssignment_0() { return cLowerAssignment_0; }

		//EInt
		public RuleCall getLowerEIntParserRuleCall_0_0() { return cLowerEIntParserRuleCall_0_0; }

		//(".." upper=EInt)?
		public Group getGroup_1() { return cGroup_1; }

		//".."
		public Keyword getFullStopFullStopKeyword_1_0() { return cFullStopFullStopKeyword_1_0; }

		//upper=EInt
		public Assignment getUpperAssignment_1_1() { return cUpperAssignment_1_1; }

		//EInt
		public RuleCall getUpperEIntParserRuleCall_1_1_0() { return cUpperEIntParserRuleCall_1_1_0; }
	}

	public class LiteralsExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LiteralsExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cConditionalParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final RuleCall cPositionLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cIntegerLiteralParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//LiteralsExpression returns core::IntegerExpression:
		//	"(" Conditional ")" | PositionLiteral | IntegerLiteral;
		public ParserRule getRule() { return rule; }

		//"(" Conditional ")" | PositionLiteral | IntegerLiteral
		public Alternatives getAlternatives() { return cAlternatives; }

		//"(" Conditional ")"
		public Group getGroup_0() { return cGroup_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }

		//Conditional
		public RuleCall getConditionalParserRuleCall_0_1() { return cConditionalParserRuleCall_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }

		//PositionLiteral
		public RuleCall getPositionLiteralParserRuleCall_1() { return cPositionLiteralParserRuleCall_1; }

		//IntegerLiteral
		public RuleCall getIntegerLiteralParserRuleCall_2() { return cIntegerLiteralParserRuleCall_2; }
	}

	public class PositionLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PositionLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPositionLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPositionOnKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDimensionIndexAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDimensionIndexEIntParserRuleCall_3_0 = (RuleCall)cDimensionIndexAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//PositionLiteral returns core::IntegerExpression:
		//	{PositionLiteral} "positionOn" "[" dimensionIndex=EInt "]";
		public ParserRule getRule() { return rule; }

		//{PositionLiteral} "positionOn" "[" dimensionIndex=EInt "]"
		public Group getGroup() { return cGroup; }

		//{PositionLiteral}
		public Action getPositionLiteralAction_0() { return cPositionLiteralAction_0; }

		//"positionOn"
		public Keyword getPositionOnKeyword_1() { return cPositionOnKeyword_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }

		//dimensionIndex=EInt
		public Assignment getDimensionIndexAssignment_3() { return cDimensionIndexAssignment_3; }

		//EInt
		public RuleCall getDimensionIndexEIntParserRuleCall_3_0() { return cDimensionIndexEIntParserRuleCall_3_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}

	public class RegularGeometryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RegularGeometry");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRegularGeometryAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRegularGeometryKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNeighborsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNeighborsNeighborhoodEnumRuleCall_2_0 = (RuleCall)cNeighborsAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDimensionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDimensionsDimensionParserRuleCall_4_0 = (RuleCall)cDimensionsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cXKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cDimensionsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cDimensionsDimensionParserRuleCall_5_1_0 = (RuleCall)cDimensionsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		/// **
		// * From Geometry
		// * / RegularGeometry:
		//	{RegularGeometry} "regularGeometry" neighbors=Neighborhood "{" dimensions+=Dimension ("x" dimensions+=Dimension)*
		//	"}";
		public ParserRule getRule() { return rule; }

		//{RegularGeometry} "regularGeometry" neighbors=Neighborhood "{" dimensions+=Dimension ("x" dimensions+=Dimension)* "}"
		public Group getGroup() { return cGroup; }

		//{RegularGeometry}
		public Action getRegularGeometryAction_0() { return cRegularGeometryAction_0; }

		//"regularGeometry"
		public Keyword getRegularGeometryKeyword_1() { return cRegularGeometryKeyword_1; }

		//neighbors=Neighborhood
		public Assignment getNeighborsAssignment_2() { return cNeighborsAssignment_2; }

		//Neighborhood
		public RuleCall getNeighborsNeighborhoodEnumRuleCall_2_0() { return cNeighborsNeighborhoodEnumRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//dimensions+=Dimension
		public Assignment getDimensionsAssignment_4() { return cDimensionsAssignment_4; }

		//Dimension
		public RuleCall getDimensionsDimensionParserRuleCall_4_0() { return cDimensionsDimensionParserRuleCall_4_0; }

		//("x" dimensions+=Dimension)*
		public Group getGroup_5() { return cGroup_5; }

		//"x"
		public Keyword getXKeyword_5_0() { return cXKeyword_5_0; }

		//dimensions+=Dimension
		public Assignment getDimensionsAssignment_5_1() { return cDimensionsAssignment_5_1; }

		//Dimension
		public RuleCall getDimensionsDimensionParserRuleCall_5_1_0() { return cDimensionsDimensionParserRuleCall_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class DimensionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Dimension");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDimensionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cExtentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExtentEIntParserRuleCall_1_0 = (RuleCall)cExtentAssignment_1.eContents().get(0);
		private final Assignment cIsCircularAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cIsCircularCircularKeyword_2_0 = (Keyword)cIsCircularAssignment_2.eContents().get(0);
		
		//Dimension:
		//	{Dimension} extent=EInt isCircular?="circular"?;
		public ParserRule getRule() { return rule; }

		//{Dimension} extent=EInt isCircular?="circular"?
		public Group getGroup() { return cGroup; }

		//{Dimension}
		public Action getDimensionAction_0() { return cDimensionAction_0; }

		//extent=EInt
		public Assignment getExtentAssignment_1() { return cExtentAssignment_1; }

		//EInt
		public RuleCall getExtentEIntParserRuleCall_1_0() { return cExtentEIntParserRuleCall_1_0; }

		//isCircular?="circular"?
		public Assignment getIsCircularAssignment_2() { return cIsCircularAssignment_2; }

		//"circular"
		public Keyword getIsCircularCircularKeyword_2_0() { return cIsCircularCircularKeyword_2_0; }
	}
	
	
	public class NeighborhoodElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Neighborhood");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNeumannEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNeumannNeumannKeyword_0_0 = (Keyword)cNeumannEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMooreEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMooreMooreKeyword_1_0 = (Keyword)cMooreEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Neighborhood:
		//	Neumann | Moore;
		public EnumRule getRule() { return rule; }

		//Neumann | Moore
		public Alternatives getAlternatives() { return cAlternatives; }

		//Neumann
		public EnumLiteralDeclaration getNeumannEnumLiteralDeclaration_0() { return cNeumannEnumLiteralDeclaration_0; }

		//"Neumann"
		public Keyword getNeumannNeumannKeyword_0_0() { return cNeumannNeumannKeyword_0_0; }

		//Moore
		public EnumLiteralDeclaration getMooreEnumLiteralDeclaration_1() { return cMooreEnumLiteralDeclaration_1; }

		//"Moore"
		public Keyword getMooreMooreKeyword_1_0() { return cMooreMooreKeyword_1_0; }
	}
	
	private final CellularAutomataInitializationElements pCellularAutomataInitialization;
	private final RuleElements pRule;
	private final CoordinateRangesElements pCoordinateRanges;
	private final CoordinateRangeElements pCoordinateRange;
	private final DimensionRangeElements pDimensionRange;
	private final LiteralsExpressionElements pLiteralsExpression;
	private final PositionLiteralElements pPositionLiteral;
	private final RegularGeometryElements pRegularGeometry;
	private final DimensionElements pDimension;
	private final NeighborhoodElements unknownRuleNeighborhood;
	
	private final Grammar grammar;

	private final CoreGrammarAccess gaCore;

	@Inject
	public InitGrammarAccess(GrammarProvider grammarProvider,
		CoreGrammarAccess gaCore) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaCore = gaCore;
		this.pCellularAutomataInitialization = new CellularAutomataInitializationElements();
		this.pRule = new RuleElements();
		this.pCoordinateRanges = new CoordinateRangesElements();
		this.pCoordinateRange = new CoordinateRangeElements();
		this.pDimensionRange = new DimensionRangeElements();
		this.pLiteralsExpression = new LiteralsExpressionElements();
		this.pPositionLiteral = new PositionLiteralElements();
		this.pRegularGeometry = new RegularGeometryElements();
		this.pDimension = new DimensionElements();
		this.unknownRuleNeighborhood = new NeighborhoodElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.kermeta.language.sample.cellularautomata.rules.Init".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public CoreGrammarAccess getCoreGrammarAccess() {
		return gaCore;
	}

	
	/// **
	// * Root for Init
	// * / CellularAutomataInitialization:
	//	{CellularAutomataInitialization} geometry=RegularGeometry? seedRules+=Rule seedRules+=Rule*;
	public CellularAutomataInitializationElements getCellularAutomataInitializationAccess() {
		return pCellularAutomataInitialization;
	}
	
	public ParserRule getCellularAutomataInitializationRule() {
		return getCellularAutomataInitializationAccess().getRule();
	}

	/// **
	// * From Init
	// * / Rule returns core::Rule:
	//	"init" filter=CoordinateRanges? "by" "{" evaluatedVal=Conditional "}";
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}

	//CoordinateRanges:
	//	{CoordinateRanges} coordinateRanges+=CoordinateRange ("," coordinateRanges+=CoordinateRange)*;
	public CoordinateRangesElements getCoordinateRangesAccess() {
		return pCoordinateRanges;
	}
	
	public ParserRule getCoordinateRangesRule() {
		return getCoordinateRangesAccess().getRule();
	}

	//CoordinateRange:
	//	"(" dimensionRanges+=DimensionRange "," dimensionRanges+=DimensionRange ")";
	public CoordinateRangeElements getCoordinateRangeAccess() {
		return pCoordinateRange;
	}
	
	public ParserRule getCoordinateRangeRule() {
		return getCoordinateRangeAccess().getRule();
	}

	//DimensionRange:
	//	lower=EInt (".." upper=EInt)?;
	public DimensionRangeElements getDimensionRangeAccess() {
		return pDimensionRange;
	}
	
	public ParserRule getDimensionRangeRule() {
		return getDimensionRangeAccess().getRule();
	}

	//LiteralsExpression returns core::IntegerExpression:
	//	"(" Conditional ")" | PositionLiteral | IntegerLiteral;
	public LiteralsExpressionElements getLiteralsExpressionAccess() {
		return pLiteralsExpression;
	}
	
	public ParserRule getLiteralsExpressionRule() {
		return getLiteralsExpressionAccess().getRule();
	}

	//PositionLiteral returns core::IntegerExpression:
	//	{PositionLiteral} "positionOn" "[" dimensionIndex=EInt "]";
	public PositionLiteralElements getPositionLiteralAccess() {
		return pPositionLiteral;
	}
	
	public ParserRule getPositionLiteralRule() {
		return getPositionLiteralAccess().getRule();
	}

	/// **
	// * From Geometry
	// * / RegularGeometry:
	//	{RegularGeometry} "regularGeometry" neighbors=Neighborhood "{" dimensions+=Dimension ("x" dimensions+=Dimension)*
	//	"}";
	public RegularGeometryElements getRegularGeometryAccess() {
		return pRegularGeometry;
	}
	
	public ParserRule getRegularGeometryRule() {
		return getRegularGeometryAccess().getRule();
	}

	//Dimension:
	//	{Dimension} extent=EInt isCircular?="circular"?;
	public DimensionElements getDimensionAccess() {
		return pDimension;
	}
	
	public ParserRule getDimensionRule() {
		return getDimensionAccess().getRule();
	}

	//enum Neighborhood:
	//	Neumann | Moore;
	public NeighborhoodElements getNeighborhoodAccess() {
		return unknownRuleNeighborhood;
	}
	
	public EnumRule getNeighborhoodRule() {
		return getNeighborhoodAccess().getRule();
	}

	/// *
	// * Conditional
	// * / Conditional returns IntegerExpression:
	//	OrExpression | {Conditional} "if" condition=Conditional "{" ifTrueExpression=Conditional "}" "else" "{"
	//	ifFalseExpression=Conditional "}";
	public CoreGrammarAccess.ConditionalElements getConditionalAccess() {
		return gaCore.getConditionalAccess();
	}
	
	public ParserRule getConditionalRule() {
		return getConditionalAccess().getRule();
	}

	/// *
	// * Binary expressions
	// * / OrExpression returns IntegerExpression:
	//	AndExpression ({Or.left=current} "|" right=AndExpression)*;
	public CoreGrammarAccess.OrExpressionElements getOrExpressionAccess() {
		return gaCore.getOrExpressionAccess();
	}
	
	public ParserRule getOrExpressionRule() {
		return getOrExpressionAccess().getRule();
	}

	//AndExpression returns IntegerExpression:
	//	EqualExpression ({And.left=current} "&" right=EqualExpression)*;
	public CoreGrammarAccess.AndExpressionElements getAndExpressionAccess() {
		return gaCore.getAndExpressionAccess();
	}
	
	public ParserRule getAndExpressionRule() {
		return getAndExpressionAccess().getRule();
	}

	//EqualExpression returns IntegerExpression:
	//	ComparisonExpression ({Equal.left=current} "==" right=ComparisonExpression)*;
	public CoreGrammarAccess.EqualExpressionElements getEqualExpressionAccess() {
		return gaCore.getEqualExpressionAccess();
	}
	
	public ParserRule getEqualExpressionRule() {
		return getEqualExpressionAccess().getRule();
	}

	//ComparisonExpression returns IntegerExpression:
	//	AddExpression (({Greater.left=current} ">" | {Lower.left=current} "<") right=AddExpression)*;
	public CoreGrammarAccess.ComparisonExpressionElements getComparisonExpressionAccess() {
		return gaCore.getComparisonExpressionAccess();
	}
	
	public ParserRule getComparisonExpressionRule() {
		return getComparisonExpressionAccess().getRule();
	}

	//AddExpression returns IntegerExpression:
	//	MultExpression (({Add.left=current} "+" | {Minus.left=current} "-") right=MultExpression)*;
	public CoreGrammarAccess.AddExpressionElements getAddExpressionAccess() {
		return gaCore.getAddExpressionAccess();
	}
	
	public ParserRule getAddExpressionRule() {
		return getAddExpressionAccess().getRule();
	}

	//MultExpression returns IntegerExpression:
	//	UnaryExpression (({Mult.left=current} "*" | {Div.left=current} "/" | {Mod.left=current} "%") right=UnaryExpression)*;
	public CoreGrammarAccess.MultExpressionElements getMultExpressionAccess() {
		return gaCore.getMultExpressionAccess();
	}
	
	public ParserRule getMultExpressionRule() {
		return getMultExpressionAccess().getRule();
	}

	/// *
	// * Unary expressions
	// * / UnaryExpression returns IntegerExpression:
	//	LiteralsExpression | {Not} "!" target=LiteralsExpression | {UMinus} "-" target=LiteralsExpression;
	public CoreGrammarAccess.UnaryExpressionElements getUnaryExpressionAccess() {
		return gaCore.getUnaryExpressionAccess();
	}
	
	public ParserRule getUnaryExpressionRule() {
		return getUnaryExpressionAccess().getRule();
	}

	//IntegerLiteral:
	//	val=EInt;
	public CoreGrammarAccess.IntegerLiteralElements getIntegerLiteralAccess() {
		return gaCore.getIntegerLiteralAccess();
	}
	
	public ParserRule getIntegerLiteralRule() {
		return getIntegerLiteralAccess().getRule();
	}

	//EInt returns ecore::EInt:
	//	"-"? INT;
	public CoreGrammarAccess.EIntElements getEIntAccess() {
		return gaCore.getEIntAccess();
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaCore.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaCore.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaCore.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaCore.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaCore.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaCore.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaCore.getANY_OTHERRule();
	} 
}
