# Single Responsability Principle

### Minhas mudanças

- Criei pacotes com classes diferentes, separando cada processo da God Class
  - `ProcessadorRepository`
  - `ProcessadorView`
  - `ProcessadorService`
- Removi comentários desnecessesários
- Separei o método main da God Class e reescrevi em uma classe `Main` própria
- Identei o código, facilitando a compreensão do mesmo

### Mudanças pensadas

- Criar uma classe abstrata com os métodos da God Class, salvo a `Main`, para que as outras classes pudessem implementar os seus métodos específicos
- Simplificar os métodos, também aplicando o SRP, ou seja, mais métodos separando as suas responsabilidades
