# Lista 00 - Revisão de Programação

Repositório com as soluções da **Lista de Revisão de Programação (Nivelamento)** da disciplina de Programação Modular, ministrada pelo professor Glender Brás — PUC Minas.

Lista de nivelamento com exercícios de revisão de lógica de programação (não pontuada), cobrindo vetores, matrizes, laços de repetição e manipulação de strings em Java.

## 🌿 Organização em branches

Seguindo a orientação da lista, cada exercício foi desenvolvido em uma **branch própria**, criada a partir da `main`:

| Exercício | Branch |
|---|---|
| 1. Fatorial | `quest1` |
| 2. Maior, menor e intervalo entre 3 números | `quest2` |
| 3. Interseção de vetores | `quest3` |
| 4. União de vetores | `quest4` |
| 5. Pesquisa de características físicas (habitantes) | `quest5` |
| 6. Correção de provas de múltipla escolha | `quest6` |
| 7. Maior e menor temperatura do ano | `quest7` |
| 8. Loja de artesanato (vendas e comissão) | `quest8` |
| 9. Números pares e ímpares | `quest9` |
| 10. Matriz de vendas mensal/semanal | `quest10` |

## 📋 Exercícios

### 1. Fatorial
Lê um valor inteiro `x` e calcula seu fatorial (`x!`).

### 2. Maior, menor e intervalo entre 3 números
Lê 3 valores inteiros (`x`, `y`, `z`), armazena em um vetor e:
- Calcula o maior entre os três
- Calcula o menor entre os três
- Verifica se `x` está dentro do intervalo `[y, z]`
- Verifica se `x` está fora do intervalo `[y, z]`
- Testa se `x` é divisível por `y` e por `z`

### 3. Interseção de vetores
Lê dois vetores de números de matrícula (alunos de Programação Modular e de Cálculo) e imprime os números de matrícula presentes **nos dois** vetores simultaneamente.

### 4. União de vetores
Lê dois vetores `X` (com `n` elementos) e `Y` (com `m` elementos) e calcula um vetor união `Z`, incluindo elementos repetidos em `X` e `Y` apenas uma vez.

### 5. Pesquisa de características físicas
Lê dados de habitantes (sexo, cor dos olhos, cor dos cabelos, idade) até o valor sentinela `-1` na idade, e determina:
- A maior idade entre os habitantes
- A menor idade entre os habitantes
- A quantidade de mulheres entre 18 e 35 anos (inclusive), com olhos verdes e cabelos louros

### 6. Correção de provas de múltipla escolha
Lê o gabarito de uma prova com 8 questões e as respostas de 10 alunos, calculando:
- O número e a nota de cada aluno
- A porcentagem de aprovação (nota mínima 6)

### 7. Maior e menor temperatura do ano
Lê a temperatura média de cada um dos 12 meses do ano, armazenando em um vetor, e calcula:
- A maior temperatura do ano e o mês (por extenso) em que ocorreu
- A menor temperatura do ano e o mês (por extenso) em que ocorreu

### 8. Loja de artesanato
Lê o valor unitário e a quantidade vendida de 10 tipos de objetos (em vetores de tamanho 10) e calcula:
- Relatório com quantidade, valor unitário e valor total de cada objeto
- Valor geral das vendas e valor da comissão do vendedor (5% sobre as vendas + salário fixo de R$ 545,00)
- O objeto mais vendido e sua posição no vetor

### 9. Números pares e ímpares
Lê 6 números inteiros e mostra:
- Os números pares digitados e suas posições
- A soma dos números pares
- Os números ímpares digitados e suas posições
- A quantidade de números ímpares

### 10. Matriz de vendas mensal/semanal
Preenche uma matriz 12x4 (12 meses × 4 semanas) com valores de vendas de uma loja e calcula:
- O total vendido em cada mês (nome por extenso)
- O total vendido em cada semana do ano (soma por coluna)
- O total vendido pela loja no ano

## 🛠️ Tecnologias

- Java

## ▶️ Como executar

Cada branch contém o(s) arquivo(s) `.java` referente(s) ao exercício correspondente. Para rodar um exercício específico:

```bash
git checkout questX
javac NomeDoArquivo.java
java NomeDoArquivo
```

(substitua `questX` pelo número do exercício desejado)

## 👤 Autor

Guilherme Presot — Engenharia de Software, PUC Minas
