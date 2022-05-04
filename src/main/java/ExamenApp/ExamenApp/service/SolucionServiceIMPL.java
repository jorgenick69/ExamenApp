/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenApp.ExamenApp.service;

import ExamenApp.ExamenApp.entity.Solucion;
import ExamenApp.ExamenApp.repository.SolucionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jorge
 */
@Service
public class SolucionServiceIMPL implements SolucionService{
    @Autowired
    private SolucionRepository sr;

    @Override
    public Solucion createSolucion(Solucion solucion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  @Transactional(readOnly = true)
    @Override
    public List<Solucion> findAllSolucion() {
        return (List<Solucion>)sr.findAll();
    }
  @Transactional
    @Override
    public Solucion saveSolucion(Solucion solucion) {
       return sr.save(solucion);
    }
  @Transactional
    @Override
    public void deleteSolucion(Solucion solucion) {
      sr.delete(solucion);
    }
  @Transactional(readOnly = true)
    @Override
    public Solucion findSolucion(Solucion solucion) {
       return sr.findById(solucion.getId()).orElse(null);
    }
}
