
# Android DEV - Desafio 2

Repositorio criado para desenvolver a solução do desafio 2 - todos os niveis do bootcamp Android DEV.

## Integrantes

- Alexandre dos Santos Nazareth
- Jefferson Rodrigues
- Paulo Sergio
- Felipe Tomaz
- Yago Oliveira

## Solução dos desafios

- Alexandre dos Santos Nazareth foi responsavel pela solução dos desafios de nivel iniciante e intermediario com auxilio
dos integrantes Paulo Sergio, Felipe Tomaz e Yago Oliveira.
- Jefferson Rodrigues foi responsavel pela solução do desafio nivel avançado.

## Estrutura do Projeto

### Desafio 2 - Iniciante

Este projeto tem como objetivo gerenciar informações básicas sobre áreas de conservação marinha, incluindo o tipo de ambiente, área protegida em km² e a presença de um programa de monitoramento ativo. Ele utiliza uma classe chamada ConservacaoMarinha, que contém os principais atributos e métodos para manipulação dessas informações.

1. **`ConservacaoMarinha`**
    - Atributos:
        - `tipoAmbiente`: Representa o tipo de ambiente marinho (ex: Oceano, Coral).
        - `areaProtegidaKm2`: Indica a extensão da área protegida em quilômetros quadrados.
        - `possuiProgramaMonitoramento`: Um valor booleano que indica se há um programa de monitoramento ativo.
   
    - Construtores:
        - Construtor primário: Permite a inicialização dos atributos com valores fornecidos.
        - Construtor secundário: Inicializa a área de conservação com valores padrão (ambiente: Oceano, área protegida: 0.0 km², sem programa de monitoramento).

   - Funções:
       - Métodos `get` e `set`: Acessam e modificam os valores dos atributos `tipoAmbiente`, `areaProtegidaKm2` e `possuiProgramaMonitoramento`.
       - init: Executa uma ação quando a classe é inicializada, imprimindo os detalhes da área de conservação.


### Desafio 2 - Intermediario

Este projeto tem como objetivo gerenciar informações sobre conservação marinha com um nível de complexidade intermediário, utilizando conceitos avançados como enumeradores, herança, e data classes. O projeto inclui a criação de classes e subclasses para representar áreas de conservação marinha, bem como o uso de enumeradores para tipos de ambientes.

**`ENUMERADORES`**

- **`TiposAmbientes`**
    - Enumeração que define os diferentes tipos de ambientes marinhos:
        - `OCEANO`
        - `COSTA`
        - `RECIFE`
        - `ESTUARIO`

**`CLASSES`**

1. **`ConservacaoMarinha`** (Classe abstrata)
    - Propriedades Abstratas:
        - `tipoAmbiente`: Tipo do ambiente marinho (do tipo `TiposAmbientes`).
        - `areaProtegidaKm2`: Indica a extensão da área protegida em quilômetros quadrados.
        - `possuiProgramaMonitoramento`: Um valor booleano que indica se há um programa de monitoramento ativo.

   - Modificadores de acesso:
       - A classe é private e abstrata, significando que não pode ser instanciada diretamente.
 
    - Construtores:
        - Construtor primário: Permite a inicialização dos atributos com valores fornecidos.
        - Construtor secundário: Inicializa a área de conservação com valores padrão (ambiente: Oceano, área protegida: 0.0 km², sem programa de monitoramento).

    - Funções:
        - Métodos `get` e `set`: Acessam e modificam os valores dos atributos `tipoAmbiente`, `areaProtegidaKm2` e `possuiProgramaMonitoramento`.
        - init: Executa uma ação quando a classe é inicializada, imprimindo os detalhes da área de conservação.

2. **`ReservaMarinha`** (Data Class)
    - Herda de `ConservacaoMarinha`.
        
    - Propriedades Adicionais:
        - `definirTipoReserva(tipo: String):` Define o tipo de reserva marinha.

    - Modificadores de Acesso:
        - Utiliza `lateinit` para a propriedade `tipoReserva`, permitindo que seja inicializada posteriormente.

### Desafio 2 - Avançado

Este projeto tem como objetivo registrar dados sobre diferentes áreas de conservação marinha, monitorar a eficácia das ações de conservação e calcular um índice geral de eficiência, utilizando diferentes indicadores. A abordagem abrange dois tipos principais de conservação: `ReservaMarinha` e `AreaProtegidaMarinha`, com um método comum para calcular a eficiência dessas ações.

### Classes

1. **`MarineConservation` (Abstração)**
    - Atributos:
        - `id`: Identificador único da área de conservação.
        - `name`: Nome da área de conservação.
        - `environmentalType`: Tipo de ambiente marinho presente.
        - `protectedArea`: Área protegida (em Km²).
        - `hasMonitoringProgram`: Indica se há um programa de monitoramento ativo.
        - **Indicadores de Conservação:**
        - `qualityWater`: Qualidade da água.
        - `coralCover`: Cobertura de coral.
        - `populationSpeciesExtinction`: População de espécies em extinção.
        - `biodiversity`: Índice de biodiversidade.
        - `protectedAreaIndex`: Índice da área protegida.
        - `monitoringLevel`: Nível de monitoramento.
        - `creationDate`: Data de criação da área protegida.
    - Método:
        - `calculateEfficiency()`: Método para calcular a eficiência da conservação usando uma métrica geral (detalhado abaixo).

2. **`MarineReservation`**
    - Herda de `MarineConservation`.
    - Atributos adicionais:
        - `reservationType`: Tipo específico de reserva (exemplos abaixo).
    - Exemplo de tipos de reserva marinha:
        - **Reserva Biológica Marinha**
        - **Parque Nacional Marinho**
        - **Reserva Extrativista Marinha**

3. **`ProtectedMarineArea`**
    - Herda de `MarineConservation`.
    - Não possui atributos adicionais específicos.

4. **`EspecieEmExtincao`**
    - Atributos:
        - `nomeCientifico`: Nome científico da espécie.
        - `nomePopular`: Nome popular da espécie.


### Indicadores de Conservação

O cálculo da eficiência das áreas de conservação é baseado em uma métrica composta de seis indicadores principais. Cada indicador é normalizado em uma escala de 0 a 100 para facilitar o cálculo e a comparação.

### Indicadores Utilizados:

1. **Qualidade da Água (QA)**
    - Escala: 0 a 100 (100 representa a melhor qualidade da água possível).
    - Peso no cálculo: 25%

2. **Cobertura de Coral (CC)**
    - Escala: 0 a 100 (100 representa a maior cobertura de coral possível).
    - Peso no cálculo: 20%

3. **População de Espécies em Extinção (PE)**
    - Escala: 0 a 100 (100 representa a população ideal ou crescimento positivo de espécies ameaçadas).
    - Peso no cálculo: 20%

4. **Biodiversidade (BI)**
    - Escala: 0 a 100 (100 representa a maior biodiversidade possível).
    - Peso no cálculo: 15%

5. **Área Protegida (AP)**
    - Escala: 0 a 100 (100 representa a maior área protegida possível).
    - Peso no cálculo: 10%

6. **Nível de Monitoramento (NM)**
    - Escala: 0 a 100 (100 representa o nível máximo de monitoramento).
    - Peso no cálculo: 10%

### Cálculo da Eficiência (IECM)

A eficiência da conservação marinha é calculada com base no **Índice de Eficiência de Conservação Marinha (IECM)**. O IECM é uma métrica composta que combina os seis indicadores mencionados anteriormente.

### Fórmula do Cálculo:

```text
IECM = (0.25 × QA) + (0.20 × CC) + (0.20 × PE) + (0.15 × BI) + (0.10 × AP) + (0.10 × NM)