import java.sql.*;

    fun main(args: Array<String>) {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            val myConn: Connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/hscc_pizza", "root", "");

            val statement: Statement = myConn.createStatement();

            val myRs: ResultSet = statement.executeQuery("SELECT * FROM pizza");

            while (myRs.next()) {
                println("Selected Pizza Type: ${myRs.getString("selected_type")}");
            }
        } catch(exc: Exception) {
            println("Something isn't right.");
            exc.printStackTrace();
        }

    }