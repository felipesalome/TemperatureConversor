# Documentação do Conversor de Temperaturas

[![Test Coverage](https://raw.githubusercontent.com/felipesalome/TemperatureConversor/main/.github/badges/jacoco.svg)](https://github.com/felipesalome/TemperatureConversor/actions)
[![Branches Coverage](https://raw.githubusercontent.com/felipesalome/TemperatureConversor/main/.github/badges/branches.svg)](https://github.com/felipesalome/TemperatureConversor/actions)

## Objetivo

O objetivo deste projeto é desenvolver um sistema simples de conversão de temperaturas que permita converter valores entre Celsius e Fahrenheit. O sistema deve ser implementado em Java 8, utilizando uma interface genérica `Conversor<T>` e implementações específicas para cada tipo de conversão. Este exercício visa praticar princípios de orientação a objetos, como o uso de interfaces, encapsulamento e boas práticas de design, além de aplicar o Desenvolvimento Orientado a Testes (TDD) como abordagem de validação.

## Estimativa de Prazo e Pontuação

- **Complexidade:** Baixa a média (depende do nível de detalhamento na implementação).
- **Prazo Estimado:** 1 a 2 horas (para um desenvolvedor com conhecimento básico em Java 8).
- **Pontuação (Fibonacci):** 2 pontos (reflete a simplicidade da lógica e o uso básico de conceitos de orientação a objetos).

## Requisitos Funcionais

1. O sistema deve suportar a conversão de uma temperatura em Celsius para Fahrenheit.
2. O sistema deve suportar a conversão de uma temperatura em Fahrenheit para Celsius.
3. Os valores de entrada e saída devem ser representados como números de ponto flutuante (por exemplo, do tipo `double`) para garantir precisão nas conversões.

## Requisitos Não Funcionais

1. O desenvolvimento deve ser feito em Java 8.
2. O sistema deve seguir os princípios de orientação a objetos, utilizando uma interface `Conversor<T>` e pelo menos duas implementações específicas.
3. Os métodos devem ser bem nomeados e incluir documentação clara para facilitar a manutenção e o entendimento.
4. O sistema deve ser projetado para ser testável, seguindo a abordagem TDD.

## Regras de Negócio

O sistema deve implementar as seguintes fórmulas para conversão de temperaturas:

### Conversão de Celsius para Fahrenheit

- **Fórmula:** A temperatura em Fahrenheit (F) é calculada multiplicando a temperatura em Celsius (C) por 9/5 e somando 32.
- **Exemplo:**
  - 0°C deve resultar em 32°F.
  - 25°C deve resultar em 77°F.
  - 100°C deve resultar em 212°F.

### Conversão de Fahrenheit para Celsius

- **Fórmula:** A temperatura em Celsius (C) é calculada subtraindo 32 da temperatura em Fahrenheit (F) e multiplicando o resultado por 5/9.
- **Exemplo:**
  - 32°F deve resultar em 0°C.
  - 77°F deve resultar em 25°C.
  - 212°F deve resultar em 100°C.

## Detalhes da Implementação

- **Interface `Conversor<T>`:**
  - Deve definir um método genérico que receba um valor de entrada e retorne o valor convertido. O tipo genérico `T` deve ser adequado para representar temperaturas (recomenda-se `Double`).
- **Implementações Esperadas:**
  - Uma classe para converter de Celsius para Fahrenheit.
  - Uma classe para converter de Fahrenheit para Celsius.
- **Uso de Enums (Opcional):**
  - Você pode criar um enum para representar as unidades de temperatura (Celsius e Fahrenheit), o que pode ajudar a identificar as conversões e melhorar a legibilidade do sistema.
- **Boas Práticas:**
  - Utilize constantes para valores fixos nas fórmulas (como 9/5, 32 e 5/9) para evitar duplicação e facilitar ajustes futuros.
  - Nomeie os métodos de forma clara e descritiva, indicando o propósito de cada conversão.

## Validação e Testes (TDD)

O desenvolvimento deve seguir a abordagem TDD, onde os testes são escritos antes da implementação. As seguintes diretrizes devem ser consideradas:

### Validação

- O sistema deve aceitar apenas valores numéricos como entrada.
- Considere um intervalo aceitável para temperaturas (por exemplo, evitar valores abaixo do zero absoluto, como -273.15°C ou -459.67°F, se desejar adicionar realismo, mas isso é opcional).
- Não é necessário implementar validações complexas, mas o sistema deve lidar com entradas inválidas de forma sensata (por exemplo, lançando uma exceção ou retornando um resultado padrão, conforme sua escolha).

### Casos de Teste

1. **Conversão de Celsius para Fahrenheit:**
   - Teste valores padrão: 0°C → 32°F, 100°C → 212°F, 25°C → 77°F.
   - Teste valores decimais para verificar precisão (exemplo: 37.5°C → 99.5°F).
2. **Conversão de Fahrenheit para Celsius:**
   - Teste valores padrão: 32°F → 0°C, 212°F → 100°C, 77°F → 25°C.
   - Teste valores decimais (exemplo: 99.5°F → 37.5°C).
3. **Consistência Bidirecional:**
   - Converta um valor de Celsius para Fahrenheit e, em seguida, de volta para Celsius, verificando se o resultado é igual ao valor original (dentro de uma margem de erro aceitável devido à precisão de ponto flutuante).
4. **Entradas Inválidas (Opcional):**
   - Teste como o sistema reage a valores não numéricos ou fora do intervalo esperado, se você optar por adicionar validação.

## Exemplo de Uso Esperado

- O usuário deve poder instanciar uma implementação específica da interface e chamar o método de conversão com um valor de entrada, obtendo o resultado convertido.
- Exemplo de interação (sem código):
  - Criar um conversor de Celsius para Fahrenheit, passar 25.0 como entrada e esperar 77.0 como saída.
  - Criar um conversor de Fahrenheit para Celsius, passar 32.0 como entrada e esperar 0.0 como saída.

## Considerações Finais

- O foco deste projeto é praticar o uso de interfaces e implementações em Java 8, mantendo o código simples, mas bem estruturado.
- A documentação deve ser suficiente para que você consiga implementá-lo sem exemplos de código, apenas com base nas descrições e requisitos.
- Use o Jira para dividir o trabalho em etapas (ex.: criar interface, implementar conversões, escrever testes) e acompanhe seu progresso.
