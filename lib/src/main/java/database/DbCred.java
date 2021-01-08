package database;

public interface DbCred {
  /**
   * Credentials for simulated database.
   */

  final String driverClass = "org.postgresql.Driver";
  final String url = "jdbc:postgresql://192.168.178.49:5432/gma";
  final String user = "gma";
  final String password = "gma";
}
