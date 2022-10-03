        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.Statement;
        
        import com.pes.test.db.DatabaseConnection;

        public class DisplayAll {
        public static void main(String[] args) {
        try{
            Connection con = DatabaseConnection.initializeDatabase();
  
            // Create a SQL query to insert data into demo table
            // demo table consists of two columns, so two '?' is used
            PreparedStatement st = con.prepareStatement("Select * from odecet");
                //to execute query
                ResultSet rs = smt.executeQuery(q);
                //to print the resultset on console
                if (st.next()){
        do{
        out.println(st.getString(1) + "," + st.getString(2) + "," + st.getString(3) + "," + st.getString(4) + "," + st.getString(5));
        }while (st.next());
        }
        else{
        out.println("Record Not Found...");
        }
        con.close();
        }
        catch (Exception e){
        System.out.println(e);
        }
        }
        }
 /**
import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.util.ArrayList;
        import java.util.HashMap;
        import com.mysql.jdbc.Statement;
        import com.pes.test.db.DatabaseConnection;
        import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
        import java.sql.Date;
        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        public class TableValuesDemo {
        public static void main(String[] args) {
        Connection con = null;
                Statement statement = null;
                try {
                HashMap hm = new HashMap < > ();
                        Connection con = DatabaseConnection.initializeDatabase();
                        // Create a SQL query to insert data into demo table
                        // demo table consists of two columns, so two '?' is used
                        PreparedStatement resultSet = con.prepareStatement("select * from Odecet");
                        while (resultSet.next()) {
                hm.put(resultSet.getInt("Id").resultSet.getString("String"), resultSet.getString("Stav"));
                }
                System.out.println(hm);
                } catch (Exception e) {
        e.printStackTrace();
        }
        }
        }
*/        