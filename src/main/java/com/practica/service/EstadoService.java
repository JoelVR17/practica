
package com.practica.service;

import com.practica.domain.Estado;
import java.util.List;

public interface EstadoService {
    
    public List<Estado> getEstado();
    
    public void save(Estado estado);
    
    public void delete(Estado estado);
    
    public Estado getEstado(Estado estado);
    
}
