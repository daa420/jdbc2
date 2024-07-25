import java.sql.*;

public class RetrieveDetails {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");

            // Create a statement
            Statement stmt = con.createStatement();

            // Execute the query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Process the result set
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            // Close the result set, statement, and connection
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
