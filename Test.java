package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Brak sterownika Oracle JDBC.");
		}
		System.out.println("Sterownik Oracle JDBC zosta³ zarejestrowany.");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@ora3.elka.pw.edu.pl:1521:ora3inf", "mparafin", "mparafin");
		} catch (SQLException ex) {
			System.out.println("B³¹d ³¹czenia z baz¹! " + ex.getMessage());
			return;
		}
		try {
			connection.close(); System.out.println("Po³¹czenie closed.");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
