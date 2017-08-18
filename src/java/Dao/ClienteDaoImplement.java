/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Cliente;
import Model.ClienteView;
import Persistencia.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Abenzoar
 */
public class ClienteDaoImplement implements ClienteDao {

    @Override
    public List<Cliente> listaClientes() {
        Session session = null; 
        List<Cliente> lista = null; 
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Cliente u");
            lista = (List<Cliente>) query.list();
            
        }
        catch (HibernateException e){
            //System.out.println(e.getMessage());
        }
        finally {
            if (session != null) {
                session.close();
            }
        }
        return lista;
    }

    @Override
    public void insertarCliente(Cliente cliente) {
        Session session = null; 
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(cliente);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            //System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void modificarCliente(Cliente cliente) {
        Session session = null; 
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(cliente);
            //System.out.println("Cliente " + cliente);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            //System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
}
