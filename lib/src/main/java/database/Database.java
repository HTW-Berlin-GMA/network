/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package database;

import java.sql.SQLException;

public class Database {
    public static void main(String[] args) {
        JDBCAccess con = new JDBCAccess(DbCred.url, DbCred.user, DbCred.password);
            con.executeQuery("select * from models;");
            con.close_database();

    }
}
