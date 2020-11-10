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
	 * Visit a parse tree produced by {@link gramaticaParser#executableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutableDefinition(gramaticaParser.ExecutableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operationDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationDefinition(gramaticaParser.OperationDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationType(gramaticaParser.OperationTypeContext ctx);
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
	 * Visit a parse tree produced by {@link gramaticaParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(gramaticaParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fragmentSpread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentSpread(gramaticaParser.FragmentSpreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fragmentDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentDefinition(gramaticaParser.FragmentDefinitionContext ctx);
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
	 * Visit a parse tree produced by {@link gramaticaParser#inlineFragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineFragment(gramaticaParser.InlineFragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(gramaticaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#intValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValue(gramaticaParser.IntValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#floatValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatValue(gramaticaParser.FloatValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(gramaticaParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#stringValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(gramaticaParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#nullValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValue(gramaticaParser.NullValueContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#objectField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectField(gramaticaParser.ObjectFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(gramaticaParser.VariableContext ctx);
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
	 * Visit a parse tree produced by {@link gramaticaParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(gramaticaParser.Type_Context ctx);
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
	 * Visit a parse tree produced by {@link gramaticaParser#typeSystemDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSystemDefinition(gramaticaParser.TypeSystemDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#typeSystemExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSystemExtension(gramaticaParser.TypeSystemExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#schemaDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaDefinition(gramaticaParser.SchemaDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#rootOperationTypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootOperationTypeDefinition(gramaticaParser.RootOperationTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#schemaExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaExtension(gramaticaParser.SchemaExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operationTypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationTypeDefinition(gramaticaParser.OperationTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(gramaticaParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(gramaticaParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#typeExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExtension(gramaticaParser.TypeExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#scalarTypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarTypeDefinition(gramaticaParser.ScalarTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#scalarTypeExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarTypeExtension(gramaticaParser.ScalarTypeExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#objectTypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeDefinition(gramaticaParser.ObjectTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#implementsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsInterfaces(gramaticaParser.ImplementsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fieldsDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsDefinition(gramaticaParser.FieldsDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDefinition(gramaticaParser.FieldDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#argumentsDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsDefinition(gramaticaParser.ArgumentsDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#inputValueDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputValueDefinition(gramaticaParser.InputValueDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#objectTypeExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeExtension(gramaticaParser.ObjectTypeExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#interfaceTypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeDefinition(gramaticaParser.InterfaceTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#interfaceTypeExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeExtension(gramaticaParser.InterfaceTypeExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#unionTypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionTypeDefinition(gramaticaParser.UnionTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionMemberTypes(gramaticaParser.UnionMemberTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#unionTypeExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionTypeExtension(gramaticaParser.UnionTypeExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#enumTypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumTypeDefinition(gramaticaParser.EnumTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#enumValuesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValuesDefinition(gramaticaParser.EnumValuesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#enumValueDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueDefinition(gramaticaParser.EnumValueDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#enumTypeExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumTypeExtension(gramaticaParser.EnumTypeExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#inputObjectTypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputObjectTypeDefinition(gramaticaParser.InputObjectTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#inputFieldsDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputFieldsDefinition(gramaticaParser.InputFieldsDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#inputObjectTypeExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputObjectTypeExtension(gramaticaParser.InputObjectTypeExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#directiveDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveDefinition(gramaticaParser.DirectiveDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#directiveLocations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveLocations(gramaticaParser.DirectiveLocationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#directiveLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveLocation(gramaticaParser.DirectiveLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#executableDirectiveLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutableDirectiveLocation(gramaticaParser.ExecutableDirectiveLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#typeSystemDirectiveLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSystemDirectiveLocation(gramaticaParser.TypeSystemDirectiveLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(gramaticaParser.NameContext ctx);
}