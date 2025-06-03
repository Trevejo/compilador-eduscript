grammar EduScript;

// Regra inicial do programa
programa
    : PROGRAMA ID SEMICOLON declaracoes bloco FIMPROGRAMA
    ;

// Declarações podem incluir funções, procedimentos, variáveis e constantes
declaracoes
    : (funcao | procedimento | declaracaoVar | declaracaoConst)*
    ;

// Declaração de função
funcao
    : FUNCAO ID LPAREN parametros? RPAREN COLON tipo INICIO comandos FIM
    ;

// Declaração de procedimento
procedimento
    : PROCEDIMENTO ID LPAREN parametros? RPAREN INICIO comandos FIM
    ;

// Parâmetros de função/procedimento
parametros
    : parametro (COMMA parametro)*
    ;

parametro
    : (REF)? ID COLON tipo
    ;

// Declaração de variável
declaracaoVar
    : VAR listaVar COLON tipo SEMICOLON
    ;

listaVar
    : ID (COMMA ID)*
    ;

// Declaração de constante
declaracaoConst
    : CONST ID COLON tipo IGUAL expressao SEMICOLON
    ;

// Bloco principal do programa
bloco
    : INICIO comandos
    ;

// Lista de comandos
comandos
    : comando*
    ;

// Comando individual
comando
    : atribuicao
    | chamadaFuncao SEMICOLON
    | condicional
    | laco
    | entrada
    | saida
    | retorno
    ;

// Atribuição
atribuicao
    : ID (LBRACKET expressao (COMMA expressao)? RBRACKET)? IGUAL expressao SEMICOLON
    ;

// Chamada de função
chamadaFuncao
    : ID LPAREN argumentos? RPAREN
    ;

argumentos
    : expressao (COMMA expressao)*
    ;

// Estrutura condicional
condicional
    : SE expressao ENTAO comandos (SENAO comandos)? FIMSE
    ;

// Estruturas de repetição
laco
    : lacoEnquanto
    | lacoPara
    ;

lacoEnquanto
    : ENQUANTO expressao FACA comandos FIMENQUANTO
    ;

lacoPara
    : PARA ID IGUAL expressao ATE expressao (PASSO expressao)? FACA comandos FIMPARA
    ;

// Entrada de dados
entrada
    : LER LPAREN ID RPAREN SEMICOLON
    ;

// Saída de dados
saida
    : ESCREVER LPAREN listaExpressoes RPAREN SEMICOLON
    ;

listaExpressoes
    : expressao (COMMA expressao)*
    ;

// Retorno de função
retorno
    : RETORNAR expressao? SEMICOLON
    ;

// Expressões
expressao
    : expressaoLogica
    ;

expressaoLogica
    : expressaoRelacional (operadorLogico expressaoRelacional)*
    ;

expressaoRelacional
    : expressaoAritmetica (operadorRelacional expressaoAritmetica)?
    ;

expressaoAritmetica
    : termo (operadorAditivo termo)*
    ;

termo
    : fator (operadorMultiplicativo fator)*
    ;

fator
    : LPAREN expressao RPAREN
    | chamadaFuncao
    | ID (LBRACKET expressao (COMMA expressao)? RBRACKET)?
    | literal
    | operadorUnario fator
    ;

operadorLogico
    : E | OU
    ;

operadorRelacional
    : IGUAL | DIFERENTE | MENOR | MENORIGUAL | MAIOR | MAIORIGUAL
    ;

operadorAditivo
    : MAIS | MENOS
    ;

operadorMultiplicativo
    : MULTIPLICACAO | DIVISAO | RESTO
    ;

operadorUnario
    : MAIS | MENOS | NAO
    ;

// Literais
literal
    : NUMERO_INTEIRO
    | NUMERO_REAL
    | STRING
    | BOOLEAN
    ;

// Tipos de dados
tipo
    : tipoBasico
    | tipoArray
    | tipoRegistro
    ;

tipoBasico
    : INTEIRO | REAL | LOGICO | TEXTO
    ;

tipoArray
    : ARRAY LBRACKET NUMERO_INTEIRO (COMMA NUMERO_INTEIRO)? RBRACKET DE tipo
    ;

tipoRegistro
    : REGISTRO camposRegistro FIMREGISTRO
    ;

camposRegistro
    : (ID COLON tipo SEMICOLON)+
    ;

// TOKENS (Análise Léxica)

// Palavras-chave
PROGRAMA        : 'programa';
FIMPROGRAMA     : 'fimprograma';
FUNCAO          : 'funcao';
PROCEDIMENTO    : 'procedimento';
INICIO          : 'inicio';
FIM             : 'fim';
VAR             : 'var';
CONST           : 'const';
SE              : 'se';
ENTAO           : 'entao';
SENAO           : 'senao';
FIMSE           : 'fimse';
ENQUANTO        : 'enquanto';
FACA            : 'faca';
FIMENQUANTO     : 'fimenquanto';
PARA            : 'para';
ATE             : 'ate';
PASSO           : 'passo';
FIMPARA         : 'fimpara';
LER             : 'ler';
ESCREVER        : 'escrever';
RETORNAR        : 'retornar';
REF             : 'ref';
ARRAY           : 'array';
DE              : 'de';
REGISTRO        : 'registro';
FIMREGISTRO     : 'fimregistro';

// Tipos de dados
INTEIRO         : 'inteiro';
REAL            : 'real';
LOGICO          : 'logico';
TEXTO           : 'texto';

// Operadores lógicos
E               : 'e';
OU              : 'ou';
NAO             : 'nao';

// Operadores relacionais e atribuição
IGUAL           : '=';
DIFERENTE       : '<>';
MENOR           : '<';
MENORIGUAL      : '<=';
MAIOR           : '>';
MAIORIGUAL      : '>=';

// Operadores aritméticos
MAIS            : '+';
MENOS           : '-';
MULTIPLICACAO   : '*';
DIVISAO         : '/';
RESTO           : '%';

// Delimitadores
LPAREN          : '(';
RPAREN          : ')';
LBRACKET        : '[';
RBRACKET        : ']';
COMMA           : ',';
SEMICOLON       : ';';
COLON           : ':';

// Literais
NUMERO_INTEIRO  : [0-9]+;
NUMERO_REAL     : [0-9]+ '.' [0-9]+;
STRING          : '"' (~["\r\n])* '"';
BOOLEAN         : 'verdadeiro' | 'falso';

// Identificadores
ID              : [a-zA-Z_][a-zA-Z0-9_]*;

// Comentários
COMENTARIO_LINHA : '//' ~[\r\n]* -> skip;
COMENTARIO_BLOCO : '/*' .*? '*/' -> skip;

// Espaços em branco
WS              : [ \t\r\n]+ -> skip; 