# Cadastro de Pessoas

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.2-green)
![Angular](https://img.shields.io/badge/Angular-Latest-red)
![Oracle](https://img.shields.io/badge/Oracle-XE-blue)

Este projeto é uma aplicação fullstack para cadastro e listagem de pessoas, utilizando Java Spring Boot no backend e Angular no frontend.

## 🚀 Funcionalidades

- Cadastro de pessoas com nome
- Listagem de pessoas cadastradas
- Integração com banco de dados Oracle XE

## 🛠️ Tecnologias Utilizadas

### Backend
- Java 17
- Spring Boot 3.3.2
- Spring Data JPA
- Oracle XE Database

### Frontend
- Angular (versão mais recente)
- TypeScript
- HTML/CSS

## 📋 Pré-requisitos

- JDK 17
- Node.js e npm
- Angular CLI
- Oracle XE Database

## 🔧 Configuração e Instalação

### Backend (Spring Boot)

1. Clone o repositório
2. Navegue até a pasta do backend
3. Configure o banco de dados no arquivo `application.properties`:
```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XE
spring.datasource.username=SYSTEM
spring.datasource.password=123
./mvnw spring-boot:run
