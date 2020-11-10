// Generated from C:/Users/moren/ITC/Noveno Semestre/Compiladores/Proyecto_compiladores/src\gramatica.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema(gramaticaParser.SchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(gramaticaParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#inputTypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputTypeDefinition(gramaticaParser.InputTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#enumDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefinition(gramaticaParser.EnumDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDefinition(gramaticaParser.InterfaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#unionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionDefinition(gramaticaParser.UnionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#interfaceImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceImplementation(gramaticaParser.InterfaceImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fieldDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDefinitions(gramaticaParser.FieldDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDefinition(gramaticaParser.FieldDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#enumFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumFields(gramaticaParser.EnumFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(gramaticaParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(gramaticaParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operationDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationDefinition(gramaticaParser.OperationDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#namedOperationDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedOperationDefinition(gramaticaParser.NamedOperationDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationType(gramaticaParser.OperationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#variableDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinitions(gramaticaParser.VariableDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(gramaticaParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(gramaticaParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(gramaticaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(gramaticaParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#namedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedType(gramaticaParser.NamedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(gramaticaParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#nonNullNamedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonNullNamedType(gramaticaParser.NonNullNamedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#nonNullListType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonNullListType(gramaticaParser.NonNullListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#selectionSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionSet(gramaticaParser.SelectionSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(gramaticaParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(gramaticaParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(gramaticaParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fragmentDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentDefinition(gramaticaParser.FragmentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fragmentSpread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentSpread(gramaticaParser.FragmentSpreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#inlineFragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineFragment(gramaticaParser.InlineFragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fragmentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentName(gramaticaParser.FragmentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#typeCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCondition(gramaticaParser.TypeConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectives(gramaticaParser.DirectivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(gramaticaParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(gramaticaParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(gramaticaParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(gramaticaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(gramaticaParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListValue(gramaticaParser.ListValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#objectValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(gramaticaParser.ObjectValueContext ctx);
}