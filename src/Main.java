import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conection = DriverManager.getConnection("jdbc:sqlite");
        Statement statement = conection.createStatement();
        ResultSet resulset = statement.executeQuery("select * from telefonia");

        while(resulset.next()) {

        }


    }
}
