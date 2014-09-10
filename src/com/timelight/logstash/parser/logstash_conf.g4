/*
 * Copyright (c) Peter O'Leary. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
grammar logstash_conf;
@header {
    package com.timelight.logstash.parser;
}
config:	filler plugin_section (filler plugin_section)* filler;
NEWLINE:[\r\n];
WS : [ \t\r\n] -> skip ;
filler: (comment | WS)*;
comment: '#' ~NEWLINE* NEWLINE+;
// _ plugin_section _ (_ plugin_section)* _
plugin_section: plugin_type filler '{' filler (branch_or_plugin filler)* '}';
plugin_type: ('input' | 'filter' | 'output');
branch_or_plugin: branch | plugin;
branch: r_if (filler else_if)* (filler r_else)?;
plugin:
    name filler '{'
      filler
      attributes
      filler
    '}';
attributes:( attribute (filler attribute)*)?;
attribute: name filler '=>' filler value filler;
r_if: 'if' filler condition filler '{' filler (branch_or_plugin filler)* '}';
else_if: 'else' filler 'if' filler condition filler '{' filler ( branch_or_plugin filler)* '}';
r_else: 'else' filler '{' filler (branch_or_plugin filler)* '}';
name: ID | string;
string: QUOTED_LITERAL;
QUOTED_LITERAL:
    (  '\''
        ( ('\\' '\\') | ('\'' '\'') | ('\\' '\'') | ~('\'') )*
    '\''  )
    |
    (  '\"'
        ( ('\\' '\\') | ('\"' '\"') | ('\\' '\"') | ~('\"') )*
    '\"'  )
;

single_quoted_string : '\'' .*? '\'' ;
value: plugin | ID | string | number | array | hash;
number:
    '-'? DIGIT+ ('.' DIGIT*)?;
condition: expression (filler boolean_operator filler expression)*;
expression:
    (
        ('(' filler condition filler ')')
      | negative_expression
      | in_expression
      | not_in_expression
      | compare_expression
      | regexp_expression
      | rvalue
    );
array:
    '['
    filler
    (
      value (filler ',' filler value)*
    )?
    filler
    ']';
hash:
    '{'
      filler
      hashentries?
      filler
    '}'
  ;

hashentries:
    hashentry (WS* hashentry)*
  ;

hashentry:
    name filler '=>' filler value;
boolean_operator:
    ('and' | 'or' | 'xor' | 'nand');
negative_expression:
    (
        ('!' filler '(' filler condition filler ')')
      | ('!' filler selector)
    );
in_expression:
    rvalue filler in_operator filler rvalue;

not_in_expression:
    rvalue filler not_in_operator filler rvalue;
rvalue:
    string | number | selector | array | method_call | regexp;
selector: selector_element+;
compare_expression:
    rvalue filler compare_operator filler rvalue;
regexp_expression:
    rvalue filler  regexp_operator filler (string | regexp);
// TODO: figure out selector_elements
selector_element: '[' .+? ']';
in_operator: 'in';
not_in_operator: 'not' filler 'in';
method_call:
      ID filler '(' filler
        (
          rvalue ( filler ',' filler rvalue )*
        )?
      filler ')';
// TODO: figure out regexp
regexp:  '/' ( . )*? '/';
compare_operator :
    ('==' | '!=' | '<=' | '>=' | '<' / '>') ;
regexp_operator: ('=~' / '!~');
ID: [a-zA-Z_$] [a-zA-Z_$0-9]* ;
DIGIT: [0-9];
INT     : [0-9]+ ;