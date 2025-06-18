
# 🤖 **AI Tools Suite com Spring AI**

## 1\. Descrição

O **AI Tools Suite** é uma plataforma de Inteligência Artificial que demonstra a integração de múltiplos modelos de IA em uma aplicação web robusta, desenvolvida com Java e Spring Boot. A suíte oferece um conjunto de ferramentas inteligentes, incluindo um chat conversacional (similar ao ChatGPT), um gerador de imagens a partir de descrições textuais e um assistente de culinária para criar receitas. O projeto utiliza o poder do **Spring AI** para se conectar de forma simplificada à **API da OpenAI**, mostrando como construir aplicações modernas e inteligentes.

-----

## 2\. Recursos

  - **Chat Conversacional**: Interaja com um assistente de IA para obter respostas, auxílio e conversas fluidas.
  - **Gerador de Imagens**: Transforme suas ideias em imagens. Basta descrever o que você quer ver e a IA criará uma representação visual.
  - **Assistente de Culinária**: Não sabe o que cozinhar? Forneça os ingredientes que você tem e o assistente criará uma receita deliciosa para você.
  - **Integração Simplificada**: Demonstração prática de como o framework Spring AI facilita a comunicação com modelos de linguagem e imagem.


-----

## 3\. Tecnologias Utilizadas

| Item | Descrição |
| :--- | :--- |
| **Linguagem** | Java (JDK 17+) |
| **Framework Principal** | Spring Boot |
| **Framework de IA** | Spring AI |
| **Serviço de IA** | OpenAI API |
| **Gerenciador de Dependências**| Maven |
| **Servidor de Aplicação** | Tomcat Embutido |

-----

## 4\. Pré-requisitos

Antes de iniciar, certifique-se de ter as seguintes ferramentas instaladas em seu ambiente:

  - [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (versão 17 ou superior)
  - [Apache Maven](https://maven.apache.org/download.cgi) (versão 3.8 ou superior)
  - Uma **chave de API da OpenAI**. Você pode obtê-la no [site da OpenAI](https://platform.openai.com/api-keys).

-----

## 5\. Configuração e Execução

1.  **Clone o repositório:**

    ```bash
    git clone https://github.com/viniciusoliveira-27/projeto-spring-ai.git
    cd projeto-spring-ai
    ```

2.  **Configure a chave da API:**

      - Vá para o diretório `src/main/resources/`.
      - Renomeie o arquivo `application.properties.example` para `application.properties`.
      - Abra o arquivo `application.properties` e insira sua chave da API da OpenAI no campo correspondente:
        ```properties
        spring.ai.openai.api-key=SUA_CHAVE_API_AQUI
        ```

3.  **Instale as dependências e compile o projeto:**

    ```bash
    mvn clean install
    ```

4.  **Execute a aplicação:**

    ```bash
    mvn spring-boot:run
    ```

5.  A aplicação estará disponível no endereço: `http://localhost:8080`. Você pode usar ferramentas como o Postman ou Insomnia para testar os endpoints da API.

-----

## 6\. Estrutura do Projeto

A estrutura de diretórios segue o padrão de projetos Spring Boot:

```
src/
└── main/
    ├── java/
    │   └── com/
    │       └── vsoliveira/
    │           └── projeto_spring_ai/
    │               ├── controller/       # Camada de apresentação (REST Controllers)
    │               ├── service/          # Camada de serviço (lógica de negócio e IA)
    │               └── model/            # DTOs e entidades (se aplicável)
    │
    └── resources/
        ├── static/                       # Arquivos estáticos (HTML, CSS, JS)
        ├── templates/                    # Templates de view (se aplicável)
        └── application.properties        # Arquivo de configuração da aplicação

pom.xml                                   # Arquivo de configuração do Maven
```

-----

## 7\. Como Contribuir

1.  Faça um **fork** do projeto.
2.  Crie uma nova branch com a sua feature (`git checkout -b minha-feature`).
3.  Faça o **commit** das suas mudanças (`git commit -m 'Adiciona nova feature'`).
4.  Faça o **push** para a sua branch (`git push origin minha-feature`).
5.  Abra um **Pull Request**.
