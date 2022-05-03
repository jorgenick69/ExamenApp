/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenApp.ExamenApp.service;

import ExamenApp.ExamenApp.entity.Respuesta;
import ExamenApp.ExamenApp.repository.RespuestaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jorge
 */
@Service
public class RespuestaServiceIMPL implements RespuestaService{
@Autowired
private RespuestaRepository rr;
    @Override
    public Respuesta createRespuesta(Respuesta respuesta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   @Transactional(readOnly = true)
    @Override
    public List<Respuesta> findAllRespuesta() {
    return (List<Respuesta>)rr.findAll();

    }
   @Transactional
    @Override
    public Respuesta saveRespuesta(Respuesta respuesta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   @Transactional
    @Override
    public void deleteRespuesta(Respuesta respuesta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   @Transactional(readOnly = true)
    @Override
    public Respuesta findRespuesta(Respuesta respuesta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
