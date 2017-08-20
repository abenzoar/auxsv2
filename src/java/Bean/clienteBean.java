/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Dao.ClienteDao;
import Dao.ClienteDaoImplement;
import Dao.CatalogoDao;
import Dao.CatalogoDaoImplement;
import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import Model.Cliente;
import Model.Pais;
import Model.Catgenero;
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
    //Variable para la entidad Cliente
    private Cliente cliente;    
    //Variable para la lista de Clientes
    private List<Cliente> listaClientes;
    //Variable para la lista de paises
    private List<Pais> listaPaises;
    //Variable para la lista de paises
    private List<Catgenero> listaGenero;
    
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
        cliente = new Cliente();
    }
    
    //Método para modificar el registro
    public void modificar(){
        ClienteDao clienteDao = new ClienteDaoImplement();
        clienteDao.modificarCliente(cliente);
        System.out.println("Cliente BEAN" + cliente);
        cliente = new Cliente();        
        getListaClientes();
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

    public List<Pais> getListaPaises() {
        CatalogoDao paisDao = new CatalogoDaoImplement();         
        listaPaises = paisDao.listaPais();
        return listaPaises;
    }

    public void setListaPaises(List<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }

    public List<Catgenero> getListaGenero() {
        CatalogoDao generoDao = new CatalogoDaoImplement();         
        listaGenero = generoDao.listaGenero();
        return listaGenero;
    }

    public void setListaGenero(List<Catgenero> listaGenero) {
        this.listaGenero = listaGenero;
    }

    
    //</editor-fold>
    
    
    
    
}
