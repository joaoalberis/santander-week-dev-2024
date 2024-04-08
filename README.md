# :pushpin: Sobre
Esse projeto foi desenvolvido na semana Santader Week Dev, uma parceria entre o Santander e DIO. Nesse projeto foi feita uma API com integração com IA, o projeto consiste em uma api, onde é possivel se comunicar com 12 campeões do LOL, no qual respondem suas perguntas utilziando a personalidade única do campeão selecionado!

# :pushpin: Endpoints
- `GET /champions` :
   - Endpoint responsavel por retornar todos os dados dos campeões do banco de dados!
   - Response:
     - Status 200: Sucess
     - Status 500: Internal server error.
      
- `POST /champions/{championId}/ask`:
  - Enviar a pergunta a um campeão selecionado!
  - Path Variable:
    - `{championId}`: Inditificador do campeão
  - Request Body(JSON):
    - ```json
      {
      "question": "faça a pergunta aqui"
      }
      ```
   - Response:
     - Status 200: Pergunta enviada e resposta recebida.
     - Status 400: Error na comunicação com API da IA.
     - Status 422: Campeão não encontrado.
     - Status 500: Internal server error.

# :pushpin: Tecnologias Usadas
- Java 21
- Maven
- Spring Boot 3
- H2 DataBase

# :pushpin: Dependencias Necessárias
1. JDK 21
2. Maven

# Variáveis de Ambientes
O projeto deverá conter as seguintes variáveis de ambientes para que funcione corretamente:
1. GENERATIVE_AI_PROVIDER
   - Valores possíveis: GEMINI ou OPENAI
   - Responsável por identificar qual IA será usada nas respostas.
2. OPENAI_API_KEY:
   - Responsável por armazenar a chave da API da OpenAI.
3. GEMINI_API_KEY:
   - Responsável por armazenar a chave da API do Gemini.

# :pushpin: Rodando o Projeto
No terminal, clone o projeto:
```Markdown
git clone https://github.com/joaoalberis/santander-week-dev-2024.git
```
Entre na pasta do projeto:
```Markdown
cd /santander-week-dev-2024
```
Crie o arquivo .jar, utilizando o maven:
```Markdown
mvn clean install
```
Execute o arquivo .jar para iniciar o projeto:
```Markdown
java -jar target/nome-do-arquivo.jar
```
Agora o projeto esta disponivel na rota `http://localhost:8080`
