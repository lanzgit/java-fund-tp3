# Teste de Performance - TP3

## Apresentação

Ao ser iniciado, o programa deve exibir um menu com as seguintes opções:

- [1] Cadastrar professor
- [2] Cadastrar aluno
- [3] Consultar a situação de um docente/discente.
- [4] Sair.

### TP2 - Recursos da orientação a objetos em Java

CONCEITOS
- Construir classes, atributos e métodos
- Criar instâncias e realizar chamadas de métodos
- Escrever construtores
- Implementar sobrecargas de construtores e métodos
- Implementar encapsulamento
- Implementar herança
- Implementar polimorfismo

### TP3 - Tratamento de exceções e String

CONCEITOS
- Escrever o tratamento de exceções com try/catch/finally
- Escrever o lançamento de exceções com throws/throw
- Compreender e utilizar a hierarquia de exceções do Java
- Utilizar os construtores com parâmetros da classe String
- Utilizar os métodos da classe String
- Compreender as principais diferenças entre as classes String e StringBuilder
- Utilizar os métodos da classe StringBuilder

## TAREFAS

1. Coleção de objetos do tipo Pessoa
   > A estrutura do programa é composta por um vetor com 100 posições, de objetos da classe Pessoa.
2. Existem dois tipos de pessoa
    >No seu cadastro, uma pessoa pode ser um professor ou um aluno.
3. Aluno e Professor são filhas de Pessoa
    > Ambos devem herdar atributos da classe Pessoa, mas também devem ter os seus atributos específicos.
4. Tratamento no menu
    >O cadastro de professor e de aluno (opções 1 e 2 do menu) deve tratar a entrada de dados.
5. Informar o código gerado após o cadastro
   > Ao cadastrar um professor ou um aluno, o programa deve informar o código gerado, que é o índice do vetor.
6. O código será usado nas consultas
    >Esse índice deve viabilizar a consulta da situação de um docente/discente (item 3 do menu).
7. O usuário informa o código e tem os dados como retorno
    > Ao realizar a consulta, o programa deve perguntar o código, e retornar a informação do docente/discente pesquisado.
8. Método de impressão para apresentar os dados das pessoas
    > Essa informação deve ser retornada a partir da chamada de um método imprimir() da classe Pessoa, que deve ser
    > implementada em Aluno e Professor com o retorno dos atributos gerais de uma pessoa, e os atributos específicos de
    > cada classe, através do conceito de polimorfismo. Trabalhem com o conceito de toString colocando as informações
    > específicas das classes filhas e o método de impressão apenas na classe mãe.
9. Os atributos das classes serão definidos pelo aluno.
    > Os dados de uma pessoa, comuns ao aluno e ao professor, e os dados específicos de aluno e de professor serão criados
    > por você.
10. Criação de métodos de negócio
    > Você também deve criar métodos específicos para Aluno e Professor.
11. Sobrecarga de construtores e de métodos
    > Desenvolva construtores para as classes. Crie sobrecargas de construtores/métodos..
12. Aplique o conceito de encapsulamento nos atributos
    > Defina os atributos privados para cada classe e getters/setters públicos, seguindo os padrões de encapsulamento.
13. Criação da classe de teste com o método main
    > Crie uma classe que deve conter o método main para a execução do programa e realize alguns testes para demonstrar o
    > funcionamento dele, criando instâncias dos objetos e realizando chamadas de métodos.
14. Identificar pontos de exceção
    >Percorra o código do seu programa, com o foco em possíveis erros que ele pode lançar