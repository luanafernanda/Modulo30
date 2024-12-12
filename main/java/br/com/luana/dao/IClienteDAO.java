package br.com.luana.dao;

import br.com.luana.dao.generic.IGenericDAO;
import br.com.luana.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {
    // Métodos adicionais específicos para Cliente podem ser adicionados aqui
}
