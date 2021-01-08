/**
 * @author Dustin Eikmeier
 * @version 1.0
 * @since 1.8
 */

package database;

import java.sql.*;

public class JDBC_Connection {
    // private variables to encapsulate database tier
    private Connection dbcon;
    private Statement stmt;

    JDBC_Connection(String db_url, String username, String password) {
// create database connection and a statement object to sent queries
        try {
            dbcon = DriverManager.getConnection(db_url, username, password);
            stmt = dbcon.createStatement();
        } catch (Exception e) {
            System.out.println("Can't get a connection: " + e.toString());
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException f) {
            }
            try {
                if (dbcon != null) dbcon.close();
            } catch (SQLException f) {
            }
            System.exit(0);
        }
    }

// Method to send queries to DB-Server, Returns ResultSet if query successfull

    // null otherwise
    ResultSet executeQuery(String query) {
        try {
            return stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Can't execute Query!" + e.toString());
        }
        return null;
    }

    ;

    // Method to close the database
    void close_database() {
        try {
            if (stmt != null) stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (dbcon != null) dbcon.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Database closed");
    }
}
