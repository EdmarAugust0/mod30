/**
 * 
 */
package br.com.edmar.services;

import br.com.edmar.dao.IProdutoDAO;
import br.com.edmar.domain.Produto;
import br.com.edmar.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
