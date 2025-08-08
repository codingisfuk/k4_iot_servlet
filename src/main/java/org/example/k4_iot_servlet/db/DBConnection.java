package org.example.k4_iot_servlet.db;

public class DBConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/k4_iot_servlet";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.fillInStackTrace();
        }
    }
}
