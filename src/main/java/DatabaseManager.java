import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/freelancer_platform";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void createTables() {
        String userTable = "CREATE TABLE IF NOT EXISTS user (\"CREATE TABLE IF NOT EXISTS users (\" +\n" +
                "                            \"id INT AUTO_INCREMENT PRIMARY KEY, \" +\n" +
                "                            \"name VARCHAR(100), \" +\n" +
                "                            \"email VARCHAR(100) UNIQUE, \" +\n" +
                "                            \"role VARCHAR(50));\";);";
        try (Connection connection = getConnection(); Statement statement = connection.createStatement()) {
            statement.execute(userTable);
            System.out.println("Tablolar oluşturuldu.");
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        }
    }

}
