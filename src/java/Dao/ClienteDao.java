/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Model.Cliente;
import java.util.List;

/**
 *
 * @author Abenzoar
 */
public interface ClienteDao {
    
    public List<Cliente> listaClientes();
    public void insertarCliente(Cliente cliente);
    public void modificarCliente (Cliente cliente);
    
}
