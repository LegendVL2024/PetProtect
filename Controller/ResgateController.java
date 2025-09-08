package Controller;

import Db.Database;
import Model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserController {

    public List<User> listarResgate() {
        List<User> resgates = new ArrayList<>();

        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT * FROM Resgate"; 
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                User u = new User(
                        rs.getString("local_resgate"),
                        rs.getDate("data_resgate")
                        rs.getString("status"),
                        rs.getInt("id")

                );
                resgates.add(u);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resgates;
    }
}