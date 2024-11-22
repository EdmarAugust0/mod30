/**
 * 
 */
package br.com.edmar.services;

import br.com.edmar.domain.Cliente;
import br.com.edmar.exceptions.DAOException;
import br.com.edmar.exceptions.TipoChaveNaoEncontradaException;
import br.com.edmar.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
