package br.com.exemplo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConnection() {
		Connection con= null;
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Erro- Driver"+e.getMessage());
			}
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Exemplo01","postgres","1234");
			System.out.println("Conectado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro - conexão" +e.getErrorCode());
		}return con;
	}
	
}
