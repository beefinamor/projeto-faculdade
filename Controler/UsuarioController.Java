package controller;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class UsuarioController {
    private List<Usuario> usuarios;

    public UsuarioController() {
        this.usuarios = new ArrayList<>();
    }

    // Adicionar novo usuário
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso: " + usuario.getNome());
    }

    // Listar todos os usuários
    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("\n=== Lista de Usuários ===");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

    // Buscar usuário pelo login
    public void buscarUsuario(String login) {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equalsIgnoreCase(login)) {
                System.out.println("Usuário encontrado: " + usuario);
                return;
            }
        }
        System.out.println("Usuário com login '" + login + "' não encontrado.");
    }
}
