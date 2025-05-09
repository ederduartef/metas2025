# 🗓️ Metas 2025

Projeto Spring Boot para criação e gerenciamento de metas pessoais.

##  Funcionalidades

- Adicionar metas com título, descrição, categoria e prazo
- Listar metas cadastradas
- Interface web simples com Thymeleaf
- Banco de dados MySQL integrado

##  Tecnologias usadas

- Java 17
- HTML
- CSS
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL
- GitHub + GitHub Desktop

##  Como rodar o projeto

###  Pré-requisitos

- Java 17 instalado
- MySQL rodando
- IntelliJ ou outra IDE

##  Configuração do Banco de Dados

Crie um banco no MySQL:

```sql
CREATE DATABASE metasdb; 
```
Abra o arquivo `src/main/resources/application.properties` e configure da seguinte forma:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/metasdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
##  Rodando o projeto

Clone o repositório:
```
git clone https://github.com/seu-usuario/metas2025.git
```
- Abra o projeto no IntelliJ IDEA.
- Execute a aplicação pela classe `Metas2025Application.java`.
- Acesse no navegador: `http://localhost:8080/metas`

## Estrutura do projeto
```
src
├── controllers      → Controladores web (Spring MVC)
├── models           → Entidades (tabelaMetas)
├── repositories     → Interfaces para acessar o banco
├── templates        → Páginas HTML (Thymeleaf)
└── Metas2025Application.java → Classe principal
