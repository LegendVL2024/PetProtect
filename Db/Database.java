package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public static Connection getConnection() throws SQLException {
        String url = //substituir por link do Neon
            "jdbc:postgresql://ep-snowy-bread-ady0xnm4-pooler.c-2.us-east-1.aws.neon.tech/neondb?user=neondb_owner&password=npg_fgxZz8keYVj3&sslmode=require";

        try {
            Class.forName("org.postgresql.Driver"); 

        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver PostgreSQL não encontrado!", e);
        }

        return DriverManager.getConnection(url);
    }
}
