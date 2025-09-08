package View;

import Model.Veterinario;
import java.util.List;

public class VeterinarioView {

    public void mostrarVeterinarios(List<Veterinario> veterinarios) {
        System.out.println("=== Lista de Veterinários ===");
        for (Veterinario v : veterinarios) {
            System.out.println(v); 
        }
    }
}
