package br.com.poliveira.dao;

import java.util.Collection;

import br.com.poliveira.domain.Cliente;

/**
 * @author PatrickAOliveira
 *         IClienteDAO
 */
public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
