import java.sql.*;

    fun main(args: Array<String>) {

        try {
            val myConn: Connection = DriverManager.getConnection("jdbc:mysql://localhost:80/hscc_pizza", "root", "");

            val statement: Statement = myConn.createStatement();

            val myRs: ResultSet = statement.executeQuery("SELECT * FROM pizza");

            while (myRs.next()) {
                println("Selected Pizza Type: ${myRs.getString("selected_type")}")
            }
        } catch(exc: IllegalAccessError) {
            exc.printStackTrace();
        }

    }