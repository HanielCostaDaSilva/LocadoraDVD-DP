# Projeto Locadora — Design Pattern

## Objetivo
Projeto criado no intuito de estudar **Design Patterns** através da simulação de uma Locadora. 
O sistema permite que os clientes aluguem DVDs, calculem os valores dos aluguéis e gerem extratos em diferentes formatos.

## Funcionalidades
- Cadastro de clientes e DVDs.
- Registro de aluguéis de DVDs por clientes.
- Cálculo do valor dos aluguéis baseado no tipo de DVD e dias alugados.
- Geração de extratos de aluguel em formato de texto e HTML.
- Pontuação de cliente por frequência de aluguéis e bônus para aluguéis de lançamentos.

## Como Executar
1. Execute a classe Principal `Main`.
```bash
javac Main
```
## Design Pattern

#### Princípios SOLID
Os princípios SOLID visam garantir um código mais modular, reutilizável e fácil de manter.
Abaixo a definição de cada princípio:
1. **S - Princípio da Responsabilidade Única (Single Responsibility Principle - SRP):**
    - Uma classe deve ter apenas uma única função, ou seja, ela deve ter apenas uma responsabilidade. Isso facilita a manutenção e evolução do código.
2. **O - Princípio do Aberto/Fechado (Open/Closed Principle - OCP):**
    - Toda classe criada deve ser aberta para extensão, mas fechada para modificação.
        - Isso significa que você pode estender o comportamento da classe **sem  alterar** o escopo central.
3. **L - Princípio da Substituição de Liskov (Liskov Substitution Principle - LSP):**
    - Subclasses não devem alterar a lógica das superclasses.
4. **I - Princípio da Segregação de Interface (Interface Segregation Principle - ISP):**
    - Uma classe não deve ser forçada a implementar interfaces que ela não utiliza. Interfaces devem ser específicas para as necessidades da classe que as implementa.
5. **D - Princípio da Inversão de Dependência (Dependency Inversion Principle - DIP):**
    - Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações.

#### Null Object
O padrão Null Object é utilizado para **representar a ausência de algum objeto**, evitando verificações nulas espalhadas pelo código.

#### Template Method
O padrão Template Method é utilizado para quando um método realiza uma operação cujo algoritmo pode ser dividido em etapas específicas, algumas das quais podem ser definidas ou sobrescritas por subclasses.
No projeto, foi utilizado o mesmo para gerar extratos de aluguel em diferentes formatos (texto e HTML). Onde a super classe `Extrato` define o esqueleto do método `mostrarExtrato`, enquanto as subclasses `TextExtrato` e `HTMLExtrato` implementam os métodos expecificados no passo a passo do esqueleto.
