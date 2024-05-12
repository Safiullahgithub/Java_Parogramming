import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcdemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String sql = "select * from student";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getInt(3));
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
