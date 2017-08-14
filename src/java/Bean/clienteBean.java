/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Dao.ClienteDao;
import Dao.ClienteDaoImplement;
import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import Model.Cliente;
import java.util.List;
import java.util.Date;

/**
 *
 * @author Abenzoar
 */
@ManagedBean
@Named(value = "clienteBean")
@SessionScoped
public class clienteBean implements Serializable {
    //Variables a utilizar
    //Variable para la entidad Cliente
    private Cliente cliente;
    
    //Variable para la lista de Clientes
    private List<Cliente> listaClientes;
    
    
    /**
     * Instancia de CLiente Bean
     */
    public clienteBean() {
        
        //Se inicializa la variable de la entidad Cliente
        cliente = new Cliente();
        
      
    }

    //<editor-fold desc="Métodos Insertar / Editar">
    
    //Método para insertar y refrescar la lista
    public void insertar(){
        //cliente = new Cliente();
        Date date = new Date();
        cliente.setTipo("G");
        cliente.setFechaRegistro(date);
        cliente.setStatus("A");
        ClienteDao clienteDao = new ClienteDaoImplement();
        clienteDao.insertarCliente(cliente);
        cliente = new Cliente();
        getListaClientes();
    }
    
    //Método para modificar el registro
    public void modificar(){
        ClienteDao clienteDao = new ClienteDaoImplement();
        clienteDao.modificarCliente(cliente);
        cliente = new Cliente();        
    }
    
    
    //</editor-fold>
    
    
    //<editor-fold desc="Métodos get / set">
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListaClientes() {
        ClienteDao clienteDao = new ClienteDaoImplement();
        listaClientes = clienteDao.listaClientes();
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    //</editor-fold>
    
    
    
    
}
