/**
 * 
 */
package br.com.edmar.dao;

import br.com.edmar.dao.generic.IGenericDAO;
import br.com.edmar.domain.Venda;
import br.com.edmar.exceptions.DAOException;
import br.com.edmar.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
