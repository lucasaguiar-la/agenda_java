package model;

public class JavaBeans {
	private String idcon;
	private String nome;
	private String tel;
	private String email;
	
	public JavaBeans() {
		super();
	}
	
	public JavaBeans(String idcon, String nome, String tel, String email) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.tel = tel;
		this.email = email;
	}

	public String getIdcon() {
		return idcon;
	}
	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
