import java.sql.*;
import java.util.Scanner;

public class UseSQL {
    public static void main(String[] args) {
        try {

            // 1.get a connection a database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String connectionUrl = "jdbc:mysql://localhost/head";
            Connection connection = DriverManager.getConnection(connectionUrl, "root", "");
            // 2. create statement
            Statement st = connection.createStatement();
            // 3. execute SQL query

            String sr;
            Scanner scan = new Scanner(System.in);
            sr = scan.next();

            String my= "SELECT d.headid AS id, d.cat AS cat, d.head_word AS word, s.senseid, s.sense, s.sense_coll, " +
                    "s.sense_trans, s.headid FROM dic_head d JOIN dic_sense s ON d.headid = s.headid WHERE d.headid ='100013' " ;
            int found = st.executeUpdate(my);
            System.out.println("Row Affected : " + found);
            System.out.println("Found it.");

        } catch (Exception exc) {
            exc.printStackTrace();
            System.out.println("hah");
        }
    }
}
