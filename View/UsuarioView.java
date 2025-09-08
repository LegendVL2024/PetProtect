package view;

import model.Usuario;
import java.util.List;

public class UsuarioView {

    public void mostrarUsuarios(List<Usuario> usuarios) {
        System.out.println("=== Lista de Usuários ===");
        for (Usuario u : usuarios) {
            System.out.println(u); // usa o toString() do model Usuario
        }
    }
}
