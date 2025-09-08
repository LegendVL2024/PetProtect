package View;

import Model.User;
import java.util.List;

public class UserView {

    public void mostrarResgates(List<User> resgates) {
        System.out.println("=== Lista de resgates ===");
        for (User u : resgates) {
            System.out.println(u); 
        }
    }
}
