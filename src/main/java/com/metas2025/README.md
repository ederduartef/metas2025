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

### Configurar o banco

Crie um banco no MySQL:

```sql
CREATE DATABASE metasdb; 
```
### Estrutura do projeto
```
src
├── controllers      → Controladores web (Spring MVC)
├── models           → Entidades (tabelaMetas)
├── repositories     → Interfaces para acessar o banco
├── templates        → Páginas HTML (Thymeleaf)
└── Metas2025Application.java → Classe principal
