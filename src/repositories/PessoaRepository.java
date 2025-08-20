package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Pessoa;
import factories.ConnectionFactory;

public class PessoaRepository {

	private ConnectionFactory connectionFactory = new ConnectionFactory();

	public void inserir(Pessoa pessoa) throws Exception {

		var sql = """
						insert into pessoa(nome, cpf)
						values(?,?)
				""";

		var connection = connectionFactory.getConnection();

		var statement = connection.prepareStatement(sql);
		statement.setString(1, pessoa.getNome());
		statement.setString(2, pessoa.getCpf());
		statement.execute();

		connection.close();

	}

	public boolean atualizar(Pessoa pessoa) throws Exception {

		var sql = """
				          update pessoa
				          set nome = ?, cpf = ?
				          where id = ?
				""";

		var connection = connectionFactory.getConnection();

		var statement = connection.prepareStatement(sql);
		statement.setString(1, pessoa.getNome());
		statement.setString(2, pessoa.getCpf());
		statement.setInt(3, pessoa.getId());
		var rowsAffected = statement.executeUpdate();

		connection.close();

		return rowsAffected > 0;
	}

	public boolean excluir(Integer id) throws Exception {

		var sql = """
						delete from pessoa
						where id = ?

				""";

		var connection = connectionFactory.getConnection();

		var statement = connection.prepareStatement(sql);
		statement.setInt(1, id);
		var rowsAffected = statement.executeUpdate();

		return rowsAffected > 0;
	}

	public List<Pessoa> consultar() throws Exception {

		var sql = """
						select id, nome, cpf
						from pessoa
						order by id asc

				""";
		
		var connection = connectionFactory.getConnection();
		
		var statement = connection.prepareStatement(sql);
		var result = statement.executeQuery();
		
		var lista = new ArrayList<Pessoa>();
		
		while(result.next()) {
			
			var pessoa = new Pessoa();
			
			pessoa.setId(result.getInt("id"));
			pessoa.setNome(result.getString("nome"));
			pessoa.setCpf(result.getString("cpf"));
			
			lista.add(pessoa);
		}
		
		connection.close();

		return lista;
	}

}
