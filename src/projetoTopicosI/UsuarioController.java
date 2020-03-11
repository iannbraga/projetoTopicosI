package projetoTopicosI;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class UsuarioController {

	private String usuario;
	private String senha;
	
	public String entrar() {
		
		if(usuario.equals("braga") && senha.equals("123")) {
			System.out.println("Logado com sucesso!");
			//return "index.xhtml?faces-redirect=true";
			return "index.xhtml";
			
		}
		else {
			return null;
		}
	}

	
	
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
