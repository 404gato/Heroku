package org.generation.BlogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min = 5, max = 50)
	private String nome;
	
	@NotBlank
	@Size(min = 5, max = 15)
	private String usuario;
	
	@NotBlank
	@Size(min = 5)
	private String senha;
	
	private String foto;
	
	private String tipo;
	
	@OneToMany(mappedBy ="usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

	
	public Usuario(long id, String nome, String usuario, String senha) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public Usuario() {}
	
	
	//getters and setters
	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public String getTipo() {
		return tipo;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

}
