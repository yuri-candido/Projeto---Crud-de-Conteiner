package porto.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {
	
	private static final String USUARIO = "root";
	private static final String SENHA= "";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/porto";
	
	
	public static Connection conexaoMySQL () throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USUARIO, SENHA);
		
		return connection;
	}
	
	public static void man(String[] args) throws Exception {
		Connection con = conexaoMySQL();
		
		if (con!= null) {
			System.out.print("Conexão obtida!");
			con.close();
		}
	}
}
