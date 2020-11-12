/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ExampleApp {
    public static void main(String[] args) {
        JDBCAccess jc = new JDBCAccess(DbCred.url, DbCred.user, DbCred.password);
        ResultSet result = jc.executeQuery("select * from person");
        try {
            while (result.next()) {
                System.out.println(result.getInt("personid") + "," + result.getString("surname") + "," + result.getString("prename"));
            }
            result.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
            try {
                if (result != null) result.close();
            } catch (SQLException s) {
                System.out.println(s.toString());
            }
        }
        jc.close_database();
    }
}
