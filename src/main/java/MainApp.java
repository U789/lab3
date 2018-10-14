import java.sql.*;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
      //  System.out.println(Locale.getDefault());
        try {
            // создаем подключение
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl",
                    "books", "sys");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "select*from books.author where id = 2154");
            // выводим результат запроса
            while (rs.next()) {
                System.out.println(rs.getString("NAME"));
                System.out.println(rs.getString("PHONE_NUMBER"));
            }

            connection.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}