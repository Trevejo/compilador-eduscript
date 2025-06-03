# EduScript - Linguagem de Programação Educacional

## Descrição

EduScript é uma linguagem de programação educacional desenvolvida para a disciplina de Compiladores no curso de Engenharia da Computação. O projeto visa proporcionar uma experiência prática completa no desenvolvimento de um compilador/interpretador utilizando ANTLR4 e Java.

## Características da Linguagem

- **Sintaxe clara e intuitiva**: Inspirada em Python e Pascal
- **Palavras-chave em português**: Facilita o aprendizado inicial
- **Tipagem estática**: Todas as variáveis devem ter tipos declarados
- **Suporte a estruturas básicas**: Variáveis, constantes, expressões
- **Estruturas de controle**: Condicionais (se-senao) e loops (enquanto, para)
- **Funções e procedimentos**: Com passagem de parâmetros
- **Estruturas de dados**: Arrays e registros
- **Operações de E/S**: Comandos `ler` e `escrever`

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

// Programa principal
inicio
    var numero: inteiro;
    var resultado: inteiro;
    escrever("Digite um número para calcular o fatorial: ");
    ler(numero);
    
    resultado = fatorial(numero);
    
    escrever("O fatorial de ", numero, " é ", resultado);
    
fimprograma
```

## Estrutura do Projeto

```
eduzinhoscripts/
├── pom.xml                          # Configuração Maven
├── README.md                        # Este arquivo
├── src/
│   ├── main/
│   │   ├── antlr4/
│   │   │   └── EduScript.g4         # Gramática ANTLR4
│   │   └── java/br/edu/compiladores/eduscript/
│   │       ├── Main.java            # Ponto de entrada
│   │       ├── SymbolTable.java     # Tabela de símbolos
│   │       ├── SemanticAnalyzer.java # Analisador semântico
│   │       └── Interpreter.java     # Interpretador
│   └── test/
│       └── java/                    # Testes unitários
└── examples/
    └── ExemploFatorial.eds          # Exemplo de código EduScript
```

## Compilação e Execução

### Pré-requisitos

- Java 11 ou superior
- Maven 3.6 ou superior

### Compilação

```bash
# Clone o repositório (se aplicável)
git clone <url-do-repositorio>
cd eduzinhoscripts

# Compile o projeto
mvn clean compile

# Gere os arquivos ANTLR
mvn antlr4:antlr4

# Compile tudo novamente após gerar arquivos ANTLR
mvn compile

# Crie o JAR executável
mvn package
```

### Execução

```bash
# Executar sem argumentos (demonstração)
java -jar target/eduscript-1.0.0.jar

# Compilar um arquivo
java -jar target/eduscript-1.0.0.jar compile examples/ExemploFatorial.eds

# Compilar e executar um arquivo
java -jar target/eduscript-1.0.0.jar run examples/ExemploFatorial.eds

# Mostrar ajuda
java -jar target/eduscript-1.0.0.jar help

# Mostrar versão
java -jar target/eduscript-1.0.0.jar version

# Executar com debug
java -Ddebug=true -jar target/eduscript-1.0.0.jar run examples/ExemploFatorial.eds
```

## Fases de Desenvolvimento

### 1. ✅ Definição da Linguagem e Gramática
- [x] Especificação da sintaxe e semântica
- [x] Desenvolvimento da gramática ANTLR (EduScript.g4)
- [x] Estrutura básica do projeto Maven

### 2. 🔄 Análise Léxica e Sintática
- [x] Gramática ANTLR4 completa
- [ ] Geração dos analisadores com ANTLR
- [ ] Testes de análise léxica e sintática

### 3. 🔄 Análise Semântica
- [x] Implementação da tabela de símbolos
- [x] Desenvolvimento do analisador semântico
- [ ] Verificação de tipos e escopo
- [ ] Testes de análise semântica

### 4. 🔄 Interpretador/Compilador
- [x] Estrutura básica do interpretador
- [ ] Implementação completa da execução
- [ ] Integração com AST do ANTLR

### 5. ⏳ Testes e Documentação
- [ ] Testes unitários
- [ ] Exemplos de código
- [ ] Documentação completa

## Comandos Maven Úteis

```bash
# Limpar e compilar
mvn clean compile

# Gerar classes ANTLR
mvn antlr4:antlr4

# Executar testes
mvn test

# Criar JAR
mvn package

# Limpar arquivos gerados
mvn clean

# Verificar dependências
mvn dependency:tree
```

## Tokens e Palavras-chave

### Palavras-chave da Linguagem
- `programa`, `fimprograma`
- `funcao`, `procedimento`, `inicio`, `fim`
- `var`, `const`
- `se`, `entao`, `senao`, `fimse`
- `enquanto`, `faca`, `fimenquanto`
- `para`, `ate`, `passo`, `fimpara`
- `ler`, `escrever`, `retornar`
- `inteiro`, `real`, `logico`, `texto`
- `array`, `registro`, `fimregistro`
- `e`, `ou`, `nao`
- `verdadeiro`, `falso`

### Operadores
- Aritméticos: `+`, `-`, `*`, `/`, `%`
- Relacionais: `=`, `<>`, `<`, `<=`, `>`, `>=`
- Lógicos: `e`, `ou`, `nao`
- Atribuição: `=`

## Estrutura da Gramática

### Programa Principal
```eduscript
programa NomePrograma;
    // declarações e definições
inicio
    // comandos principais
fimprograma
```

### Funções
```eduscript
funcao nomeFuncao(parametros): tipoRetorno
inicio
    // comandos da função
    retornar valor;
fim
```

### Estruturas de Controle
```eduscript
// Condicional
se condicao entao
    // comandos
senao
    // comandos alternativos
fimse

// Loop while
enquanto condicao faca
    // comandos
fimenquanto

// Loop for
para variavel = inicio ate fim passo incremento faca
    // comandos
fimpara
```

## Contribuição

Este é um projeto educacional. Para contribuir:

1. Fork o projeto
2. Crie uma branch para sua feature
3. Commit suas mudanças
4. Push para a branch
5. Abra um Pull Request

## Referências

- **AHO, SETHI, Ravi; ULLMAN, Jeffrey D.; MONICA S. LAM.** Compiladores: princípios, técnicas e ferramentas. Pearson Addison Wesley, 2008.
- [ANTLR4 Documentation](https://github.com/antlr/antlr4/blob/master/doc/index.md)
- [Maven Documentation](https://maven.apache.org/guides/)

## Licença

Este projeto é desenvolvido para fins educacionais na disciplina de Compiladores.

## Autores

Desenvolvido para a disciplina de Compiladores - Engenharia da Computação.

---

**EduScript Compiler/Interpreter v1.0.0** 