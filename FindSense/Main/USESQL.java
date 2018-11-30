import java.sql.*;
import java.util.Scanner;

public class USESQL {
    public static void main (String[] args){
        try {
            // 1.get a connection a database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String connectionUrl = "jdbc:mysql://localhost/head";
            Connection connection = DriverManager.getConnection(connectionUrl, "root", "");
            //2. create statement
            Statement st = connection.createStatement();
            //3. execute SQL query
            String sr;
            Scanner scan = new Scanner(System.in);
            sr = scan.next();

            String my = "SELECT * FROM wnc_xlsx_wn20_bc WHERE ID = +sr+ ";
            int found = st.executeUpdate(my);
            System.out.println("Row Affected : " + found);
            System.out.println("Found it.");
        }
        catch (Exception exc){
            exc.printStackTrace();
            System.out.println(exc+ "xaxa not found");
        }
    }
}
