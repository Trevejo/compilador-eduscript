# Build script para EduScript
Write-Host "=== EduScript Build Script ===" -ForegroundColor Green

# Verifica se Java está disponível
try {
    java -version
    Write-Host "Java encontrado." -ForegroundColor Green
} catch {
    Write-Host "ERRO: Java não encontrado. Instale Java 11 ou superior." -ForegroundColor Red
    exit 1
}

# Cria diretórios necessários
Write-Host "Criando diretórios..." -ForegroundColor Yellow
New-Item -ItemType Directory -Path "target/classes" -Force | Out-Null
New-Item -ItemType Directory -Path "src/main/java/br/edu/compiladores/eduscript/generated" -Force | Out-Null

# Compila classes principais (sem ANTLR por enquanto)
Write-Host "Compilando classes Java..." -ForegroundColor Yellow

# Lista dos arquivos para compilar
$javaFiles = @(
    "src/main/java/br/edu/compiladores/eduscript/SymbolTable.java"
    "src/main/java/br/edu/compiladores/eduscript/Interpreter.java"
)

foreach ($file in $javaFiles) {
    if (Test-Path $file) {
        Write-Host "  Compilando $file"
        javac -d target/classes -cp "." $file
        if ($LASTEXITCODE -ne 0) {
            Write-Host "ERRO: Falha ao compilar $file" -ForegroundColor Red
        }
    }
}

Write-Host "Build básico concluído!" -ForegroundColor Green
Write-Host "Para usar ANTLR, instale Maven e execute: mvn antlr4:antlr4" -ForegroundColor Cyan 