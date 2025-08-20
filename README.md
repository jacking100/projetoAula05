# 📝 Projeto Aula 05 - CRUD de Pessoas em Java

Este projeto é um **CRUD (Create, Read, Update, Delete)** desenvolvido em **Java**, utilizando **JDBC** para conexão com banco de dados **MySQL**.  
Ele roda em modo **console** e permite o gerenciamento de pessoas (cadastro, atualização, exclusão e consulta).

---

## 🚀 Funcionalidades
- Cadastrar uma nova pessoa ✅
- Atualizar dados de uma pessoa existente ✅
- Excluir uma pessoa pelo ID ✅
- Consultar lista de pessoas cadastradas ✅

---

## 🛠️ Tecnologias Utilizadas
- **Java 17+**
- **MySQL 8+**
- **JDBC (Java Database Connectivity)**
- **Paradigma de Camadas (MVC simplificado)**

---

## 📂 Estrutura do Projeto

projetoAula05
│
├── principal
│ └── Main.java # Classe principal (menu do sistema)
│
├── controllers
│ └── PessoaController.java # Regras de negócio (operações CRUD)
│
├── entities
│ └── Pessoa.java # Entidade que representa a tabela Pessoa
│
├── repositories
│ └── PessoaRepository.java # Acesso ao banco de dados via JDBC
│
├── factories
│ └── ConnectionFactory.java # Classe responsável pela conexão com o MySQL
│
└── resources
└── script.sql # Script de criação do banco e tabela

