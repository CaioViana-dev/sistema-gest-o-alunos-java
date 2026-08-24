# Sistema de Gestão de Alunos

Projeto desenvolvido em **Java** para praticar programação por meio da criação de um sistema simples de cadastro e consulta de alunos e suas médias.

O projeto começou durante os estudos de **Algoritmos e Programação** e foi sendo desenvolvido na prática conforme novos conceitos foram sendo estudados e explorados.

## O que o sistema faz

* Cadastra um aluno e suas notas
* Calcula a média das notas
* Aceita apenas notas entre **0 e 10**
* Verifica se a entrada informada é numérica
* Permite consultar um aluno específico
* Lista todos os alunos cadastrados
* Exibe as médias com duas casas decimais
* Salva os dados em um arquivo `.txt`
* Carrega os dados do arquivo ao iniciar o programa
* Permite encerrar o sistema salvando os dados

## Estrutura do projeto

O projeto foi separado em três classes principais:

### `MenuInicial`

Controla o menu principal e direciona cada opção para a funcionalidade correspondente.

### `CalculadoraMedia`

Responsável pelo cadastro das notas, validação dos valores informados e cálculo da média.

### `DadosAlunos`

Responsável por armazenar os alunos, consultar e listar os dados, além de salvar e carregar as informações do arquivo.

## Conceitos utilizados

Durante o desenvolvimento, foram utilizados conceitos como:

* Variáveis e tipos de dados
* Estruturas condicionais (`if`, `else` e `switch`)
* Estruturas de repetição (`while` e `for`)
* Métodos
* Modularização
* `ArrayList`
* `HashMap`
* `Map.Entry`
* `Scanner`
* Validação de entradas com `hasNextInt()` e `hasNextDouble()`
* Manipulação de arquivos
* `FileReader`
* `FileWriter`
* `BufferedReader`
* `BufferedWriter`
* `IOException`
* Tratamento de entradas inválidas
* Formatação de valores com `printf`

## Armazenamento

Os dados são mantidos durante a execução em um `HashMap<String, Double>`, utilizando o nome do aluno como chave e sua média como valor.

Para manter os dados depois que o programa é encerrado, as informações são gravadas no arquivo:

`BancoDeDados.txt`

Quando o programa é iniciado novamente, o arquivo é lido e os dados são carregados para o `HashMap`.

## Modularização

Uma das partes que procurei aplicar no projeto foi a **separação de responsabilidades**.

Em vez de concentrar todo o código no `main`, as funcionalidades foram distribuídas entre classes e métodos diferentes. Isso facilita a leitura e permite modificar uma parte do sistema sem precisar concentrar toda a lógica em um único lugar.

## Sobre o desenvolvimento

Este projeto foi desenvolvido durante as primeiras semanas da graduação, principalmente por meio de **estudo prático**.

Além de acompanhar o conteúdo da disciplina, fui utilizando o projeto para testar e aplicar conceitos que ainda não haviam sido aprofundados nas aulas, expandindo gradualmente suas funcionalidades.

O projeto ainda está em desenvolvimento e será utilizado como base para aplicar novos conceitos conforme o aprendizado avance.

## Próximos passos

* [ ] Melhorar o tratamento de exceções
* [ ] Aplicar Programação Orientada a Objetos
* [ ] Melhorar a estrutura do armazenamento dos dados
* [ ] Criar uma interface gráfica
* [ ] Continuar refatorando o código conforme novos conceitos forem aprendidos

---

**Status:** Em desenvolvimento

**Linguagem:** Java
