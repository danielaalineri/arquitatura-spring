# Arquitetura Spring 🚗🔧

Projeto Java com Spring Boot que demonstra uma arquitetura limpa e flexível para aplicações backend, com foco em injeção de dependência, separação de responsabilidades e uso de interfaces para inversão de controle.

## 🧩 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Maven
- JUnit (testes)
- Lombok
- Annotations personalizadas
- Clean Architecture (camadas bem definidas)

## 📁 Estrutura do projeto

arquitetura-spring
│
├── api # Controllers e interfaces de entrada
├── application # Casos de uso da aplicação (regras de negócio)
├── domain # Entidades e contratos (interfaces)
├── infrastructure # Implementações técnicas (banco, serviços)
└── resources # Arquivos de configuração


## 🏗️ Conceitos aplicados

- **Inversão de Dependência (IoC)**: As classes não instanciam diretamente suas dependências. Interfaces e anotações personalizadas facilitam a troca de implementações.
- **Injeção de Dependência com Qualifiers personalizados**: Uso de anotações como `@Aspirado` para selecionar implementações específicas de forma clara.
- **Orientação a Objetos**: O projeto aplica fortemente os pilares de POO (abstração, encapsulamento, herança e polimorfismo).
- **Arquitetura em camadas**: Separação entre camada de apresentação (API), aplicação (casos de uso), domínio (regra de negócio) e infraestrutura.

## 🚘 Exemplo: Montadora de Carros

O projeto simula a montagem de carros com motores diferentes. Um exemplo simplificado do funcionamento:

```java
@RestController
public class CarroController {
    
    @GetMapping("/ligar")
    public String ligarCarro() {
        Carro carro = new Carro(new MotorAspirado());
        return carro.ligar();
    }
}

Com anotação personalizada:

@Component
@Aspirado
public class MotorAspirado implements Motor {
    // implementação
}

Resultado:

Carro ligado, andando com o motor io.github.danielaalineri.arquiteturaspring.montadora.MotorAspirado

🧪 Testes

O projeto inclui testes unitários para garantir o funcionamento dos componentes de forma isolada.
▶️ Como executar

git clone https://github.com/danielaalineri/arquitetura-spring.git
cd arquitetura-spring
./mvnw spring-boot:run

Acesse http://localhost:8080 para ver os endpoints em funcionamento.
📌 Objetivo do projeto

Este repositório tem como finalidade servir de estudo e demonstração de boas práticas com Java e Spring Boot em arquitetura desacoplada e escalável, ideal para quem quer entender como construir aplicações robustas com foco em manutenibilidade.

Desenvolvido por Daniela Alineri 💻
