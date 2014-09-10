// Generated from logstash_conf.g4 by ANTLR 4.4

    package com.timelight.logstash.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link logstash_confParser}.
 */
public interface logstash_confListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull logstash_confParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull logstash_confParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull logstash_confParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull logstash_confParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#not_in_expression}.
	 * @param ctx the parse tree
	 */
	void enterNot_in_expression(@NotNull logstash_confParser.Not_in_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#not_in_expression}.
	 * @param ctx the parse tree
	 */
	void exitNot_in_expression(@NotNull logstash_confParser.Not_in_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#hashentries}.
	 * @param ctx the parse tree
	 */
	void enterHashentries(@NotNull logstash_confParser.HashentriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#hashentries}.
	 * @param ctx the parse tree
	 */
	void exitHashentries(@NotNull logstash_confParser.HashentriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull logstash_confParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull logstash_confParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#regexp_expression}.
	 * @param ctx the parse tree
	 */
	void enterRegexp_expression(@NotNull logstash_confParser.Regexp_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#regexp_expression}.
	 * @param ctx the parse tree
	 */
	void exitRegexp_expression(@NotNull logstash_confParser.Regexp_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#plugin_section}.
	 * @param ctx the parse tree
	 */
	void enterPlugin_section(@NotNull logstash_confParser.Plugin_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#plugin_section}.
	 * @param ctx the parse tree
	 */
	void exitPlugin_section(@NotNull logstash_confParser.Plugin_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#plugin}.
	 * @param ctx the parse tree
	 */
	void enterPlugin(@NotNull logstash_confParser.PluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#plugin}.
	 * @param ctx the parse tree
	 */
	void exitPlugin(@NotNull logstash_confParser.PluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#not_in_operator}.
	 * @param ctx the parse tree
	 */
	void enterNot_in_operator(@NotNull logstash_confParser.Not_in_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#not_in_operator}.
	 * @param ctx the parse tree
	 */
	void exitNot_in_operator(@NotNull logstash_confParser.Not_in_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#selector_element}.
	 * @param ctx the parse tree
	 */
	void enterSelector_element(@NotNull logstash_confParser.Selector_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#selector_element}.
	 * @param ctx the parse tree
	 */
	void exitSelector_element(@NotNull logstash_confParser.Selector_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#r_else}.
	 * @param ctx the parse tree
	 */
	void enterR_else(@NotNull logstash_confParser.R_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#r_else}.
	 * @param ctx the parse tree
	 */
	void exitR_else(@NotNull logstash_confParser.R_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull logstash_confParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull logstash_confParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#plugin_type}.
	 * @param ctx the parse tree
	 */
	void enterPlugin_type(@NotNull logstash_confParser.Plugin_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#plugin_type}.
	 * @param ctx the parse tree
	 */
	void exitPlugin_type(@NotNull logstash_confParser.Plugin_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull logstash_confParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull logstash_confParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(@NotNull logstash_confParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(@NotNull logstash_confParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(@NotNull logstash_confParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(@NotNull logstash_confParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#filler}.
	 * @param ctx the parse tree
	 */
	void enterFiller(@NotNull logstash_confParser.FillerContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#filler}.
	 * @param ctx the parse tree
	 */
	void exitFiller(@NotNull logstash_confParser.FillerContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#branch_or_plugin}.
	 * @param ctx the parse tree
	 */
	void enterBranch_or_plugin(@NotNull logstash_confParser.Branch_or_pluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#branch_or_plugin}.
	 * @param ctx the parse tree
	 */
	void exitBranch_or_plugin(@NotNull logstash_confParser.Branch_or_pluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#compare_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare_expression(@NotNull logstash_confParser.Compare_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#compare_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare_expression(@NotNull logstash_confParser.Compare_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#in_expression}.
	 * @param ctx the parse tree
	 */
	void enterIn_expression(@NotNull logstash_confParser.In_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#in_expression}.
	 * @param ctx the parse tree
	 */
	void exitIn_expression(@NotNull logstash_confParser.In_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull logstash_confParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull logstash_confParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#hash}.
	 * @param ctx the parse tree
	 */
	void enterHash(@NotNull logstash_confParser.HashContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#hash}.
	 * @param ctx the parse tree
	 */
	void exitHash(@NotNull logstash_confParser.HashContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#r_if}.
	 * @param ctx the parse tree
	 */
	void enterR_if(@NotNull logstash_confParser.R_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#r_if}.
	 * @param ctx the parse tree
	 */
	void exitR_if(@NotNull logstash_confParser.R_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#regexp_operator}.
	 * @param ctx the parse tree
	 */
	void enterRegexp_operator(@NotNull logstash_confParser.Regexp_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#regexp_operator}.
	 * @param ctx the parse tree
	 */
	void exitRegexp_operator(@NotNull logstash_confParser.Regexp_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#negative_expression}.
	 * @param ctx the parse tree
	 */
	void enterNegative_expression(@NotNull logstash_confParser.Negative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#negative_expression}.
	 * @param ctx the parse tree
	 */
	void exitNegative_expression(@NotNull logstash_confParser.Negative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(@NotNull logstash_confParser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(@NotNull logstash_confParser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#hashentry}.
	 * @param ctx the parse tree
	 */
	void enterHashentry(@NotNull logstash_confParser.HashentryContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#hashentry}.
	 * @param ctx the parse tree
	 */
	void exitHashentry(@NotNull logstash_confParser.HashentryContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#compare_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompare_operator(@NotNull logstash_confParser.Compare_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#compare_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompare_operator(@NotNull logstash_confParser.Compare_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull logstash_confParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull logstash_confParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(@NotNull logstash_confParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(@NotNull logstash_confParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#single_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quoted_string(@NotNull logstash_confParser.Single_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#single_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quoted_string(@NotNull logstash_confParser.Single_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#in_operator}.
	 * @param ctx the parse tree
	 */
	void enterIn_operator(@NotNull logstash_confParser.In_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#in_operator}.
	 * @param ctx the parse tree
	 */
	void exitIn_operator(@NotNull logstash_confParser.In_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull logstash_confParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull logstash_confParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(@NotNull logstash_confParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(@NotNull logstash_confParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(@NotNull logstash_confParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(@NotNull logstash_confParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull logstash_confParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull logstash_confParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(@NotNull logstash_confParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(@NotNull logstash_confParser.RegexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#boolean_operator}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_operator(@NotNull logstash_confParser.Boolean_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#boolean_operator}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_operator(@NotNull logstash_confParser.Boolean_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link logstash_confParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull logstash_confParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link logstash_confParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull logstash_confParser.ArrayContext ctx);
}