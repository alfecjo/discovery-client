# Spring Discovery Client App 🚀

Este é um exemplo de aplicação **Spring Boot** que utiliza o **Discovery Client** com **Eureka** para registro e descoberta de serviços. Essa abordagem permite que microserviços se comuniquem entre si sem a necessidade de configurações manuais de endereços de IP ou URLs.

## Tecnologias Utilizadas 🛠️

- **Spring Boot** - Framework para desenvolvimento de aplicativos Java.
- **Spring Cloud** - Conjunto de ferramentas para construir sistemas baseados em microserviços.
- **Spring Cloud Netflix Eureka** - Para registro e descoberta de serviços.
- **Spring Web** - Para criar endpoints REST.
- **Maven** - Para gerenciamento de dependências e construção do projeto.

## Funcionalidades ⚙️

- Registro da aplicação como um cliente de serviço no Eureka.
- Descoberta de outros serviços registrados via Eureka.
- Comunicação entre microserviços utilizando o **Discovery Client**.

## Pré-requisitos 🚨

Antes de rodar a aplicação, você precisa de:

- **Java 17** ou superior.
- **Maven** para gerenciamento de dependências.
- **Spring Cloud Eureka Server** em execução (caso você queira testar localmente).
- IDE de sua escolha (recomendamos VSCode, IntelliJ IDEA ou Eclipse).

## Como Rodar o Projeto 🚀

### 1. Clone o repositório

```bash
git clone https://github.com/alfecjo/discoveryclient.git
cd discoveryclient
```

## Uso
- curl http://localhost:8081/helloWorld
- curl http://host.docker.internal:8081/helloWorld
- curl http://localhost:8082/helloEureka
- curl http://host.docker.internal:8082/helloEureka
- curl http://localhost:8081/actuator/info
- curl http://host.docker.internal:8081/actuator/info
- curl http://localhost:8082/actuator/info
- curl http://host.docker.internal:8082/actuator/info

---

- ## Return
  [![Main Page](https://img.shields.io/badge/Main-Page?style=for-the-badge&logo=github&logoColor=white)](https://github.com/alfecjo/java-spring-testes/tree/main)

