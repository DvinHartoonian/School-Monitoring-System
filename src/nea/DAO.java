
package nea;

import java.sql.*;

public class DAO {
    private static String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://FAMILY-PC\\SQLEXPRESS; integratedSecurity=true; database=NEA";
    private static Connection conn;
    private static Statement stmt = null;
    
    public static Connection dbConnection() throws Exception {
        Class.forName(driverClass);
        conn = DriverManager.getConnection(url);
        stmt = conn.createStatement();
        stmt = conn.createStatement();
        return conn;
    }
    
    public static void viewData(String query) {
        ResultSet rs = null;
        
        try {
            DAO.dbConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("TeacherID"));
                System.out.println(rs.getString("DutyTeacher"));
                System.out.println(rs.getString("TeacherEmail"));
            }
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public static void insertData(String table, String[] Values) {
        ResultSet rs = null;
        
        try {
            String query = "INSERT INTO Teachers (\"TeacherID\", \"DutyTeacher\", \"TeacherEmail\") " +
                    "VALUES ('T0001', 'Camilla Denby', 'cdenby@williamperkin.org.uk')";
            DAO.dbConnection();
            stmt = conn.createStatement();
            int rowsAdded = stmt.executeUpdate(query);
            if(rowsAdded != 1){
                System.out.println("Failed Update.");
            }
            else {
                System.out.println("Passed Update.");
            }
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
            
}
