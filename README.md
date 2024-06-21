# API REST

Este projeto é uma API REST básica desenvolvida com Spring Boot e Java. A aplicação gerencia produtos, permitindo operações de criação, leitura, atualização e exclusão (CRUD) de produtos em um banco de dados em memória H2.

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3
- Spring Data JPA
- H2 Database

## Padrões de Projeto Utilizados

- **Repository Pattern**: `ProductRepository`
- **Service Pattern**: `ProductService` e `ProductServiceImpl`
- **Dependency Injection**: `@Autowired` no controlador e no serviço
- **Controller Pattern**: `ProductController`

## Como Executar o Projeto

1. Clone este repositório.
2. Navegue até o diretório do projeto.
3. Execute o comando:

```sh
mvn spring-boot:run
```

A aplicação estará disponível em http://localhost:8080

## Endpoints da API

A API expõe os seguintes endpoints:

### Listar todos os produtos

```bash
GET /products
```
Resposta:

```json
{
"id": 1,
"name": "Produto 1",
"price": 10.0
}
```
### Obter produto por ID

```bash
GET /products/{id}
```
Resposta:

```json
{
"id": 1,
"name": "Produto 1",
"price": 10.0
}
```

### Criar novo produto

```bash
POST /products
```
Corpo da Requisição:

```json
{
"name": "Novo Produto",
"price": 20.0
}
```

Resposta:

```json
{
"id": 2,
"name": "Novo Produto",
"price": 20.0
}
```

### Atualizar produto

```bash
PUT /products/{id}
```
Corpo da Requisição:

```json
{
"name": "Produto Atualizado",
"price": 30.0
}
```
Resposta:

```json
{
"id": 1,
"name": "Produto Atualizado",
"price": 30.0
}
```

### Deletar produto

```bash
DELETE /products/{id}
```

Resposta:

- 204 No Content: Indica que o produto foi deletado com sucesso.

