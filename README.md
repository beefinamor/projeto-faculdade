# Projeto Faculdade - Sistema de Usuários

Este projeto é uma aplicação simples em **Java** desenvolvida para fins acadêmicos.  
O sistema segue a arquitetura **MVC (Model-View-Controller)**, com classes organizadas em pacotes separados.

---

## 📂 Estrutura do Projeto

- **Model**: contém as classes de domínio do sistema (`Usuario`, `Perfil`).
- **Controller**: gerencia a lógica de negócio, recebendo dados da View e manipulando o Model.
- **View**: ponto de entrada da aplicação (`Main.java`).

---

## 🚀 Funcionalidades

- Cadastro de usuários.
- Associação de um **Perfil** a cada usuário.
- Exibição das informações cadastradas.

---

## 🛠️ Tecnologias Utilizadas

- [Java 17+](https://www.oracle.com/java/technologies/downloads/)
- Visual Studio Code
- Paradigma de programação orientada a objetos (POO).
- Arquitetura **MVC**.

---

## ▶️ Como Executar

1. Clone este repositório:

   ```bash
   git clone https://github.com/SEU-USUARIO/projeto-faculdade.git
   cd projeto-faculdade

   ```

2. Compile os arquivos .java:

   ```bash
   javac Controller/_.java Model/_.java View/\*.java

   ```

3. Execute a aplicação:
   ```bash
   java View.Main
   ```

## 📖 Exemplo de Uso

Perfil admin = new Perfil("Administrador");
Usuario user = new Usuario("Maria", admin);

System.out.println(user);
// Saída esperada: Usuario: Maria | Perfil: Administrador

## 👩‍💻 Autor

Projeto desenvolvido por Beatriz Finamor para a disciplina de Programação de Soluções Computacionais.
