package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import applicaiton.Util;
import model.Patrimonio;

public class PatrimonioController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Patrimonio patrimonio;
	private List<Patrimonio> listaPatrimonio;
	
	public void incluir() {
//		if (getPatrimonio().getNome().trim().equals("")) {
//			Util.addErrorMessage("O campo nome deve ser informado.");
//			return;
//		}
	if (getPatrimonio().getNome().isEmpty()) {
		Util.addErrorMessage("O campo nome deve ser informado.");
		return;
	}
	
		getPatrimonio().setId(proximoId());
		getListaPatrimonio().add(getPatrimonio());
		limpar();
 	}

	public void alterar() {
		// obtendo o indice de referencia da lista
		int index = listaPatrimonio.indexOf(getPatrimonio());
		// substituindo o objeto da lista pelo indice
		listaPatrimonio.set(index, getPatrimonio());
		limpar();
	}

	public void remover() {
		getListaPatrimonio().remove(getPatrimonio());
		limpar();
	}
	
	public void editar(Patrimonio usu) {
		setPatrimonio(usu.getClone());
	}

	public void limpar() {
		patrimonio = null;
	}
	
	private int proximoId() {
		int resultado = 0;
		
		for (Patrimonio patrimonio : listaPatrimonio) {
			if (patrimonio.getId() > resultado)
				resultado = patrimonio.getId();
		}
		return ++resultado;
	}
	
	public List<Patrimonio> getListaPatrimonio() {
		if (listaPatrimonio == null)
			listaPatrimonio = new ArrayList<Patrimonio>();
		return listaPatrimonio;
	}

	public Patrimonio getPatrimonio() {
		if (patrimonio == null)
			patrimonio = new Patrimonio();
		return patrimonio;
	}

	public void setPatrimonio(Patrimonio patrimonio) {
		this.patrimonio = patrimonio;
	}
}
