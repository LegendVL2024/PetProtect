package controller;

import model.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UsuarioController {

    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        
        // Mock data for demonstration
        usuarios.add(new Usuario(1, "João Silva", java.sql.Date.valueOf("1990-01-15"), "joao@email.com", "123.456.789-00"));
        usuarios.add(new Usuario(2, "Maria Santos", java.sql.Date.valueOf("1985-05-20"), "maria@email.com", "987.654.321-00"));
        usuarios.add(new Usuario(3, "Pedro Oliveira", java.sql.Date.valueOf("1992-12-10"), "pedro@email.com", "456.789.123-00"));

        return usuarios;
    }
}
