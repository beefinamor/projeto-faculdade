package view;

import java.util.Scanner;
import controller.UsuarioController;
import model.Usuario;
import model.Perfil;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioController usuarioController = new UsuarioController();
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Listar Usuários");
            System.out.println("3 - Buscar Usuário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Login: ");
                    String login = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    Perfil perfil = new Perfil("Colaborador"); // exemplo
                    Usuario usuario = new Usuario(nome, cpf, email, cargo, login, senha, perfil);
                    usuarioController.adicionarUsuario(usuario);
                    break;

                case 2:
                    usuarioController.listarUsuarios();
                    break;

                case 3:
                    System.out.print("Digite o login do usuário: ");
                    String buscaLogin = scanner.nextLine();
                    usuarioController.buscarUsuario(buscaLogin);
                    break;

                case 0:
                    executando = false;
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
