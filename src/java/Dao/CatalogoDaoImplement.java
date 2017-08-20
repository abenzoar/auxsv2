/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Catgenero;
import Model.Pais;
import Persistencia.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Abenzoar
 */
public class CatalogoDaoImplement implements CatalogoDao {

    @Override
    public List<Pais> listaPais() {
        Session session = null; 
        List<Pais> lista = null; 
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Pais u order by u.pais");
            lista = (List<Pais>) query.list();
            
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
    public List<Catgenero> listaGenero() {
        Session session = null; 
        List<Catgenero> lista = null; 
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Catgenero");
            lista = (List<Catgenero>) query.list();
            
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
    
}
