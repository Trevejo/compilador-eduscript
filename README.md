# EduScript - Compilador e Interpretador Educacional

[![Java](https://img.shields.io/badge/Java-11%2B-blue.svg)](https://www.oracle.com/java/)
[![ANTLR](https://img.shields.io/badge/ANTLR-4.13.1-green.svg)](https://www.antlr.org/)
[![Maven](https://img.shields.io/badge/Maven-3.6%2B-orange.svg)](https://maven.apache.org/)
[![Status](https://img.shields.io/badge/Status-Produção-brightgreen.svg)](#)

## Visão Geral

**EduScript** é uma linguagem de programação educacional desenvolvida especificamente para o ensino de conceitos fundamentais de compiladores. Este projeto implementa um compilador/interpretador completo utilizando ANTLR4 e Java, demonstrando todas as fases de compilação: análise léxica, sintática, semântica e interpretação.

A linguagem foi projetada com sintaxe em português para facilitar o aprendizado, mantendo características modernas de linguagens de programação como tipagem estática, estruturas de controle e modularização através de funções e procedimentos.

## Autores

- **Murilo Trevejo** - Desenvolvedor Principal
- **Fábio Gomes** - Desenvolvedor Principal

*Projeto desenvolvido para a disciplina de Compiladores - Curso de Engenharia da Computação*

## Características da Linguagem

### ✅ Recursos Implementados

- **Sintaxe Intuitiva**: Palavras-chave em português (`programa`, `se`, `enquanto`, etc.)
- **Tipagem Estática**: Suporte completo aos tipos `inteiro`, `real`, `logico`, `texto`
- **Estruturas de Controle**: 
  - Condicionais (`se-senao-fimse`)
  - Loops (`enquanto-faca-fimenquanto`, `para-ate-passo-fimpara`)
- **Modularização**:
  - Funções com valor de retorno
  - Procedimentos (sub-rotinas sem retorno)
  - Passagem de parâmetros por valor e referência
- **Estruturas de Dados**:
  - Arrays unidimensionais e bidimensionais
  - Registros (estruturas)
- **Operações**:
  - Aritméticas (`+`, `-`, `*`, `/`, `%`)
  - Relacionais (`=`, `<>`, `<`, `<=`, `>`, `>=`)
  - Lógicas (`e`, `ou`, `nao`)
- **Entrada/Saída**: Comandos `ler` e `escrever`
- **Análise Completa**:
  - Análise léxica com tratamento de erros
  - Análise sintática com recuperação de erros
  - Análise semântica com verificação de tipos e escopo
  - Tabela de símbolos com escopo aninhado

## Exemplo de Código

```eduscript
programa ExemploFatorial;

// Declaração de função para cálculo de fatorial
funcao fatorial(n: inteiro): inteiro
inicio
    se n <= 1 entao
        retornar 1;
    senao
        retornar n * fatorial(n - 1);
    fimse
fim

// Declarações de variáveis
var numero: inteiro;
var resultado: inteiro;

// Programa principal
inicio
    escrever("Digite um número para calcular o fatorial: ");
    ler(numero);
    
    resultado = fatorial(numero);
    
    escrever("O fatorial de ", numero, " é ", resultado);
    
fimprograma
```

## Instalação e Configuração

### Pré-requisitos

- **Java 11** ou superior
- **Maven 3.6** ou superior
- **Git** (opcional, para clonar o repositório)

### Compilação do Projeto

```bash
# Clone o repositório
git clone <url-do-repositorio>
cd compilador-eduscript

# Compile o projeto completo
mvn clean compile

# Execute os testes
mvn test

# Gere o JAR executável
mvn package
```

### Compilação Manual (Alternativa)

Para sistemas onde o Maven não está no PATH:

```powershell
# Windows PowerShell
./build.ps1

# Ou compilação manual com ANTLR
javac -cp "antlr-4.13.1-complete.jar" -encoding UTF-8 -d target/classes src/main/java/br/edu/compiladores/eduscript/*.java src/main/java/br/edu/compiladores/eduscript/generated/*.java
```

## Utilização

### Comandos Disponíveis

```bash
# Compilar um arquivo EduScript
java -cp "target/classes;antlr-4.13.1-complete.jar" br.edu.compiladores.eduscript.Main compile examples/ExemploFatorial.eds

# Compilar e executar um arquivo
java -cp "target/classes;antlr-4.13.1-complete.jar" br.edu.compiladores.eduscript.Main run examples/ExemploFatorial.eds

# Mostrar ajuda
java -cp "target/classes;antlr-4.13.1-complete.jar" br.edu.compiladores.eduscript.Main help

# Mostrar versão
java -cp "target/classes;antlr-4.13.1-complete.jar" br.edu.compiladores.eduscript.Main version

# Executar com informações de debug
java -Ddebug=true -cp "target/classes;antlr-4.13.1-complete.jar" br.edu.compiladores.eduscript.Main run examples/ExemploFatorial.eds
```

### Saída de Execução

```
EduScript Compiler/Interpreter v1.0.0
==========================================
Processando arquivo: examples/ExemploFatorial.eds

=== FASE 1: ANALISE LEXICA ===
Analise lexica concluida com sucesso.

=== FASE 2: ANALISE SINTATICA ===
Analise sintatica concluida com sucesso.

=== FASE 3: ANALISE SEMANTICA ===
Analisando programa: ExemploFatorial
Analise semantica concluida com sucesso.

=== FASE 4: EXECUÇÃO ===
=== Executando programa: ExemploFatorial ===
Digite um número para calcular o fatorial:
```

## Arquitetura do Sistema

### Estrutura do Projeto

```
compilador-eduscript/
├── pom.xml                                    # Configuração Maven
├── README.md                                  # Documentação principal
├── PROJETO_RESUMO.md                         # Resumo do projeto
├── build.ps1                                 # Script de build alternativo
├── antlr-4.13.1-complete.jar                # JAR do ANTLR
├── src/
│   ├── main/
│   │   ├── antlr4/
│   │   │   └── EduScript.g4                  # Gramática ANTLR4
│   │   └── java/br/edu/compiladores/eduscript/
│   │       ├── Main.java                     # Ponto de entrada
│   │       ├── SymbolTable.java              # Tabela de símbolos
│   │       ├── SemanticAnalyzer.java         # Analisador semântico
│   │       ├── Interpreter.java              # Motor de interpretação
│   │       └── generated/                    # Classes ANTLR geradas
│   └── test/
│       └── java/                             # Testes unitários
├── examples/
│   ├── ExemploFatorial.eds                   # Programa exemplo - Fatorial
│   └── ExemploArrays.eds                     # Programa exemplo - Arrays
└── target/
    └── classes/                              # Classes compiladas
```

### Componentes Principais

| Componente | Função | Status |
|------------|--------|--------|
| **EduScript.g4** | Gramática ANTLR4 da linguagem | ✅ Completo |
| **SymbolTable.java** | Gerenciamento de símbolos e escopo | ✅ Completo |
| **SemanticAnalyzer.java** | Análise semântica e verificação de tipos | ✅ Completo |
| **Interpreter.java** | Motor de interpretação | ✅ Funcional |
| **Main.java** | Interface CLI e coordenação das fases | ✅ Completo |

## Gramática da Linguagem

### Tokens e Palavras-chave

#### Estrutura do Programa
- `programa`, `fimprograma` - Delimitadores do programa principal
- `inicio`, `fim` - Delimitadores de blocos

#### Declarações
- `var` - Declaração de variáveis
- `const` - Declaração de constantes
- `funcao`, `procedimento` - Declaração de sub-rotinas

#### Tipos de Dados
- `inteiro` - Números inteiros
- `real` - Números de ponto flutuante
- `logico` - Valores booleanos (`verdadeiro`, `falso`)
- `texto` - Strings de caracteres
- `array` - Arrays unidimensionais e bidimensionais
- `registro` - Estruturas de dados

#### Estruturas de Controle
- `se`, `entao`, `senao`, `fimse` - Estrutura condicional
- `enquanto`, `faca`, `fimenquanto` - Loop while
- `para`, `ate`, `passo`, `fimpara` - Loop for

#### Operações de E/S
- `ler` - Entrada de dados
- `escrever` - Saída de dados
- `retornar` - Retorno de função

#### Operadores
- **Aritméticos**: `+`, `-`, `*`, `/`, `%`
- **Relacionais**: `=`, `<>`, `<`, `<=`, `>`, `>=`
- **Lógicos**: `e`, `ou`, `nao`

## Testes

### Executar Testes

```bash
# Executar todos os testes
mvn test

# Executar testes com relatório detalhado
mvn test -Dtest.detailed=true

# Executar teste específico
mvn test -Dtest=TestEduScript
```

### Exemplos de Teste

O projeto inclui uma suíte completa de testes unitários cobrindo:
- Análise léxica de todos os tokens
- Análise sintática de estruturas da linguagem
- Análise semântica com verificação de tipos
- Tabela de símbolos e gerenciamento de escopo
- Interpretação básica de programas

## Desenvolvimento e Metodologia

### Fases de Desenvolvimento

1. **✅ Especificação da Linguagem**
   - Definição da sintaxe e semântica
   - Elaboração da gramática formal

2. **✅ Análise Léxica e Sintática**
   - Implementação da gramática ANTLR4
   - Geração dos analisadores léxico e sintático

3. **✅ Análise Semântica**
   - Implementação da tabela de símbolos
   - Verificação de tipos e regras semânticas

4. **✅ Interpretação**
   - Motor básico de interpretação
   - Execução de programas EduScript

5. **✅ Testes e Validação**
   - Testes unitários abrangentes
   - Validação com programas exemplo

### Tecnologias Utilizadas

- **Java 11+**: Linguagem de implementação
- **ANTLR4 4.13.1**: Gerador de parsers
- **Maven**: Gerenciamento de dependências e build
- **JUnit 5**: Framework de testes

## Contribuição

Para contribuir com o projeto:

1. Faça um fork do repositório
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

### Padrões de Código

- Seguir convenções Java padrão
- Documentar métodos públicos com Javadoc
- Manter cobertura de testes acima de 80%
- Usar nomes descritivos para variáveis e métodos

## Referências Bibliográficas

- **AHO, Alfred V.; SETHI, Ravi; ULLMAN, Jeffrey D.; LAM, Monica S.** *Compilers: Principles, Techniques, and Tools*. 2nd Edition. Pearson, 2006.
- **GRUNE, Dick; JACOBS, Ceriel J.H.** *Parsing Techniques: A Practical Guide*. 2nd Edition. Springer, 2008.
- [**ANTLR4 Documentation**](https://github.com/antlr/antlr4/blob/master/doc/index.md)
- [**Maven Project Documentation**](https://maven.apache.org/guides/)

## Licença

Este projeto foi desenvolvido para fins educacionais na disciplina de Compiladores. Todos os direitos reservados aos autores.

---

**EduScript Compiler/Interpreter v1.0.0**  
*Desenvolvido por Murilo Trevejo e Fábio Gomes*  
*Engenharia da Computação - Disciplina de Compiladores* 
