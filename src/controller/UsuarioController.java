package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import model.Usuario;

@Named
@RequestScoped
public class UsuarioController {

	Usuario usuario;
	
	public String entrar() {
		if(getUsuario().getLogin().equals("braga") && getUsuario().getSenha().equals("123")
				|| getUsuario().getLogin().equals("adm") && getUsuario().getSenha().equals("adm")
					|| getUsuario().getLogin().equals("pedro") && getUsuario().getSenha().equals("321")) {
			
			System.out.println("Logado com sucesso!");
			return "patrimonio.xhtml";
		}
		else {
			return "";
		}
	}

	public Usuario getUsuario() {
		if (usuario == null)
			usuario = new Usuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
