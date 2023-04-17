package dio.web.api.model;

public class Usuario {
	private Integer id;
	private String nome;
	private String password;

	public Usuario() {
	}

	public Usuario(Integer id, String nome, String password) {
		this.id = id;
		this.nome = nome;
		this.password = password;
	}

	public Usuario(String nome, String password) {
		this.nome = nome;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", password=" + password + "]";
	}
}