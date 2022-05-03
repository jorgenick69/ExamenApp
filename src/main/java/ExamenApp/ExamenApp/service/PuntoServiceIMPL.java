/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenApp.ExamenApp.service;

import ExamenApp.ExamenApp.entity.Punto;
import ExamenApp.ExamenApp.repository.PuntoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jorge
 */
@Service
public class PuntoServiceIMPL implements PuntoService {

    @Autowired
    private PuntoRepository pr;

    @Override
    public Punto createPunto(Punto punto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Transactional(readOnly = true)
    @Override
    public List<Punto> findAllPunto() {
        return (List<Punto>)pr.findAll();

    }

    @Transactional
    @Override
    public Punto savePunto(Punto punto) {
        return pr.save(punto);
    }

    @Transactional
    @Override
    public void deletePunto(Punto punto) {
        pr.delete(punto);
    }

    @Transactional(readOnly = true)
    @Override
    public Punto findPunto(Punto punto) {
        return pr.findById(punto.getId()).orElse(null);

    }

}
