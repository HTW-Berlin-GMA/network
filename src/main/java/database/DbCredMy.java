package database;

public interface DbCredMy {
  /**
  final String driverClass = "oracle.jdbc.driver.OracleDriver";
  final String url = "jdbc:oracle:thin:@oradbs02.f4.htw-berlin.de:1521:oradb1";
  final String user = "u569494";
  final String password = "p569494";
  final String schema = "u569494";
   */
  final String driverClass = "org.postgresql.Driver";
  final String url = "jdbc:postgresql://db.f4.htw-berlin.de:5432/_s0569494__datenbanken";
  final String user = "s0569494";
  final String password = "fV--47qU";
  final String schema = "_s0569494__datenbanken";
}
