# 📌 Gerenciador de Ferramentas

Sistema full stack desenvolvido com Spring Boot, PostgreSQL e frontend estático para gerenciamento de ferramentas.

---

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA (Hibernate)
- PostgreSQL
- Docker
- HTML, CSS, JavaScript
- Swagger (SpringDoc)

---

## 📁 Estrutura do Projeto

```
src
├── main
│ ├── java
│ │ └── br.com.rocha.spring_boot_lab3
│ │ ├── controller
│ │ │ └── FerramentaController
│ │ │
│ │ ├── service
│ │ │ └── FerramentaService
│ │ │
│ │ ├── database
│ │ │ ├── model
│ │ │ │ └── Ferramenta
│ │ │ │
│ │ │ └── repository
│ │ │ └── FerramentaRepository
│ │ │
│ │ └── SpringBootLab3Application
│ │
│ └── resources
│ ├── static
│ │ ├── index.html
│ │ ├── style.css
│ │ ├── app.js
│ │ └── fonts/
│ │
│ └── application.properties

```

--- 

## 📦 Descrição dos Componentes

---

### 📁 controller

Responsável por expor os endpoints da API.

📌 Classe:
- `FerramentaController`

Funções:
- Receber requisições HTTP
- Mapear rotas (GET, POST, PUT, DELETE)
- Retornar respostas para o frontend

---

### 📁 service

Responsável pela lógica de negócio.

📌 Classe:
- `FerramentaService`

Funções:
- Processar regras da aplicação
- Validar dados
- Intermediar Controller e Repository

---

### 📁 database.model

Representa a entidade do banco de dados.

📌 Classe:
- `Ferramenta`

Atributos principais:
- `lote` (ID)
- `nomeFerramenta`
- `nivelDificuldade`

---

### 📁 database.repository

Responsável pelo acesso ao banco de dados.

📌 Interface:
- `FerramentaRepository`

Funções:
- CRUD automático com `JpaRepository`

---

### 📁 resources/static

Contém o frontend da aplicação.

Arquivos:

- `index.html` → interface do usuário  
- `style.css` → estilização  
- `app.js` → comunicação com backend (API)  
- `fonts/` → fontes personalizadas  

---

### ⚙️ application.properties

Arquivo de configuração da aplicação:

- conexão com banco PostgreSQL  
- configurações do Hibernate  
- configurações do Spring  

---

## 🌐 API REST

Base URL: http://localhost:8080/v1/ferramenta

## 🧪 Testes com Swagger

Acesse: http://localhost:8080/swagger-ui/index.html

## 🧪 Testes com Front-end

Acesse: http://localhost:8080/index.html

--- 

## 🐘 Banco de Dados

- PostgreSQL rodando via Docker

Configuração padrão:
Host: localhost
Porta: 5432
Database: ferramentadb

(Pode ser visualizado dentro de *application.properties*)

--- 

## ▶️ Como executar o projeto

1. Subir o container Docker com PostgreSQL
   - docker-compose up -d
   - docker ps 
3. Rodar a aplicação Spring Boot  
4. Acessar no navegador  

---

## 🎯 Funcionalidades

- Cadastro de ferramentas  
- Listagem de registros  
- Edição de dados  
- Exclusão de registros  
- Integração com banco de dados  
- Interface web integrada  

---

## 📚 Aprendizados

- Desenvolvimento de API REST com Spring Boot  
- Integração com banco PostgreSQL  
- Uso de Docker para banco de dados  
- Arquitetura em camadas  
- Consumo de API com JavaScript (fetch)  

---

## 🚀 Possíveis melhorias

- Implementar DTOs  
- Validações com Bean Validation  
- Interface com Bootstrap  
- Autenticação (Spring Security)  
- Paginação de dados  
