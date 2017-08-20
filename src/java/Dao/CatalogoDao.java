/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Pais;
import Model.Catgenero;
import java.util.List;

/**
 *
 * @author Abenzoar
 */
public interface CatalogoDao {
        public List<Pais> listaPais();   
        public List<Catgenero> listaGenero();
                
}
