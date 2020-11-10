// Generated from C:/Users/moren/ITC/Noveno Semestre/Compiladores/Proyecto_compiladores/src\gramatica.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(gramaticaParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(gramaticaParser.SchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(gramaticaParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(gramaticaParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#inputTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInputTypeDefinition(gramaticaParser.InputTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#inputTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInputTypeDefinition(gramaticaParser.InputTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(gramaticaParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(gramaticaParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDefinition(gramaticaParser.InterfaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDefinition(gramaticaParser.InterfaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#unionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterUnionDefinition(gramaticaParser.UnionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#unionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitUnionDefinition(gramaticaParser.UnionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#interfaceImplementation}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceImplementation(gramaticaParser.InterfaceImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#interfaceImplementation}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceImplementation(gramaticaParser.InterfaceImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fieldDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinitions(gramaticaParser.FieldDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fieldDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinitions(gramaticaParser.FieldDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(gramaticaParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(gramaticaParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#enumFields}.
	 * @param ctx the parse tree
	 */
	void enterEnumFields(gramaticaParser.EnumFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#enumFields}.
	 * @param ctx the parse tree
	 */
	void exitEnumFields(gramaticaParser.EnumFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(gramaticaParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(gramaticaParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(gramaticaParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(gramaticaParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operationDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOperationDefinition(gramaticaParser.OperationDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operationDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOperationDefinition(gramaticaParser.OperationDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#namedOperationDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamedOperationDefinition(gramaticaParser.NamedOperationDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#namedOperationDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamedOperationDefinition(gramaticaParser.NamedOperationDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operationType}.
	 * @param ctx the parse tree
	 */
	void enterOperationType(gramaticaParser.OperationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operationType}.
	 * @param ctx the parse tree
	 */
	void exitOperationType(gramaticaParser.OperationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#variableDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinitions(gramaticaParser.VariableDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#variableDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinitions(gramaticaParser.VariableDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(gramaticaParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(gramaticaParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(gramaticaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(gramaticaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(gramaticaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(gramaticaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(gramaticaParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(gramaticaParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#namedType}.
	 * @param ctx the parse tree
	 */
	void enterNamedType(gramaticaParser.NamedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#namedType}.
	 * @param ctx the parse tree
	 */
	void exitNamedType(gramaticaParser.NamedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(gramaticaParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(gramaticaParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#nonNullNamedType}.
	 * @param ctx the parse tree
	 */
	void enterNonNullNamedType(gramaticaParser.NonNullNamedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#nonNullNamedType}.
	 * @param ctx the parse tree
	 */
	void exitNonNullNamedType(gramaticaParser.NonNullNamedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#nonNullListType}.
	 * @param ctx the parse tree
	 */
	void enterNonNullListType(gramaticaParser.NonNullListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#nonNullListType}.
	 * @param ctx the parse tree
	 */
	void exitNonNullListType(gramaticaParser.NonNullListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#selectionSet}.
	 * @param ctx the parse tree
	 */
	void enterSelectionSet(gramaticaParser.SelectionSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#selectionSet}.
	 * @param ctx the parse tree
	 */
	void exitSelectionSet(gramaticaParser.SelectionSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(gramaticaParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(gramaticaParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(gramaticaParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(gramaticaParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(gramaticaParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(gramaticaParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fragmentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFragmentDefinition(gramaticaParser.FragmentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fragmentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFragmentDefinition(gramaticaParser.FragmentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fragmentSpread}.
	 * @param ctx the parse tree
	 */
	void enterFragmentSpread(gramaticaParser.FragmentSpreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fragmentSpread}.
	 * @param ctx the parse tree
	 */
	void exitFragmentSpread(gramaticaParser.FragmentSpreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#inlineFragment}.
	 * @param ctx the parse tree
	 */
	void enterInlineFragment(gramaticaParser.InlineFragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#inlineFragment}.
	 * @param ctx the parse tree
	 */
	void exitInlineFragment(gramaticaParser.InlineFragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fragmentName}.
	 * @param ctx the parse tree
	 */
	void enterFragmentName(gramaticaParser.FragmentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fragmentName}.
	 * @param ctx the parse tree
	 */
	void exitFragmentName(gramaticaParser.FragmentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#typeCondition}.
	 * @param ctx the parse tree
	 */
	void enterTypeCondition(gramaticaParser.TypeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typeCondition}.
	 * @param ctx the parse tree
	 */
	void exitTypeCondition(gramaticaParser.TypeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#directives}.
	 * @param ctx the parse tree
	 */
	void enterDirectives(gramaticaParser.DirectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#directives}.
	 * @param ctx the parse tree
	 */
	void exitDirectives(gramaticaParser.DirectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(gramaticaParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(gramaticaParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(gramaticaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(gramaticaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(gramaticaParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(gramaticaParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gramaticaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gramaticaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(gramaticaParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(gramaticaParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listValue}.
	 * @param ctx the parse tree
	 */
	void enterListValue(gramaticaParser.ListValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listValue}.
	 * @param ctx the parse tree
	 */
	void exitListValue(gramaticaParser.ListValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#objectValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(gramaticaParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#objectValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(gramaticaParser.ObjectValueContext ctx);
}