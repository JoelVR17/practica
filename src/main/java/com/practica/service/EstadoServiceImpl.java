
package com.practica.service;

import com.practica.dao.EstadoDao;
import com.practica.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired 
    private EstadoDao estadoDao;
    
    @Override
    public List<Estado> getEstado() {
        
        return (List<Estado>) estadoDao.findAll();
    }

    @Override
    public void save(Estado estado) {
        
        estadoDao.save(estado);
    }

    @Override
    public void delete(Estado estado) {
       
        estadoDao.delete(estado);
    }

    @Override
    public Estado getEstado(Estado estado) {
        
        return estadoDao.findById(estado.getId_estado()).orElse(null);
    }
    
}