grammar gramatica;
/* Schema rules */

schema
    : (typeDefinition | inputTypeDefinition | enumDefinition | interfaceDefinition | unionDefinition)+
    ;

typeDefinition
    : 'type' namedType interfaceImplementation? fieldDefinitions
    ;

inputTypeDefinition
    : 'input' namedType fieldDefinitions
    ;

enumDefinition
    : 'enum' namedType enumFields
    ;

interfaceDefinition  : 'interface' namedType fieldDefinitions
    ;

unionDefinition
    : 'union' namedType '=' namedType ('|' namedType)+
    ;

interfaceImplementation
    : 'implements' namedType
    ;

fieldDefinitions
    : '{' fieldDefinition (','* fieldDefinition)* '}'
    ;

fieldDefinition
    : NAME ':' dataType
    ;

enumFields
    : '{' NAME (','* NAME)* '}'
    ;


/* Query document rules */

document
    : definition+
    ;

definition
    : operationDefinition | fragmentDefinition
    ;

operationDefinition
    : selectionSet | namedOperationDefinition
    ;

namedOperationDefinition
    : operationType NAME? variableDefinitions? directives? selectionSet
    ;

operationType
    : QUERY
    ;

variableDefinitions
    : '(' variableDefinition (','* variableDefinition)* ')'
    ;

variableDefinition
    : variable ':' dataType defaultValue?
    ;

defaultValue
    : '=' value
    ;

variable
    : '$' NAME
    ;

dataType
    : namedType | listType | nonNullNamedType | nonNullListType
    ;

namedType
    : NAME
    ;

listType
    : '[' dataType ']'
    ;

nonNullNamedType
    : namedType '!'
    ;

nonNullListType
    : listType '!'
    ;

selectionSet
    : '{' selection (','* selection)* '}'
    ;

selection
    : field | fragmentSpread | inlineFragment
    ;

field
    : alias? NAME arguments? directives? selectionSet?
    ;

alias
    : NAME ':'
    ;

fragmentDefinition
    : 'fragment' fragmentName typeCondition directives? selectionSet
    ;

fragmentSpread
    : '...' fragmentName directives?
    ;

inlineFragment
    : '...' typeCondition? directives? selectionSet
    ;

fragmentName
    : NAME
    ;

typeCondition
    : 'on' namedType
    ;

directives
    : directive (','* directive)*
    ;

directive
    : '@' NAME arguments?
    ;

arguments
    : '(' argument (','* argument)* ')'
    ;

argument
    : NAME ':' value
    ;

value
    : variable | FLOAT | INT | STRING | BOOLEAN | NULL | enumValue | listValue | objectValue
    ;

enumValue
    : NAME
    ;

listValue
    : '[' ']' | '[' value (','* value)* ']'
    ;

objectValue
    : '{' '}' | '{' argument (','* argument)* '}'
    ;

STRING
    : '"' (ESCAPED_CHAR | ESCAPED_UNICODE | ~["\\])* '"'
    ;
ESCAPED_CHAR
    : '\\' ["\\/bfnrt]
    ;
ESCAPED_UNICODE
    : '\\u' HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR
    ;
HEX_CHAR
    : [0-9a-fA-F]
    ;
FLOAT
    : INT '.' [0-9]+ EXPONENT? | INT EXPONENT | INT
    ;
INT
    : '-'? ('0' | [1-9][0-9]*)
    ;
EXPONENT
    : [Ee] '+'? INT
    ;
NULL
    : 'null'
    ;
BOOLEAN
    : 'true' | 'false'
    ;
QUERY
    : 'query'
    ;

NAME
    : [_A-Za-z][_0-9A-Za-z]*
    ;
WS
    : [ \t\n\r]+ -> channel(HIDDEN)
    ;
COMMENT
    : '#' ~[\r\n]* -> channel(HIDDEN)
    ;