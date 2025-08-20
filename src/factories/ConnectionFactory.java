package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection() throws Exception{
		
		var host = "jdbc:mysql://localhost:3306/bd_projetoaula05?useSSL=false&serverTimezone=UTC";
		var user = "root";
		var pass = "coti";
		
		return DriverManager.getConnection(host, user, pass);
	}

}
