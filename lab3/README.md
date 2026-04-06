# Projeto Spring Boot com Postman

Este projeto é uma API REST para gerenciar ferramentas, conectada a um banco de dados Supabase (PostgreSQL).

---

## Estrutura do projeto e para que serve cada parte

### 1. Entity (Modelo) — Ferramenta
- Representa a tabela no banco de dados.
- Cada instância é uma linha da tabela.
- Anotada com `@Entity` para o Hibernate mapear a classe para o banco.
- Contém campos (atributos) que viram colunas no banco (`id`, `nome`, `lote`, `dificuldade`).

### 2. Repository — FerramentaRepository
- Interface que herda do `JpaRepository`.
- Faz a comunicação direta com o banco usando JPA/Hibernate.
- Permite operações básicas (CRUD) sem escrever SQL manualmente.
- Exemplos: `save()`, `findById()`, `findAll()`, `deleteById()`.

### 3. Service — FerramentaService
- Camada intermediária que contém a lógica de negócio.
- Recebe dados do Controller e usa o Repository para acessar o banco.
- Permite adicionar regras, validações e tratamentos antes de salvar ou buscar dados.
- Mantém o código organizado e desacoplado.

### 4. Controller — FerramentaController
- Ponto de entrada da API REST.
- Recebe requisições HTTP (`GET`, `POST`, `PUT`, `DELETE`).
- Chama o Service para executar as operações.
- Retorna respostas HTTP para o cliente (Postman, frontend ou app).

### 5. Configuração do Banco (`application.properties`)
Define as credenciais e URL para o banco Supabase:

```properties
spring.datasource.url=jdbc:postgresql://seu-host.supabase.co:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=sua-senha
spring.jpa.hibernate.ddl-auto=update

O ddl-auto=update faz o Hibernate criar/atualizar automaticamente as tabelas com base nas Entities.
```

### 6. Supabase (PostgreSQL)

- Banco de dados na nuvem.

- Armazena os dados reais da aplicação.

- Pode ser acessado e gerenciado pelo painel web do Supabase.

- Serve como backend de dados para a API Spring Boot.

### 7. Postman

- Ferramenta para testar e consumir a API REST.

- Envia requisições HTTP para o Controller (POST para criar, GET para listar, etc.).

- Visualiza respostas da API para validar o funcionamento do backend.

- Fluxo básico da aplicação
Postman → Controller (REST API) → Service (lógica de negócio) → Repository (JPA) → Banco Supabase

- O Postman envia dados para o Controller.

- O Controller envia para o Service, que aplica regras e validações.

- O Service usa o Repository para salvar ou buscar dados no banco.

- O banco Supabase armazena os dados de forma permanente.

### Conceitos importantes

- Entity: representa tabela no banco.

- Repository: faz CRUD no banco sem escrever SQL.

- Service: contém a lógica e regras de negócio.

- Controller: interface da API REST.

- application.properties: configura a conexão com o banco.

- Supabase: banco real onde os dados ficam.

- Postman: cliente para testar a API.
