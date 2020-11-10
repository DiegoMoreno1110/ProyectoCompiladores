// Generated from C:/Users/moren/ITC/Noveno Semestre/Compiladores/Proyecto_compiladores/src\gramatica.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link gramaticaParser#executableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterExecutableDefinition(gramaticaParser.ExecutableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#executableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitExecutableDefinition(gramaticaParser.ExecutableDefinitionContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#intValue}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(gramaticaParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#intValue}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(gramaticaParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#floatValue}.
	 * @param ctx the parse tree
	 */
	void enterFloatValue(gramaticaParser.FloatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#floatValue}.
	 * @param ctx the parse tree
	 */
	void exitFloatValue(gramaticaParser.FloatValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(gramaticaParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(gramaticaParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(gramaticaParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(gramaticaParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#nullValue}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(gramaticaParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#nullValue}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(gramaticaParser.NullValueContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#objectField}.
	 * @param ctx the parse tree
	 */
	void enterObjectField(gramaticaParser.ObjectFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#objectField}.
	 * @param ctx the parse tree
	 */
	void exitObjectField(gramaticaParser.ObjectFieldContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(gramaticaParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(gramaticaParser.Type_Context ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#typeSystemDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeSystemDefinition(gramaticaParser.TypeSystemDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typeSystemDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeSystemDefinition(gramaticaParser.TypeSystemDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#typeSystemExtension}.
	 * @param ctx the parse tree
	 */
	void enterTypeSystemExtension(gramaticaParser.TypeSystemExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typeSystemExtension}.
	 * @param ctx the parse tree
	 */
	void exitTypeSystemExtension(gramaticaParser.TypeSystemExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#schemaDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDefinition(gramaticaParser.SchemaDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#schemaDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDefinition(gramaticaParser.SchemaDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#rootOperationTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterRootOperationTypeDefinition(gramaticaParser.RootOperationTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#rootOperationTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitRootOperationTypeDefinition(gramaticaParser.RootOperationTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#schemaExtension}.
	 * @param ctx the parse tree
	 */
	void enterSchemaExtension(gramaticaParser.SchemaExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#schemaExtension}.
	 * @param ctx the parse tree
	 */
	void exitSchemaExtension(gramaticaParser.SchemaExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operationTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOperationTypeDefinition(gramaticaParser.OperationTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operationTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOperationTypeDefinition(gramaticaParser.OperationTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(gramaticaParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(gramaticaParser.DescriptionContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#typeExtension}.
	 * @param ctx the parse tree
	 */
	void enterTypeExtension(gramaticaParser.TypeExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typeExtension}.
	 * @param ctx the parse tree
	 */
	void exitTypeExtension(gramaticaParser.TypeExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#scalarTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterScalarTypeDefinition(gramaticaParser.ScalarTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#scalarTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitScalarTypeDefinition(gramaticaParser.ScalarTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#scalarTypeExtension}.
	 * @param ctx the parse tree
	 */
	void enterScalarTypeExtension(gramaticaParser.ScalarTypeExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#scalarTypeExtension}.
	 * @param ctx the parse tree
	 */
	void exitScalarTypeExtension(gramaticaParser.ScalarTypeExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#objectTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeDefinition(gramaticaParser.ObjectTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#objectTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeDefinition(gramaticaParser.ObjectTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#implementsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterImplementsInterfaces(gramaticaParser.ImplementsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#implementsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitImplementsInterfaces(gramaticaParser.ImplementsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fieldsDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldsDefinition(gramaticaParser.FieldsDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fieldsDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldsDefinition(gramaticaParser.FieldsDefinitionContext ctx);
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
	 * Enter a parse tree produced by {@link gramaticaParser#argumentsDefinition}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsDefinition(gramaticaParser.ArgumentsDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#argumentsDefinition}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsDefinition(gramaticaParser.ArgumentsDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#inputValueDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInputValueDefinition(gramaticaParser.InputValueDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#inputValueDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInputValueDefinition(gramaticaParser.InputValueDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#objectTypeExtension}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeExtension(gramaticaParser.ObjectTypeExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#objectTypeExtension}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeExtension(gramaticaParser.ObjectTypeExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#interfaceTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeDefinition(gramaticaParser.InterfaceTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#interfaceTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeDefinition(gramaticaParser.InterfaceTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#interfaceTypeExtension}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeExtension(gramaticaParser.InterfaceTypeExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#interfaceTypeExtension}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeExtension(gramaticaParser.InterfaceTypeExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#unionTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterUnionTypeDefinition(gramaticaParser.UnionTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#unionTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitUnionTypeDefinition(gramaticaParser.UnionTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 */
	void enterUnionMemberTypes(gramaticaParser.UnionMemberTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 */
	void exitUnionMemberTypes(gramaticaParser.UnionMemberTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#unionTypeExtension}.
	 * @param ctx the parse tree
	 */
	void enterUnionTypeExtension(gramaticaParser.UnionTypeExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#unionTypeExtension}.
	 * @param ctx the parse tree
	 */
	void exitUnionTypeExtension(gramaticaParser.UnionTypeExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#enumTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumTypeDefinition(gramaticaParser.EnumTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#enumTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumTypeDefinition(gramaticaParser.EnumTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#enumValuesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumValuesDefinition(gramaticaParser.EnumValuesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#enumValuesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumValuesDefinition(gramaticaParser.EnumValuesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#enumValueDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueDefinition(gramaticaParser.EnumValueDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#enumValueDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueDefinition(gramaticaParser.EnumValueDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#enumTypeExtension}.
	 * @param ctx the parse tree
	 */
	void enterEnumTypeExtension(gramaticaParser.EnumTypeExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#enumTypeExtension}.
	 * @param ctx the parse tree
	 */
	void exitEnumTypeExtension(gramaticaParser.EnumTypeExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#inputObjectTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInputObjectTypeDefinition(gramaticaParser.InputObjectTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#inputObjectTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInputObjectTypeDefinition(gramaticaParser.InputObjectTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#inputFieldsDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInputFieldsDefinition(gramaticaParser.InputFieldsDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#inputFieldsDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInputFieldsDefinition(gramaticaParser.InputFieldsDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#inputObjectTypeExtension}.
	 * @param ctx the parse tree
	 */
	void enterInputObjectTypeExtension(gramaticaParser.InputObjectTypeExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#inputObjectTypeExtension}.
	 * @param ctx the parse tree
	 */
	void exitInputObjectTypeExtension(gramaticaParser.InputObjectTypeExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#directiveDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveDefinition(gramaticaParser.DirectiveDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#directiveDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveDefinition(gramaticaParser.DirectiveDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#directiveLocations}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveLocations(gramaticaParser.DirectiveLocationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#directiveLocations}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveLocations(gramaticaParser.DirectiveLocationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#directiveLocation}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveLocation(gramaticaParser.DirectiveLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#directiveLocation}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveLocation(gramaticaParser.DirectiveLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#executableDirectiveLocation}.
	 * @param ctx the parse tree
	 */
	void enterExecutableDirectiveLocation(gramaticaParser.ExecutableDirectiveLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#executableDirectiveLocation}.
	 * @param ctx the parse tree
	 */
	void exitExecutableDirectiveLocation(gramaticaParser.ExecutableDirectiveLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#typeSystemDirectiveLocation}.
	 * @param ctx the parse tree
	 */
	void enterTypeSystemDirectiveLocation(gramaticaParser.TypeSystemDirectiveLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typeSystemDirectiveLocation}.
	 * @param ctx the parse tree
	 */
	void exitTypeSystemDirectiveLocation(gramaticaParser.TypeSystemDirectiveLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(gramaticaParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(gramaticaParser.NameContext ctx);
}